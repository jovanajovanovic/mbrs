package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.ActivityRequestNotification;
import uns.ftn.mbrs.repository.ActivityRequestNotificationRepository;
import uns.ftn.mbrs.service.ActivityRequestNotificationService;


@Service
@Transactional
public class ActivityRequestNotificationServiceImpl implements ActivityRequestNotificationService {

	@Autowired
	private ActivityRequestNotificationRepository activityRequestNotificationRepository;
	
	@Override
	public ActivityRequestNotification findOne(Long id) {
		return activityRequestNotificationRepository.findOne(id);
	}

	@Override
	public List<ActivityRequestNotification> findAll() {
		return activityRequestNotificationRepository.findAll();
	}

	@Override
	public ActivityRequestNotification save(ActivityRequestNotification activityRequestNotification) {
		return activityRequestNotificationRepository.save(activityRequestNotification);
	}
	
	public ActivityRequestNotification remove(Long id) {
		ActivityRequestNotification activityRequestNotification = activityRequestNotificationRepository.findOne(id);
		if(activityRequestNotification == null){
			throw new IllegalArgumentException("Tried to delete non-existant ActivityRequestNotification");
		}
		activityRequestNotificationRepository.delete(activityRequestNotification);
		return activityRequestNotification;
	}
	
	public List<ActivityRequestNotification> findByActivityRequestId(Long id) {
		return activityRequestNotificationRepository.findByActivityRequestId(id);
	}
	
	public List<ActivityRequestNotification> findByUserId(Long id) {
		return activityRequestNotificationRepository.findByUserId(id);
	}
	
	public List<ActivityRequestNotification> findByDescription(String description) {
		return activityRequestNotificationRepository.findByDescription(description);
	}
	
	public List<ActivityRequestNotification> findByDate(date date) {
		return activityRequestNotificationRepository.findByDate(date);
	}
	
	public List<ActivityRequestNotification> findByType(NotificationType type) {
		return activityRequestNotificationRepository.findByType(type);
	}
	
}