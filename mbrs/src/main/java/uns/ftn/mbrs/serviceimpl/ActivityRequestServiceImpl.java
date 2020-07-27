package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.ActivityRequest;
import uns.ftn.mbrs.repository.ActivityRequestRepository;
import uns.ftn.mbrs.service.ActivityRequestService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class ActivityRequestServiceImpl implements ActivityRequestService {

	@Autowired
	private ActivityRequestRepository activityRequestRepository;
	
	
	@Override
	public ActivityRequest findOne(Long id) {
		return activityRequestRepository.findById(id).get();
	}

	@Override
	public List<ActivityRequest> findAll() {
		return activityRequestRepository.findAll();
	}

	@Override
	public ActivityRequest save(ActivityRequest activityRequest) {
		return activityRequestRepository.save(activityRequest);
	}
	
	@Override
	public ActivityRequest remove(Long id) {
		ActivityRequest activityRequest = activityRequestRepository.findById(id).get();
		if(activityRequest == null){
			throw new IllegalArgumentException("Tried to delete non-existant ActivityRequest");
		}
		activityRequestRepository.delete(activityRequest);
		return activityRequest;
	}
	
	@Override
	public List<ActivityRequest> findByActivityRequestor(Long id) {
		return activityRequestRepository.findByActivityRequestor(id);
	}
	
	@Override
	public List<ActivityRequest> findByActivityRequestee(Long id) {
		return activityRequestRepository.findByActivityRequestee(id);
	}
	
}