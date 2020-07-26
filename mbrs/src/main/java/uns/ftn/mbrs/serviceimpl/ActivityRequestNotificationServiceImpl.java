package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.ActivityRequestNotification;
import uns.ftn.mbrs.repository.ActivityRequestNotificationRepository;
import uns.ftn.mbrs.service.ActivityRequestNotificationService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class ActivityRequestNotificationServiceImpl implements ActivityRequestNotificationService {

	@Autowired
	private ActivityRequestNotificationRepository activityRequestNotificationRepository;
	
	@Override
	public ActivityRequestNotification findOne(Long id) {
		return activityRequestNotificationRepository.findById(id).get();
	}

	@Override
	public List<ActivityRequestNotification> findAll() {
		return activityRequestNotificationRepository.findAll();
	}

	@Override
	public ActivityRequestNotification save(ActivityRequestNotification activityRequestNotification) {
		return activityRequestNotificationRepository.save(activityRequestNotification);
	}
	
	@Override
	public ActivityRequestNotification remove(Long id) {
		ActivityRequestNotification activityRequestNotification = activityRequestNotificationRepository.findById(id).get();
		if(activityRequestNotification == null){
			throw new IllegalArgumentException("Tried to delete non-existant ActivityRequestNotification");
		}
		activityRequestNotificationRepository.delete(activityRequestNotification);
		return activityRequestNotification;
	}
	
	@Override
	public List<ActivityRequestNotification> findByActivityRequest(Long id) {
		return activityRequestNotificationRepository.findByActivityRequest(id);
	}
	
	@Override
	public List<ActivityRequestNotification> findByUser(Long id) {
		return activityRequestNotificationRepository.findByUser(id);
	}
	
	@Override
	public List<ActivityRequestNotification> findByDescription(String  description) {
		return activityRequestNotificationRepository.findByDescription(description);
	}
	
	@Override
	public List<ActivityRequestNotification> findByDate( Date  date) {
		return activityRequestNotificationRepository.findByDate(date);
	}
	
	@Override
	public List<ActivityRequestNotification> findByType(NotificationType  type) {
		return activityRequestNotificationRepository.findByType(type);
	}
	
}