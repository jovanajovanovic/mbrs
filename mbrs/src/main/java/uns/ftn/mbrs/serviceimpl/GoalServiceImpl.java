package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Goal;
import uns.ftn.mbrs.repository.GoalRepository;
import uns.ftn.mbrs.service.GoalService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	@Override
	public Goal findOne(Long id) {
		return goalRepository.findById(id).get();
	}

	@Override
	public List<Goal> findAll() {
		return goalRepository.findAll();
	}

	@Override
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}
	
	@Override
	public Goal remove(Long id) {
		Goal goal = goalRepository.findById(id).get();
		if(goal == null){
			throw new IllegalArgumentException("Tried to delete non-existant Goal");
		}
		goalRepository.delete(goal);
		return goal;
	}
	
	@Override
	public List<Goal> findByTitle(String  title) {
		return goalRepository.findByTitle(title);
	}
	
	@Override
	public List<Goal> findByDuration(double  duration) {
		return goalRepository.findByDuration(duration);
	}
	
	@Override
	public List<Goal> findByDate( Date  date) {
		return goalRepository.findByDate(date);
	}
	
	@Override
	public List<Goal> findByDistance(double  distance) {
		return goalRepository.findByDistance(distance);
	}
	
	@Override
	public List<Goal> findByAchieved(Boolean  achieved) {
		return goalRepository.findByAchieved(achieved);
	}
	
}