package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.ActivityRequest;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface ActivityRequestService{


	ActivityRequest findOne(Long id); 
	
	ActivityRequest save(ActivityRequest activityRequest);
		
	List<ActivityRequest> findAll();
	
	ActivityRequest remove(Long id);
	

	List<ActivityRequest> findByDate( Date  date);

	List<ActivityRequest> findByLocation(String  location);

	List<ActivityRequest> findByStatus(ActivityRequestStatus  status);

	List<ActivityRequest> findByActivityRequestor(Long id);

	List<ActivityRequest> findByActivityRequestee(Long id);

}