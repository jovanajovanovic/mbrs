package ${class.typePackage};

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.${class.name};
import uns.ftn.mbrs.dto.${class.name}DTO;
import uns.ftn.mbrs.service.${class.name}Service;

@Component
public class ${class.name}DTOTo${class.name} implements Converter<${class.name}DTO, ${class.name}>{

	<#list properties as property>
	<#if property.upper == 1 && property.association == true>
	@Autowired
	private ${property.type.name}DTOTo${property.type.name} to${property.type.name};
	</#if>
	</#list>
	
	@Autowired
	${class.name}Service ${class.name?uncap_first}Service;
	
	@Override
	public ${class.name} convert(${class.name}DTO dto){
		${class.name} ${class.name?uncap_first} = new ${class.name}();
		
		if (dto.getId() != null) {
			${class.name?uncap_first} = ${class.name?uncap_first}Service.findOne(dto.getId());
			
			if(${class.name?uncap_first} == null){
				throw new IllegalStateException("${class.name?uncap_first} not exists in db");
			}
		}
		
		${class.name?uncap_first}.setId(dto.getId());
		
		<#list properties as property>
			<#if property.upper == 1>
				<#if property.association == false>
		${class.name?uncap_first}.set${property.name?cap_first}(dto.get${property.name?cap_first}());
				<#else>
		${class.name?uncap_first}.set${property.type.name}(to${property.type.name}.convert(dto.get${property.type.name}()));
				</#if>
			</#if>		
		</#list>
		
		return ${class.name?uncap_first};
	}
	
	public List<${class.name}> convert (List<${class.name}DTO> ${class.name?uncap_first}DTOList){
		List<${class.name}> ${class.name?uncap_first}List = new ArrayList<>();
		
		for(${class.name}DTO dto : ${class.name?uncap_first}DTOList){
			${class.name?uncap_first}List.add(convert(dto));
		}
		
		return ${class.name?uncap_first}List;
	}
	
	
}