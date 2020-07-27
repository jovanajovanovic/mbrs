package ${class.typePackage};
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
<#list imports as import>
import ${import};
</#list>


@Table(name="${class.name?uncap_first}")
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
		</#if>
	  <#else>
	     @Column<#if property.validation??>(<#if property.validation.unique?? >unique=<#if property.validation.unique==true>true<#else>false</#if></#if>, <#if property.validation.notNull?? >nullable=<#if property.validation.notNull==true>true<#else>false</#if></#if>)</#if>
	     <#if property.validation??> 
	     <#if property.validation.minLength??>@Length(min=${property.validation.minLength}, message="The field must be at least ${property.validation.minLength} characters")</#if>
	     <#if property.validation.maxLength??>@Length(max=${property.validation.maxLength}, message="The field muste be less than ${property.validation.maxLength} characters")</#if>
	     <#if property.validation.minValue?? >@Min(value=${property.validation.minValue})</#if>
	     <#if property.validation.maxValue??> @Max(value=${property.validation.maxValue})</#if>
	    </#if>
	    </#if>
	     ${property.visibility} <#if property.type.name == "date" > Date <#else>${property.type.name} </#if><#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>;
	 	
	 <#elseif property.upper == -1  > 
	     @OneToMany
	     ${property.visibility} Set<<#if property.type.name == "date" > Date <#else>${property.type.name} </#if>> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> = new HashSet<${property.type.name}>();
	 <#else>   
	    	<#list 1..property.upper as i>
         ${property.visibility}<#if property.type.name == "date" > Date <#else>${property.type.name} </#if> ${property.name}${i};
			</#list>  
	  </#if>     
	</#list>
	
		public ${class.name}(){}
		
		public ${class.name}(Long id, 
		<#list properties as property><#if property.upper == 1><#if property.type.name == "date" > Date <#else>${property.type.name} </#if>  <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if><#elseif property.upper == -1 >Set<<#if property.type.name == "date" > Date <#else>${property.type.name} </#if>> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if><#else><#list 1..property.upper as i>${property.type.name} ${property.name}${i}<#if i < property.upper>,</#if></#list></#if><#if property_has_next>,</#if></#list>
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
		
		public ${class.name}(<#list properties as property><#if property.upper == 1><#if property.type.name == "date" > Date <#else>${property.type.name} </#if> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> <#elseif property.upper == -1 >Set<<#if property.type.name == "date" > Date <#else>${property.type.name} </#if>> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> <#else><#list 1..property.upper as i>${property.type.name} <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> ${i}<#if i < property.upper>,</#if></#list></#if><#if property_has_next>,</#if></#list>){
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
	
		public void setId(Long id){
			this.id = id;
		}
	
	<#list properties as property>
		<#if property.upper == 1 >   
	    public <#if property.type.name == "date" > Date <#else>${property.type.name} </#if> get<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if> (){
	           return <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	      
	    public void set<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>(<#if property.type.name == "date" > Date <#else>${property.type.name} </#if> <#if property.name != "" > ${property.name} <#else> ${property.type.name}</#if>){
	           this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	      
	    <#elseif property.upper == -1 >
	    public Set<<#if property.type.name == "date" > Date <#else>${property.type.name} </#if>> get<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>(){
	           return <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>;
	    }
	      
	    public void set<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>( Set<<#if property.type.name == "date" > Date <#else>${property.type.name} </#if>> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>){
	           this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	      
	    <#else>   
	    	<#list 1..property.upper as i>
	    public <#if property.type.name == "date" > Date <#else>${property.type.name} </#if> get<#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>${i}(){
	           return ${property.name}${i};
	    }
	      
	    public void set${property.name?cap_first}${i}(<#if property.type.name == "date" > Date <#else>${property.type.name} </#if> ${property.name}${i}){
	           this.${property.name}${i} = ${property.name}${i};
	    }
	            
			</#list>  
	    </#if>     
	</#list>
	
	}
