package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.FriendshipRequest;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface FriendshipRequestService{


	FriendshipRequest findOne(Long id); 
	
	FriendshipRequest save(FriendshipRequest friendshipRequest);
		
	List<FriendshipRequest> findAll();
	
	FriendshipRequest remove(Long id);
	

	List<FriendshipRequest> findByStatus(FriendshipRequestStatus  status);

	List<FriendshipRequest> findByFriendshipRequestor(Long id);

	List<FriendshipRequest> findByFriendshipRequestee(Long id);

}