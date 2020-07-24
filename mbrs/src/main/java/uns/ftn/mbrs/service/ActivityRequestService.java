package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.ActivityRequest;

public interface ActivityRequestService extends CrudService<ActivityRequest> {

	List<ActivityRequest> findByDate(date date);

	List<ActivityRequest> findByLocation(String location);

	List<ActivityRequest> findByStatus(ActivityRequestStatus status);

	List<ActivityRequest> findByUserId(Long id);

	List<ActivityRequest> findByUserId(Long id);

}