package uns.ftn.mbrs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.ActivityRequest;
import uns.ftn.mbrs.repository.ActivityRequestRepository;
import uns.ftn.mbrs.service.ActivityRequestService;


@Service
@Transactional
public class ActivityRequestServiceImpl implements ActivityRequestService {

	@Autowired
	private ActivityRequestRepository activityRequestRepository;
	
	@Override
	public ActivityRequest findOne(Long id) {
		return activityRequestRepository.findOne(id);
	}

	@Override
	public List<ActivityRequest> findAll() {
		return activityRequestRepository.findAll();
	}

	@Override
	public ActivityRequest save(ActivityRequest activityRequest) {
		return activityRequestRepository.save(activityRequest);
	}
	
	public ActivityRequest remove(Long id) {
		ActivityRequest activityRequest = activityRequestRepository.findOne(id);
		if(activityRequest == null){
			throw new IllegalArgumentException("Tried to delete non-existant ActivityRequest");
		}
		activityRequestRepository.delete(activityRequest);
		return activityRequest;
	}
	
	public List<ActivityRequest> findByDate(date date) {
		return activityRequestRepository.findByDate(date);
	}
	
	public List<ActivityRequest> findByLocation(String location) {
		return activityRequestRepository.findByLocation(location);
	}
	
	public List<ActivityRequest> findByStatus(ActivityRequestStatus status) {
		return activityRequestRepository.findByStatus(status);
	}
	
	public List<ActivityRequest> findByUserId(Long id) {
		return activityRequestRepository.findByUserId(id);
	}
	
	public List<ActivityRequest> findByUserId(Long id) {
		return activityRequestRepository.findByUserId(id);
	}
	
}