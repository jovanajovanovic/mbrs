package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.FriendshipRequestNotification;


@Repository
public interface FriendshipRequestNotificationRepository extends JpaRepository<FriendshipRequestNotification, Long> {

	List<FriendshipRequestNotification> findByFriendshipRequestId(Long id);

}