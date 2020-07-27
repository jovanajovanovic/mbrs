package ${class.typePackage};

import uns.ftn.mbrs.model.${class.name};

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface ${class.name}Service{


	${class.name} findOne(Long id); 
	
	${class.name} save(${class.name} ${class.name?uncap_first});
		
	List<${class.name}> findAll();
	
	${class.name} remove(Long id);
	

	<#list properties as property>
		<#if property.name != "id" && property.name != "password" && property.upper == 1 && property.association == false>
	List<${class.name}> findBy${property.name?cap_first}(<#if property.type.name == "date"> Date <#else>${property.type.name} </#if> ${property.name});

		</#if>
		<#if property.association == true && property.upper == 1>
	List<${class.name}> findBy<#if property.name != "">${property.name?cap_first}<#else>${property.type.name}</#if>(Long id);

		</#if>
 	</#list>
}