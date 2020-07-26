package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Goal;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface GoalService{


	Goal findOne(Long id); 
	
	Goal save(Goal goal);
		
	List<Goal> findAll();
	
	Goal remove(Long id);
	

	List<Goal> findByTitle(String  title);

	List<Goal> findByDuration(double  duration);

	List<Goal> findByDate( Date  date);

	List<Goal> findByDistance(double  distance);

	List<Goal> findByAchieved(Boolean  achieved);

}