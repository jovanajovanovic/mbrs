package uns.ftn.mbrs.controller;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;


import uns.ftn.mbrs.model.ActivityRequestNotification;
import uns.ftn.mbrs.service.ActivityRequestNotificationService;
import uns.ftn.mbrs.converter.ActivityRequestNotificationDTOToActivityRequestNotification;
import uns.ftn.mbrs.converter.ActivityRequestNotificationToActivityRequestNotificationDTO;
import uns.ftn.mbrs.dto.ActivityRequestNotificationDTO;

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
@RequestMapping(value="/api/activityRequestNotification")
public class ActivityRequestNotificationController {  

	@Autowired
	protected ActivityRequestNotificationService activityRequestNotificationService;
	
	@Autowired
	private ActivityRequestNotificationToActivityRequestNotificationDTO toDTO;
	
	@Autowired
	private ActivityRequestNotificationDTOToActivityRequestNotification toActivityRequestNotification;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<ActivityRequestNotificationDTO>> getActivityRequestNotificationList () {

		List<ActivityRequestNotification> activityRequestNotificationList = activityRequestNotificationService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(activityRequestNotificationList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<ActivityRequestNotificationDTO> getActivityRequestNotification(@PathVariable Long id) {
		ActivityRequestNotification activityRequestNotification = activityRequestNotificationService.findOne(id);
		if (activityRequestNotification == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(activityRequestNotification), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ActivityRequestNotificationDTO> add(@RequestBody @Valid ActivityRequestNotificationDTO newActivityRequestNotification) {

		ActivityRequestNotification savedActivityRequestNotification = activityRequestNotificationService.save(toActivityRequestNotification.convert(newActivityRequestNotification));

		return new ResponseEntity<>(toDTO.convert(savedActivityRequestNotification), HttpStatus.CREATED);
	}
	
	
	
	@RequestMapping(value = "/filterByActivityRequestId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityRequestNotificationDTO>> getActivityRequestNotificationListByActivityRequestId(@PathVariable Long id) {

		List<ActivityRequestNotification> activityRequestNotificationList = activityRequestNotificationService.findByActivityRequest(id);
			
		return new ResponseEntity<>(toDTO.convert(activityRequestNotificationList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByUserId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityRequestNotificationDTO>> getActivityRequestNotificationListByUserId(@PathVariable Long id) {

		List<ActivityRequestNotification> activityRequestNotificationList = activityRequestNotificationService.findByUser(id);
			
		return new ResponseEntity<>(toDTO.convert(activityRequestNotificationList), HttpStatus.OK);
	}

}
