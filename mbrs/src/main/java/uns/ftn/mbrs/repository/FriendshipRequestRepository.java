package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.FriendshipRequest;


@Repository
public interface FriendshipRequestRepository extends JpaRepository<FriendshipRequest, Long> {

	List<FriendshipRequest> findByStatus(FriendshipRequestStatus  status);
	
	List<FriendshipRequest> findByFriendshipRequestor(Long id);

	List<FriendshipRequest> findByFriendshipRequestee(Long id);

}