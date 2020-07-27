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
	public List<ActivityRequestNotification> findByActivityRequest(Long id) {
		return activityRequestNotificationRepository.findByActivityRequest(id);
	}
	
	@Override
	public List<ActivityRequestNotification> findByUser(Long id) {
		return activityRequestNotificationRepository.findByUser(id);
	}
	
}