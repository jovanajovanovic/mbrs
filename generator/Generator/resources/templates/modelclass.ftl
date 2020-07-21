package ${class.typePackage}.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name="${class.name?lower_case}")
@Entity
${class.visibility} class ${class.name} {  
<#list properties as property>
	<#if property.upper == 1 >   
	  @Column(name="${property.name?lower_case}")
      ${property.visibility} ${property.type} ${property.name};
    <#elseif property.upper == -1 > 
      @OneToMany(mappedBy="${class.name?uncap_first}")
      ${property.visibility} Set<${property.type}> ${property.name} = new HashSet<${property.type}>();
    <#else>   
    	<#list 1..property.upper as i>
      ${property.visibility} ${property.type} ${property.name}${i};
		</#list>  
    </#if>     
</#list>

	public ${class.name}(){}

<#list properties as property>
	<#if property.upper == 1 >   
      public ${property.type} get${property.name?cap_first}(){
           return ${property.name};
      }
      
      public void set${property.name?cap_first}(${property.type} ${property.name}){
           this.${property.name} = ${property.name};
      }
      
    <#elseif property.upper == -1 >
      public Set<${property.type}> get${property.name?cap_first}(){
           return ${property.name};
      }
      
      public void set${property.name?cap_first}( Set<${property.type}> ${property.name}){
           this.${property.name} = ${property.name};
      }
      
    <#else>   
    	<#list 1..property.upper as i>
      public ${property.type} get${property.name?cap_first}${i}(){
           return ${property.name}${i};
      }
      
      public void set${property.name?cap_first}${i}(${property.type} ${property.name}${i}){
           this.${property.name}${i} = ${property.name}${i};
      }
            
		</#list>  
    </#if>     
</#list>

}
