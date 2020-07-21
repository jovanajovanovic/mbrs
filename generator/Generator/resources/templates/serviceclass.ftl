package ${class.typePackage};

import model.${class.name};

public interface ${class.name}Service extends CrudService<${class.name}> {

	<#list properties as property>
		<#if property.name != "id" && property.name != "password" && property.upper == 1 && property.association == false>
	List<${class.name}> findBy${property.name?cap_first}(${property.type.name} ${property.name});

		</#if>
		<#if property.association == true && property.upper == 1>
	List<${class.name}> findBy${property.type.name}Id(Long id);

		</#if>
 	</#list>
}