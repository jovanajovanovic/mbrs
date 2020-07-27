package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.FriendshipRequestNotification;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface FriendshipRequestNotificationService{

	
	FriendshipRequestNotification findOne(Long id); 
	
	FriendshipRequestNotification save(FriendshipRequestNotification friendshipRequestNotification);
	
	List<FriendshipRequestNotification> findAll();
	

	List<FriendshipRequestNotification> findByFriendshipRequest(Long id);

	List<FriendshipRequestNotification> findByUser(Long id);

}