package ${class.typePackage};


import java.util.ArrayList; 
<#list imports as i>
import ${i};
</#list>

public class ${class.name}DTO{
	private Long id;
	<#list properties as property>
	<#if property.upper == 1 >   
	  <#if property.association == true>
	     ${property.visibility} ${property.type.name}DTO <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>;
	  <#else>
	  	 ${property.visibility} ${property.type.name} ${property.name};
	  </#if>
	<#elseif property.upper == -1  > 
	  <#if property.association == true>
	     ${property.visibility} ArrayList<${property.type.name}DTO> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> = new ArrayList<${property.type.name}>();
	  <#else>
	  	 ${property.visibility} ArrayList<${property.type.name}> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> = new ArrayList<${property.type.name}>();
	  </#if>
	<#else>   
	    	<#list 1..property.upper as i>
         ${property.visibility} ${property.type.name} ${property.name}${i};
			</#list>  
	    </#if>   
		
	</#list>	
	
	
	
	public ${class.name}DTO(){}
	public ${class.name}DTO(Long id, <#list properties as property><#if property.upper == 1>
			this.id = id;
	  <#if property.association == true>
	 	${property.type.name}DTO <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if><#else> ${property.type.name} <#if property.name != "" >${property.name} <#else> ${property.type.name?uncap_first}</#if> </#if> <#elseif property.upper == -1 > <#if property.association == true>ArrayList<${property.type.name}DTO> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if><#else> ArrayList<${property.type.name}> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if></#if> <#else><#list 1..property.upper as i>${property.type.name} <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> ${i}<#if i < property.upper>,</#if></#list></#if><#if property_has_next>,</#if></#list>){
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
	public ${class.name}DTO(<#list properties as property><#if property.upper == 1>
	 <#if property.association == true>
	 	${property.type.name}DTO <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if><#else> ${property.type.name} <#if property.name != "" >${property.name} <#else> ${property.type.name?uncap_first}</#if> </#if> <#elseif property.upper == -1 > <#if property.association == true>ArrayList<${property.type.name}DTO> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if><#else> ArrayList<${property.type.name}> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if></#if> <#else><#list 1..property.upper as i>${property.type.name} <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if> ${i}<#if i < property.upper>,</#if></#list></#if><#if property_has_next>,</#if></#list>){
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
		<#if property.association == true>
	    public ${property.type.name}DTO get<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if> (){
	           return <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	      
	    public void ArrayList<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>(${property.type.name}DTO <#if property.name != "" > ${property.name} <#else> ${property.type.name}</#if>){
	           this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	    
	    <#else>
	    public ${property.type.name} get<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if> (){
	           return <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	      
	    public void set<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>(${property.type.name} <#if property.name != "" > ${property.name} <#else> ${property.type.name}</#if>){
	           this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	    	
	    </#if>
	      
	     
	    <#elseif property.upper == -1 >
	    <#if property.association == false>
	    public ArrayList<${property.type.name}> get<#if property.name != "" > ${property.name?cap_first} <#else> ${property.type.name}</#if>(){
	           return <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>;
	    }
	      
	    public void set<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>( ArrayList<${property.type.name}> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>){
	           this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	    <#else>
	     public ArrayList<${property.type.name}DTO> get<#if property.name != "" > ${property.name?cap_first} <#else> ${property.type.name}</#if>(){
	           return <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>;
	    }
	      
	    public void set<#if property.name != "" >${property.name?cap_first} <#else>${property.type.name}</#if>( ArrayList<${property.type.name}DTO> <#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>){
	           this.<#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if> = <#if property.name != "" >${property.name} <#else>${property.type.name?uncap_first}</#if>;
	    }
	    </#if>  
	    <#else>   
	    	<#list 1..property.upper as i>
	    public ${property.type.name} get<#if property.name != "" > ${property.name} <#else> ${property.type.name?uncap_first}</#if>${i}(){
	           return ${property.name}${i};
	    }
	      
	    public void ArrayList${property.name?cap_first}${i}(${property.type.name} ${property.name}${i}){
	           this.${property.name}${i} = ${property.name}${i};
	    }
	            
			</#list>  
	    </#if>     
	</#list>

}