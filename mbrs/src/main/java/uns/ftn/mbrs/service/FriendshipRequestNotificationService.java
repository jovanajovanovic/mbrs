package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.FriendshipRequestNotification;

public interface FriendshipRequestNotificationService extends CrudService<FriendshipRequestNotification> {

	List<FriendshipRequestNotification> findByFriendshipRequestId(Long id);

	List<FriendshipRequestNotification> findByUserId(Long id);

	List<FriendshipRequestNotification> findByDescription(String description);

	List<FriendshipRequestNotification> findByDate(date date);

	List<FriendshipRequestNotification> findByType(NotificationType type);

}