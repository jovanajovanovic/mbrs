package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.FriendshipRequestNotification;
import uns.ftn.mbrs.repository.FriendshipRequestNotificationRepository;
import uns.ftn.mbrs.service.FriendshipRequestNotificationService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class FriendshipRequestNotificationServiceImpl implements FriendshipRequestNotificationService {

	@Autowired
	private FriendshipRequestNotificationRepository friendshipRequestNotificationRepository;
	
	@Override
	public FriendshipRequestNotification findOne(Long id) {
		return friendshipRequestNotificationRepository.findById(id).get();
	}

	@Override
	public List<FriendshipRequestNotification> findAll() {
		return friendshipRequestNotificationRepository.findAll();
	}

	@Override
	public FriendshipRequestNotification save(FriendshipRequestNotification friendshipRequestNotification) {
		return friendshipRequestNotificationRepository.save(friendshipRequestNotification);
	}
	
	@Override
	public FriendshipRequestNotification remove(Long id) {
		FriendshipRequestNotification friendshipRequestNotification = friendshipRequestNotificationRepository.findById(id).get();
		if(friendshipRequestNotification == null){
			throw new IllegalArgumentException("Tried to delete non-existant FriendshipRequestNotification");
		}
		friendshipRequestNotificationRepository.delete(friendshipRequestNotification);
		return friendshipRequestNotification;
	}
	
	@Override
	public List<FriendshipRequestNotification> findByFriendshipRequest(Long id) {
		return friendshipRequestNotificationRepository.findByFriendshipRequest(id);
	}
	
	@Override
	public List<FriendshipRequestNotification> findByUser(Long id) {
		return friendshipRequestNotificationRepository.findByUser(id);
	}
	
	@Override
	public List<FriendshipRequestNotification> findByDescription(String  description) {
		return friendshipRequestNotificationRepository.findByDescription(description);
	}
	
	@Override
	public List<FriendshipRequestNotification> findByDate( Date  date) {
		return friendshipRequestNotificationRepository.findByDate(date);
	}
	
	@Override
	public List<FriendshipRequestNotification> findByType(NotificationType  type) {
		return friendshipRequestNotificationRepository.findByType(type);
	}
	
}