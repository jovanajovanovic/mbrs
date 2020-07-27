package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.FriendshipRequestNotification;


@Repository
public interface FriendshipRequestNotificationRepository extends JpaRepository<FriendshipRequestNotification, Long> {

	List<FriendshipRequestNotification> findByFriendshipRequest(Long id);

	List<FriendshipRequestNotification> findByUser(Long id);

	List<FriendshipRequestNotification> findByDescription(String  description);
	
	List<FriendshipRequestNotification> findByDate( Date  date);
	
	List<FriendshipRequestNotification> findByType(NotificationType  type);
	
}