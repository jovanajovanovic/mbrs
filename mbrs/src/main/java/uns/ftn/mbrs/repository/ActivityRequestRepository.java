package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.ActivityRequest;


@Repository
public interface ActivityRequestRepository extends JpaRepository<ActivityRequest, Long> {

	List<ActivityRequest> findByDate( Date  date);
	
	List<ActivityRequest> findByLocation(String  location);
	
	List<ActivityRequest> findByStatus(ActivityRequestStatus  status);
	
	List<ActivityRequest> findByActivityRequestor(Long id);

	List<ActivityRequest> findByActivityRequestee(Long id);

}