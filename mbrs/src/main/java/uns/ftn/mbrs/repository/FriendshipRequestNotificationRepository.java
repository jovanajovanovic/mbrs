package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.FriendshipRequestNotification;


@Repository
public interface FriendshipRequestNotificationRepository extends JpaRepository<FriendshipRequestNotification, Long> {

	List<FriendshipRequestNotification> findByFriendshipRequestId(Long id);

	List<FriendshipRequestNotification> findByUserId(Long id);

	List<FriendshipRequestNotification> findByDescription(String description);
	
	List<FriendshipRequestNotification> findByDate(date date);
	
	List<FriendshipRequestNotification> findByType(NotificationType type);
	
}