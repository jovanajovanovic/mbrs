package uns.ftn.mbrs.controller;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;


import uns.ftn.mbrs.model.ActivityRequest;
import uns.ftn.mbrs.service.ActivityRequestService;
import uns.ftn.mbrs.converter.ActivityRequestDTOToActivityRequest;
import uns.ftn.mbrs.converter.ActivityRequestToActivityRequestDTO;
import uns.ftn.mbrs.dto.ActivityRequestDTO;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/activityRequest")
public class ActivityRequestController {  

	@Autowired
	protected ActivityRequestService activityRequestService;
	
	@Autowired
	private ActivityRequestToActivityRequestDTO toDTO;
	
	@Autowired
	private ActivityRequestDTOToActivityRequest toActivityRequest;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<ActivityRequestDTO>> getActivityRequestList () {

		List<ActivityRequest> activityRequestList = activityRequestService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(activityRequestList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<ActivityRequestDTO> getActivityRequest(@PathVariable Long id) {
		ActivityRequest activityRequest = activityRequestService.findOne(id);
		if (activityRequest == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(activityRequest), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ActivityRequestDTO> add(@RequestBody @Valid ActivityRequestDTO newActivityRequest) {

		ActivityRequest savedActivityRequest = activityRequestService.save(toActivityRequest.convert(newActivityRequest));

		return new ResponseEntity<>(toDTO.convert(savedActivityRequest), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<ActivityRequestDTO> edit(@RequestBody @Valid ActivityRequestDTO activityRequest, @PathVariable Long id) {

		if (id != activityRequest.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		ActivityRequest persisted = activityRequestService.save(toActivityRequest.convert(activityRequest));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<ActivityRequestDTO> delete(@PathVariable Long id) {
		ActivityRequest deleted = activityRequestService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/filterByActivityRequestorId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityRequestDTO>> getActivityRequestListByActivityRequestorId(@PathVariable Long id) {

		List<ActivityRequest> activityRequestList = activityRequestService.findByActivityRequestor(id);
			
		return new ResponseEntity<>(toDTO.convert(activityRequestList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByActivityRequesteeId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityRequestDTO>> getActivityRequestListByActivityRequesteeId(@PathVariable Long id) {

		List<ActivityRequest> activityRequestList = activityRequestService.findByActivityRequestee(id);
			
		return new ResponseEntity<>(toDTO.convert(activityRequestList), HttpStatus.OK);
	}

}
