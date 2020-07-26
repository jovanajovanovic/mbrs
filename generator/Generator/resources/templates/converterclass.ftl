package ${class.typePackage};

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.${class.name};
import uns.ftn.mbrs.dto.${class.name}DTO;
import uns.ftn.mbrs.service.${class.name}Service;


<#list properties as property>
	<#if property.upper == 1 && property.association == true>  
import uns.ftn.mbrs.converter.${property.type.name}To${property.type.name}DTO;
	</#if>
</#list>

@Component
public class ${class.name}To${class.name}DTO implements Converter<${class.name}, ${class.name}DTO> {

	<#list properties as property>
		<#if property.upper == 1 && property.association == true>   
	@Autowired
	private ${property.type.name}To${property.type.name}DTO to<#if property.name == "">${property.type.name}<#else>${property.name}</#if>DTO;
		</#if>
	</#list>

	@Override
	public ${class.name}DTO convert(${class.name} ${class.name?uncap_first}) {
		${class.name}DTO dto = new ${class.name}DTO();
		
		dto.setId(${class.name?uncap_first}.getId());
		<#list properties as property>
			<#if property.upper == 1 >
				<#if property.association == false>
		dto.set${property.name?cap_first}(${class.name?uncap_first}.get${property.name?cap_first}());
				<#else>
		if (${class.name?uncap_first}.get<#if property.name!="">${property.name?cap_first}<#else>${property.type.name}</#if>() != null){
		dto.set<#if property.name!="">${property.name?cap_first}<#else>${property.type.name}</#if>(to<#if property.name == "">${property.type.name}<#else>${property.name}</#if>DTO.convert(${class.name?uncap_first}.get<#if property.name == "">${property.type.name}<#else>${property.name?cap_first}</#if>()));
		}		</#if>
			</#if>
		</#list>
		return dto;
	}
	
	public List<${class.name}DTO> convert(List<${class.name}> ${class.name?uncap_first}List){
		List<${class.name}DTO> ${class.name?uncap_first}DTOList = new ArrayList<>();
		
		for(${class.name} ${class.name?uncap_first} : ${class.name?uncap_first}List){
			${class.name?uncap_first}DTOList.add(convert(${class.name?uncap_first}));
		}
		
		return ${class.name?uncap_first}DTOList;
	}
}