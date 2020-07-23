package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Goal;

public interface GoalService extends CrudService<Goal> {

	List<Goal> findByTitle(String title);

	List<Goal> findByDuration(double duration);

	List<Goal> findByDate(date date);

	List<Goal> findByDistance(double distance);

	List<Goal> findByAchieved(Boolean achieved);

}