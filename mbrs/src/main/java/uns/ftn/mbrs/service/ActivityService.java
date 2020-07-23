package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Activity;

public interface ActivityService extends CrudService<Activity> {

	List<Activity> findByDuration(double duration);

	List<Activity> findByDistance(double distance);

	List<Activity> findByDate(date date);

	List<Activity> findBySteps(Integer steps);

}