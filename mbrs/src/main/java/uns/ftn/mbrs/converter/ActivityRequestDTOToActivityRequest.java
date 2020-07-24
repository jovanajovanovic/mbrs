package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.ActivityRequest;
import uns.ftn.mbrs.dto.ActivityRequestDTO;
import uns.ftn.mbrs.service.ActivityRequestService;

@Component
public class ActivityRequestDTOToActivityRequest implements Converter<ActivityRequestDTO, ActivityRequest>{

	@Autowired
	private UserDTOToUser toUser;
	@Autowired
	private UserDTOToUser toUser;
	
	@Autowired
	ActivityRequestService activityRequestService;
	
	@Override
	public ActivityRequest convert(ActivityRequestDTO dto){
		ActivityRequest activityRequest = new ActivityRequest();
		
		if (dto.getId() != null) {
			activityRequest = activityRequestService.findOne(dto.getId());
			
			if(activityRequest == null){
				throw new IllegalStateException("activityRequest not exists in db");
			}
		}
		
		activityRequest.setId(dto.getId());
		
		activityRequest.setDate(dto.getDate());
		activityRequest.setLocation(dto.getLocation());
		activityRequest.setStatus(dto.getStatus());
		activityRequest.setUser(toUser.convert(dto.getUser()));
		activityRequest.setUser(toUser.convert(dto.getUser()));
		
		return activityRequest;
	}
	
	public List<ActivityRequest> convert (List<ActivityRequestDTO> activityRequestDTOList){
		List<ActivityRequest> activityRequestList = new ArrayList<>();
		
		for(ActivityRequestDTO dto : activityRequestDTOList){
			activityRequestList.add(convert(dto));
		}
		
		return activityRequestList;
	}
	
	
}