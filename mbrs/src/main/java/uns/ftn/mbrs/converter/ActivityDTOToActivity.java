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
public class ActivityDTOToActivity implements Converter<ActivityDTO, Activity>{

	
	@Autowired
	ActivityService activityService;
	
	@Override
	public Activity convert(ActivityDTO dto){
		Activity activity = new Activity();
		
		if (dto.getId() != null) {
			activity = activityService.findOne(dto.getId());
			
			if(activity == null){
				throw new IllegalStateException("activity not exists in db");
			}
		}
		
		activity.setId(dto.getId());
		
		activity.setDuration(dto.getDuration());
		activity.setDistance(dto.getDistance());
		activity.setDate(dto.getDate());
		activity.setSteps(dto.getSteps());
		
		return activity;
	}
	
	public List<Activity> convert (List<ActivityDTO> activityDTOList){
		List<Activity> activityList = new ArrayList<>();
		
		for(ActivityDTO dto : activityDTOList){
			activityList.add(convert(dto));
		}
		
		return activityList;
	}
	
	
}