package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.Activity;
import uns.ftn.mbrs.dto.ActivityDTO;
import uns.ftn.mbrs.service.ActivityService;



@Component
public class ActivityToActivityDTO implements Converter<Activity, ActivityDTO> {


	@Override
	public ActivityDTO convert(Activity activity) {
		ActivityDTO dto = new ActivityDTO();
		
		dto.setId(activity.getId());
		dto.setDuration(activity.getDuration());

		dto.setDistance(activity.getDistance());

		dto.setDate(activity.getDate());

		dto.setSteps(activity.getSteps());

		return dto;
	}
	
	public List<ActivityDTO> convert(List<Activity> activityList){
		List<ActivityDTO> activityDTOList = new ArrayList<>();
		
		for(Activity activity : activityList){
			activityDTOList.add(convert(activity));
		}
		
		return activityDTOList;
	}
}