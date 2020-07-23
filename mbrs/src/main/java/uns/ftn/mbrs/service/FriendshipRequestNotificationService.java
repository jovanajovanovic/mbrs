package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.FriendshipRequestNotification;

public interface FriendshipRequestNotificationService extends CrudService<FriendshipRequestNotification> {

	List<FriendshipRequestNotification> findByFriendshipRequestId(Long id);

}