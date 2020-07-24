package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.ActivityRequestNotification;

public interface ActivityRequestNotificationService extends CrudService<ActivityRequestNotification> {

	List<ActivityRequestNotification> findByActivityRequestId(Long id);

	List<ActivityRequestNotification> findByUserId(Long id);

	List<ActivityRequestNotification> findByDescription(String description);

	List<ActivityRequestNotification> findByDate(date date);

	List<ActivityRequestNotification> findByType(NotificationType type);

}