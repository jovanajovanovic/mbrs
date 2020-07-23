package uns.ftn.mbrs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Goal;
import uns.ftn.mbrs.repository.GoalRepository;
import uns.ftn.mbrs.service.GoalService;


@Service
@Transactional
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	@Override
	public Goal findOne(Long id) {
		return goalRepository.findOne(id);
	}

	@Override
	public List<Goal> findAll() {
		return goalRepository.findAll();
	}

	@Override
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}
	
	public Goal remove(Long id) {
		Goal goal = goalRepository.findOne(id);
		if(goal == null){
			throw new IllegalArgumentException("Tried to delete non-existant Goal");
		}
		goalRepository.delete(goal);
		return goal;
	}
	
	public List<Goal> findByTitle(String title) {
		return goalRepository.findByTitle(title);
	}
	
	public List<Goal> findByDuration(double duration) {
		return goalRepository.findByDuration(duration);
	}
	
	public List<Goal> findByDate(date date) {
		return goalRepository.findByDate(date);
	}
	
	public List<Goal> findByDistance(double distance) {
		return goalRepository.findByDistance(distance);
	}
	
	public List<Goal> findByAchieved(Boolean achieved) {
		return goalRepository.findByAchieved(achieved);
	}
	
}