package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.FriendshipRequest;
import uns.ftn.mbrs.repository.FriendshipRequestRepository;
import uns.ftn.mbrs.service.FriendshipRequestService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class FriendshipRequestServiceImpl implements FriendshipRequestService {

	@Autowired
	private FriendshipRequestRepository friendshipRequestRepository;
	
	
	@Override
	public FriendshipRequest findOne(Long id) {
		return friendshipRequestRepository.findById(id).get();
	}

	@Override
	public List<FriendshipRequest> findAll() {
		return friendshipRequestRepository.findAll();
	}

	@Override
	public FriendshipRequest save(FriendshipRequest friendshipRequest) {
		return friendshipRequestRepository.save(friendshipRequest);
	}
	
	@Override
	public FriendshipRequest remove(Long id) {
		FriendshipRequest friendshipRequest = friendshipRequestRepository.findById(id).get();
		if(friendshipRequest == null){
			throw new IllegalArgumentException("Tried to delete non-existant FriendshipRequest");
		}
		friendshipRequestRepository.delete(friendshipRequest);
		return friendshipRequest;
	}
	
	@Override
	public List<FriendshipRequest> findByFriendshipRequestor(Long id) {
		return friendshipRequestRepository.findByFriendshipRequestor(id);
	}
	
	@Override
	public List<FriendshipRequest> findByFriendshipRequestee(Long id) {
		return friendshipRequestRepository.findByFriendshipRequestee(id);
	}
	
}