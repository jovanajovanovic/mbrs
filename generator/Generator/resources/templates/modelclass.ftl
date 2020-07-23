package ${class.typePackage};
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

<#list imports as import>
<#if import.typePackage != "" && import.typePackage=="Data">
import ${class.typePackage}.${import.name};
</#if>
</#list>



@Entity
${class.visibility} class ${class.name} {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
<#list properties as property>
	<#if property.upper == 1 >   
	  <#if property.association==true>
	  	<#if property.aggregationKind =="shared" || property.aggregationKind =="composite" >
	  	 @OneToOne
	  	<#else>
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="${property.type.name?uncap_first}_id", referencedColumnName="id")
	  	</#if>
	  	<#else>
	     @Column
	    </#if>
	     ${property.visibility} ${property.type.name} <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>;
	 <#elseif property.upper == -1  > 
	     @OneToMany(mappedBy="${class.name?uncap_first}")
	     ${property.visibility} Set<${property.type.name}> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> = new HashSet<${property.type.name}>();
	 <#else>   
	    	<#list 1..property.upper as i>
         ${property.visibility} ${property.type.name} ${property.name}${i};
			</#list>  
	    </#if>     
	</#list>
	
		public ${class.name}(){}
		
		public ${class.name}(Long id, 
		<#list properties as property><#if property.upper == 1>${property.type.name}  <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if><#elseif property.upper == -1 >Set<${property.type.name}> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if><#else><#list 1..property.upper as i>${property.type.name} ${property.name}${i}<#if i < property.upper>,</#if></#list></#if><#if property_has_next>,</#if></#list>
		){
			this.id = id; 
		<#list properties as property>
		<#if property.upper == 1>
			this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>;
		<#elseif property.upper == -1 >
			this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>  = <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> ;
		<#else>
			<#list 1..property.upper as i>
			this.${property.name}${i} = ${property.name}${i};
			</#list>
		</#if>
		</#list>
		}
		
		public ${class.name}(<#list properties as property><#if property.upper == 1>${property.type.name} <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> <#elseif property.upper == -1 >Set<${property.type.name}> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> <#else><#list 1..property.upper as i>${property.type.name} <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> ${i}<#if i < property.upper>,</#if></#list></#if><#if property_has_next>,</#if></#list>){
		<#list properties as property>
		<#if property.upper == 1>
			this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>  =<#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> ;
		<#elseif property.upper == -1 >
			this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>  = <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> ;
		<#else>
			<#list 1..property.upper as i>
			this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> ${i} =<#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> ${i};
			</#list>
		</#if>
		</#list>
		}
		
		public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	<#list properties as property>
		<#if property.upper == 1 >   
	    public ${property.type.name} get<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if> (){
	           return <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	      
	    public void set<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>(${property.type.name} <#if property.name != "" > ${property.name} <#else> ${property.type.name}</#if>){
	           this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	      
	    <#elseif property.upper == -1 >
	    public Set<${property.type.name}> get<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>(){
	           return <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>;
	    }
	      
	    public void set<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>( Set<${property.type.name}> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>){
	           this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	      
	    <#else>   
	    	<#list 1..property.upper as i>
	    public ${property.type.name} get<#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>${i}(){
	           return ${property.name}${i};
	    }
	      
	    public void set${property.name?cap_first}${i}(${property.type.name} ${property.name}${i}){
	           this.${property.name}${i} = ${property.name}${i};
	    }
	            
			</#list>  
	    </#if>     
	</#list>
	
	}
