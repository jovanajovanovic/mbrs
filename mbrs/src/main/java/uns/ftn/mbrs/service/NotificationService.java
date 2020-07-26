package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Notification;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface NotificationService{


	Notification findOne(Long id); 
	
	Notification save(Notification notification);
		
	List<Notification> findAll();
	
	Notification remove(Long id);
	

	List<Notification> findByDescription(String  description);

	List<Notification> findByDate( Date  date);

	List<Notification> findByType(NotificationType  type);

}