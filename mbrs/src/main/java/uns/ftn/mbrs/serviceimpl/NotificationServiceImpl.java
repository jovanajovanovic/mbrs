package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Notification;
import uns.ftn.mbrs.repository.NotificationRepository;
import uns.ftn.mbrs.service.NotificationService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	
	@Override
	public Notification findOne(Long id) {
		return notificationRepository.findById(id).get();
	}

	@Override
	public List<Notification> findAll() {
		return notificationRepository.findAll();
	}

	@Override
	public Notification save(Notification notification) {
		return notificationRepository.save(notification);
	}
	
	@Override
	public Notification remove(Long id) {
		Notification notification = notificationRepository.findById(id).get();
		if(notification == null){
			throw new IllegalArgumentException("Tried to delete non-existant Notification");
		}
		notificationRepository.delete(notification);
		return notification;
	}
	
	@Override
	public List<Notification> findByDescription(String  description) {
		return notificationRepository.findByDescription(description);
	}
	
	@Override
	public List<Notification> findByDate( Date  date) {
		return notificationRepository.findByDate(date);
	}
	
	@Override
	public List<Notification> findByType(NotificationType  type) {
		return notificationRepository.findByType(type);
	}
	
}