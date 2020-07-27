package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.ActivityRequestNotification;
import uns.ftn.mbrs.dto.ActivityRequestNotificationDTO;
import uns.ftn.mbrs.service.ActivityRequestNotificationService;


import uns.ftn.mbrs.converter.ActivityRequestToActivityRequestDTO;
import uns.ftn.mbrs.converter.UserToUserDTO;

@Component
public class ActivityRequestNotificationToActivityRequestNotificationDTO implements Converter<ActivityRequestNotification, ActivityRequestNotificationDTO> {

	@Autowired
	private ActivityRequestToActivityRequestDTO toActivityRequestDTO;
	@Autowired
	private UserToUserDTO toUserDTO;

	@Override
	public ActivityRequestNotificationDTO convert(ActivityRequestNotification activityRequestNotification) {
		ActivityRequestNotificationDTO dto = new ActivityRequestNotificationDTO();
		
		dto.setId(activityRequestNotification.getId());
		if (activityRequestNotification.getActivityRequest() != null){
		dto.setActivityRequest(toActivityRequestDTO.convert(activityRequestNotification.getActivityRequest()));
		}		
		if (activityRequestNotification.getUser() != null){
		dto.setUser(toUserDTO.convert(activityRequestNotification.getUser()));
		}		
		dto.setDate(activityRequestNotification.getDate());

		dto.setType(activityRequestNotification.getType());

		dto.setDescription(activityRequestNotification.getDescription());

		return dto;
	}
	
	public List<ActivityRequestNotificationDTO> convert(List<ActivityRequestNotification> activityRequestNotificationList){
		List<ActivityRequestNotificationDTO> activityRequestNotificationDTOList = new ArrayList<>();
		
		for(ActivityRequestNotification activityRequestNotification : activityRequestNotificationList){
			activityRequestNotificationDTOList.add(convert(activityRequestNotification));
		}
		
		return activityRequestNotificationDTOList;
	}
}