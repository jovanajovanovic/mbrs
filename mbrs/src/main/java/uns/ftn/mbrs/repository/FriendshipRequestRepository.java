package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.FriendshipRequest;


@Repository
public interface FriendshipRequestRepository extends JpaRepository<FriendshipRequest, Long> {

	List<FriendshipRequest> findByStatus(FriendshipRequestStatus status);
	
	List<FriendshipRequest> findByUserId(Long id);

	List<FriendshipRequest> findByUserId(Long id);

}