package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.Goal;


@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {

	List<Goal> findByTitle(String title);
	
	List<Goal> findByDuration(double duration);
	
	List<Goal> findByDate(date date);
	
	List<Goal> findByDistance(double distance);
	
	List<Goal> findByAchieved(Boolean achieved);
	
}