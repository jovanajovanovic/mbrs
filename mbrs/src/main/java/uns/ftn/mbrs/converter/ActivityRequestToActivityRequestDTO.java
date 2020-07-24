package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.ActivityRequest;
import uns.ftn.mbrs.dto.ActivityRequestDTO;
import uns.ftn.mbrs.service.ActivityRequestService;


import uns.ftn.mbrs.converter.UserToUserDTO;
import uns.ftn.mbrs.converter.UserToUserDTO;

@Component
public class ActivityRequestToActivityRequestDTO implements Converter<ActivityRequest, ActivityRequestDTO> {

	@Autowired
	private UserToUserDTO toUserDTO;
	@Autowired
	private UserToUserDTO toUserDTO;

	@Override
	public ActivityRequestDTO convert(ActivityRequest activityRequest) {
		ActivityRequestDTO dto = new ActivityRequestDTO();
		
		dto.setId(activityRequest.getId());
		dto.setDate(activityRequest.getDate());
		dto.setLocation(activityRequest.getLocation());
		dto.setStatus(activityRequest.getStatus());
		dto.setUser(toUserDTO.convert(activityRequest.getUser()));
		dto.setUser(toUserDTO.convert(activityRequest.getUser()));
		return dto;
	}
	
	public List<ActivityRequestDTO> convert(List<ActivityRequest> activityRequestList){
		List<ActivityRequestDTO> activityRequestDTOList = new ArrayList<>();
		
		for(ActivityRequest activityRequest : activityRequestList){
			activityRequestDTOList.add(convert(activityRequest));
		}
		
		return activityRequestDTOList;
	}
}