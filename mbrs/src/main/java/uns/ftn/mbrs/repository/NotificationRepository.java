package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.Notification;


@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

	List<Notification> findByDescription(String  description);
	
	List<Notification> findByDate( Date  date);
	
	List<Notification> findByType(NotificationType  type);
	
}