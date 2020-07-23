package ${class.typePackage};

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.${class.name};


@Repository
public interface ${class.name}Repository extends JpaRepository<${class.name}, Long> {

	<#list properties as property>
		<#if property.name != "id" && property.name != "password" && property.upper == 1 && property.association == false>
	List<${class.name}> findBy${property.name?cap_first}(${property.type.name} ${property.name});
	
		</#if>
		<#if property.association == true && property.upper == 1>
	List<${class.name}> findBy${property.type.name}Id(Long id);

		</#if>
 	</#list>
}