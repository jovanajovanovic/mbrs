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

	
	
}