package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.ActivityRequestNotification;
import uns.ftn.mbrs.dto.ActivityRequestNotificationDTO;
import uns.ftn.mbrs.service.ActivityRequestNotificationService;

@Component
public class ActivityRequestNotificationDTOToActivityRequestNotification implements Converter<ActivityRequestNotificationDTO, ActivityRequestNotification>{

	@Autowired
	private ActivityRequestDTOToActivityRequest toActivityRequest;
	@Autowired
	private UserDTOToUser toUser;
	
	@Autowired
	ActivityRequestNotificationService activityRequestNotificationService;
	
	@Override
	public ActivityRequestNotification convert(ActivityRequestNotificationDTO dto){
		ActivityRequestNotification activityRequestNotification = new ActivityRequestNotification();
		
		if (dto.getId() != null) {
			activityRequestNotification = activityRequestNotificationService.findOne(dto.getId());
			
			if(activityRequestNotification == null){
				throw new IllegalStateException("activityRequestNotification not exists in db");
			}
		}
		
		activityRequestNotification.setId(dto.getId());
		
		activityRequestNotification.setActivityRequest(toActivityRequest.convert(dto.getActivityRequest()));
		activityRequestNotification.setUser(toUser.convert(dto.getUser()));
		activityRequestNotification.setDescription(dto.getDescription());
		activityRequestNotification.setDate(dto.getDate());
		activityRequestNotification.setType(dto.getType());
		
		return activityRequestNotification;
	}
	
	public List<ActivityRequestNotification> convert (List<ActivityRequestNotificationDTO> activityRequestNotificationDTOList){
		List<ActivityRequestNotification> activityRequestNotificationList = new ArrayList<>();
		
		for(ActivityRequestNotificationDTO dto : activityRequestNotificationDTOList){
			activityRequestNotificationList.add(convert(dto));
		}
		
		return activityRequestNotificationList;
	}
	
	
}