package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.Notification;


@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

	List<Notification> findByDescription(String description);
	
	List<Notification> findByDate(date date);
	
	List<Notification> findByType(NotificationType type);
	
	List<Notification> findByUserId(Long id);

}