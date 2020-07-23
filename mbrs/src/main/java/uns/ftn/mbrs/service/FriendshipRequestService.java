package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.FriendshipRequest;

public interface FriendshipRequestService extends CrudService<FriendshipRequest> {

	List<FriendshipRequest> findByStatus(FriendshipRequestStatus status);

	List<FriendshipRequest> findByUserId(Long id);

	List<FriendshipRequest> findByUserId(Long id);

}