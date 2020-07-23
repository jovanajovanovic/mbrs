package uns.ftn.mbrs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.FriendshipRequest;
import uns.ftn.mbrs.repository.FriendshipRequestRepository;
import uns.ftn.mbrs.service.FriendshipRequestService;


@Service
@Transactional
public class FriendshipRequestServiceImpl implements FriendshipRequestService {

	@Autowired
	private FriendshipRequestRepository friendshipRequestRepository;
	
	@Override
	public FriendshipRequest findOne(Long id) {
		return friendshipRequestRepository.findOne(id);
	}

	@Override
	public List<FriendshipRequest> findAll() {
		return friendshipRequestRepository.findAll();
	}

	@Override
	public FriendshipRequest save(FriendshipRequest friendshipRequest) {
		return friendshipRequestRepository.save(friendshipRequest);
	}
	
	public FriendshipRequest remove(Long id) {
		FriendshipRequest friendshipRequest = friendshipRequestRepository.findOne(id);
		if(friendshipRequest == null){
			throw new IllegalArgumentException("Tried to delete non-existant FriendshipRequest");
		}
		friendshipRequestRepository.delete(friendshipRequest);
		return friendshipRequest;
	}
	
	public List<FriendshipRequest> findByStatus(FriendshipRequestStatus status) {
		return friendshipRequestRepository.findByStatus(status);
	}
	
	public List<FriendshipRequest> findByUserId(Long id) {
		return friendshipRequestRepository.findByUserId(id);
	}
	
	public List<FriendshipRequest> findByUserId(Long id) {
		return friendshipRequestRepository.findByUserId(id);
	}
	
}