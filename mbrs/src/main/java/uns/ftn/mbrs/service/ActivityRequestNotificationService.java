package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.ActivityRequestNotification;

public interface ActivityRequestNotificationService extends CrudService<ActivityRequestNotification> {

	List<ActivityRequestNotification> findByActivityRequestId(Long id);

}