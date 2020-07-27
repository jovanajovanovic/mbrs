package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.ActivityRequestNotification;


@Repository
public interface ActivityRequestNotificationRepository extends JpaRepository<ActivityRequestNotification, Long> {

	List<ActivityRequestNotification> findByActivityRequest(Long id);

	List<ActivityRequestNotification> findByUser(Long id);

	List<ActivityRequestNotification> findByDate( Date  date);
	
	List<ActivityRequestNotification> findByType(NotificationType  type);
	
	List<ActivityRequestNotification> findByDescription(String  description);
	
}