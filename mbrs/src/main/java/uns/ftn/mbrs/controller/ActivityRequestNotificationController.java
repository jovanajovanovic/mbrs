package uns.ftn.mbrs.controller;

import java.util.List;

import uns.ftn.mbrs.model.ActivityRequestNotification;
import uns.ftn.mbrs.service.ActivityRequestNotificationService;
import uns.ftn.mbrs.support.ActivityRequestNotificationDTOToActivityRequestNotification;
import uns.ftn.mbrs.support.ActivityRequestNotificationToActivityRequestNotificationDTO;
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
	private ActivityRequestNotificationService activityRequestNotificationService;
	
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
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<ActivityRequestNotificationDTO> edit(@RequestBody @Valid ActivityRequestNotificationDTO activityRequestNotification, @PathVariable Long id) {

		if (id != activityRequestNotification.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		ActivityRequestNotification persisted = activityRequestNotificationService.save(toActivityRequestNotification.convert(activityRequestNotification));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<ActivityRequestNotificationDTO> delete(@PathVariable Long id) {
		ActivityRequestNotification deleted = activityRequestNotificationService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterBymyplugin.generator.fmmodel.FMType@4897738dId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityRequestNotificationDTO>> getActivityRequestNotificationListBymyplugin.generator.fmmodel.FMType@4897738dId(@PathVariable Long id) {

		List<ActivityRequestNotification> activityRequestNotificationList = activityRequestNotificationService.findBymyplugin.generator.fmmodel.FMType@4897738dId(id);
			
		return new ResponseEntity<>(toDTO.convert(activityRequestNotificationList), HttpStatus.OK);
	}

}
