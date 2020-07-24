package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Notification;

public interface NotificationService extends CrudService<Notification> {

	List<Notification> findByDescription(String description);

	List<Notification> findByDate(date date);

	List<Notification> findByType(NotificationType type);

}