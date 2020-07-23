package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.Activity;


@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

	List<Activity> findByDuration(double duration);
	
	List<Activity> findByDistance(double distance);
	
	List<Activity> findByDate(date date);
	
	List<Activity> findBySteps(Integer steps);
	
}