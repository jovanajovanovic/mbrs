package ${class.typePackage};

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.${class.name};


@Repository
public interface ${class.name}Repository extends JpaRepository<${class.name}, Long> {

	<#list properties as property>
		<#if property.name != "id" && property.name != "password" && property.upper == 1 && property.association == false>
	List<${class.name}> findBy${property.name?cap_first}(<#if property.type.name == "date"> Date <#else>${property.type.name} </#if> ${property.name});
	
		</#if>
		<#if property.association == true && property.upper == 1>
	List<${class.name}> findBy<#if property.name != "">${property.name?cap_first}<#else>${property.type.name}</#if>(Long id);

		</#if>
 	</#list>
}