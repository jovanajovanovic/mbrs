package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Activity;
import uns.ftn.mbrs.repository.ActivityRepository;
import uns.ftn.mbrs.service.ActivityService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityRepository activityRepository;
	
	@Override
	public Activity findOne(Long id) {
		return activityRepository.findById(id).get();
	}

	@Override
	public List<Activity> findAll() {
		return activityRepository.findAll();
	}

	@Override
	public Activity save(Activity activity) {
		return activityRepository.save(activity);
	}
	
	@Override
	public Activity remove(Long id) {
		Activity activity = activityRepository.findById(id).get();
		if(activity == null){
			throw new IllegalArgumentException("Tried to delete non-existant Activity");
		}
		activityRepository.delete(activity);
		return activity;
	}
	
	@Override
	public List<Activity> findByDuration(double  duration) {
		return activityRepository.findByDuration(duration);
	}
	
	@Override
	public List<Activity> findByDistance(double  distance) {
		return activityRepository.findByDistance(distance);
	}
	
	@Override
	public List<Activity> findByDate( Date  date) {
		return activityRepository.findByDate(date);
	}
	
	@Override
	public List<Activity> findBySteps(Integer  steps) {
		return activityRepository.findBySteps(steps);
	}
	
}