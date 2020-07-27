package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.ActivityRequestNotification;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface ActivityRequestNotificationService{


	ActivityRequestNotification findOne(Long id); 
	
	ActivityRequestNotification save(ActivityRequestNotification activityRequestNotification);
		
	List<ActivityRequestNotification> findAll();
	
	ActivityRequestNotification remove(Long id);
	

	List<ActivityRequestNotification> findByActivityRequest(Long id);

	List<ActivityRequestNotification> findByUser(Long id);

	List<ActivityRequestNotification> findByDate( Date  date);

	List<ActivityRequestNotification> findByType(NotificationType  type);

	List<ActivityRequestNotification> findByDescription(String  description);

}