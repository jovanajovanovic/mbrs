package uns.ftn.mbrs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Activity;
import uns.ftn.mbrs.repository.ActivityRepository;
import uns.ftn.mbrs.service.ActivityService;


@Service
@Transactional
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityRepository activityRepository;
	
	@Override
	public Activity findOne(Long id) {
		return activityRepository.findOne(id);
	}

	@Override
	public List<Activity> findAll() {
		return activityRepository.findAll();
	}

	@Override
	public Activity save(Activity activity) {
		return activityRepository.save(activity);
	}
	
	public Activity remove(Long id) {
		Activity activity = activityRepository.findOne(id);
		if(activity == null){
			throw new IllegalArgumentException("Tried to delete non-existant Activity");
		}
		activityRepository.delete(activity);
		return activity;
	}
	
	public List<Activity> findByDuration(double duration) {
		return activityRepository.findByDuration(duration);
	}
	
	public List<Activity> findByDistance(double distance) {
		return activityRepository.findByDistance(distance);
	}
	
	public List<Activity> findByDate(date date) {
		return activityRepository.findByDate(date);
	}
	
	public List<Activity> findBySteps(Integer steps) {
		return activityRepository.findBySteps(steps);
	}
	
}