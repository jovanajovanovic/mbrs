package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.ActivityRequest;


@Repository
public interface ActivityRequestRepository extends JpaRepository<ActivityRequest, Long> {

	List<ActivityRequest> findByDate(date date);
	
	List<ActivityRequest> findByLocation(String location);
	
	List<ActivityRequest> findByStatus(ActivityRequestStatus status);
	
	List<ActivityRequest> findByUserId(Long id);

	List<ActivityRequest> findByUserId(Long id);

}