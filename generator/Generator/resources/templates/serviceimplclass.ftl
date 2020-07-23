package ${class.typePackage};

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.${class.name};
import uns.ftn.mbrs.repository.${class.name}Repository;
import uns.ftn.mbrs.service.${class.name}Service;


@Service
@Transactional
public class ${class.name}ServiceImpl implements ${class.name}Service {

	@Autowired
	private ${class.name}Repository ${class.name?uncap_first}Repository;
	
	@Override
	public ${class.name} findOne(Long id) {
		return ${class.name?uncap_first}Repository.findOne(id);
	}

	@Override
	public List<${class.name}> findAll() {
		return ${class.name?uncap_first}Repository.findAll();
	}

	@Override
	public ${class.name} save(${class.name} ${class.name?uncap_first}) {
		return ${class.name?uncap_first}Repository.save(${class.name?uncap_first});
	}
	
	public ${class.name} remove(Long id) {
		${class.name} ${class.name?uncap_first} = ${class.name?uncap_first}Repository.findOne(id);
		if(${class.name?uncap_first} == null){
			throw new IllegalArgumentException("Tried to delete non-existant ${class.name}");
		}
		${class.name?uncap_first}Repository.delete(${class.name?uncap_first});
		return ${class.name?uncap_first};
	}
	
	<#list properties as property>
		<#if property.name != "id" && property.name != "password" && property.upper == 1 && property.association == false>
	public List<${class.name}> findBy${property.name?cap_first}(${property.type.name} ${property.name}) {
		return ${class.name?uncap_first}Repository.findBy${property.name?cap_first}(${property.name});
	}
	
		</#if>
		<#if property.association == true && property.upper == 1>
	public List<${class.name}> findBy${property.type.name}Id(Long id) {
		return ${class.name?uncap_first}Repository.findBy${property.type.name}Id(id);
	}
	
		</#if>
 	</#list>
}