package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.FriendshipRequestNotification;
import uns.ftn.mbrs.repository.FriendshipRequestNotificationRepository;
import uns.ftn.mbrs.service.FriendshipRequestNotificationService;


@Service
@Transactional
public class FriendshipRequestNotificationServiceImpl implements FriendshipRequestNotificationService {

	@Autowired
	private FriendshipRequestNotificationRepository friendshipRequestNotificationRepository;
	
	@Override
	public FriendshipRequestNotification findOne(Long id) {
		return friendshipRequestNotificationRepository.findOne(id);
	}

	@Override
	public List<FriendshipRequestNotification> findAll() {
		return friendshipRequestNotificationRepository.findAll();
	}

	@Override
	public FriendshipRequestNotification save(FriendshipRequestNotification friendshipRequestNotification) {
		return friendshipRequestNotificationRepository.save(friendshipRequestNotification);
	}
	
	public FriendshipRequestNotification remove(Long id) {
		FriendshipRequestNotification friendshipRequestNotification = friendshipRequestNotificationRepository.findOne(id);
		if(friendshipRequestNotification == null){
			throw new IllegalArgumentException("Tried to delete non-existant FriendshipRequestNotification");
		}
		friendshipRequestNotificationRepository.delete(friendshipRequestNotification);
		return friendshipRequestNotification;
	}
	
	public List<FriendshipRequestNotification> findByFriendshipRequestId(Long id) {
		return friendshipRequestNotificationRepository.findByFriendshipRequestId(id);
	}
	
	public List<FriendshipRequestNotification> findByUserId(Long id) {
		return friendshipRequestNotificationRepository.findByUserId(id);
	}
	
	public List<FriendshipRequestNotification> findByDescription(String description) {
		return friendshipRequestNotificationRepository.findByDescription(description);
	}
	
	public List<FriendshipRequestNotification> findByDate(date date) {
		return friendshipRequestNotificationRepository.findByDate(date);
	}
	
	public List<FriendshipRequestNotification> findByType(NotificationType type) {
		return friendshipRequestNotificationRepository.findByType(type);
	}
	
}