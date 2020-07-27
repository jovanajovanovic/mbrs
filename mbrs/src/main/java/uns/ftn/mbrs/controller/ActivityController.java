package uns.ftn.mbrs.controller;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;


import uns.ftn.mbrs.model.Activity;
import uns.ftn.mbrs.service.ActivityService;
import uns.ftn.mbrs.converter.ActivityDTOToActivity;
import uns.ftn.mbrs.converter.ActivityToActivityDTO;
import uns.ftn.mbrs.dto.ActivityDTO;

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
@RequestMapping(value="/api/activity")
public class ActivityController {  

	@Autowired
	private ActivityService activityService;
	
	@Autowired
	private ActivityToActivityDTO toDTO;
	
	@Autowired
	private ActivityDTOToActivity toActivity;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<ActivityDTO>> getActivityList () {

		List<Activity> activityList = activityService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(activityList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<ActivityDTO> getActivity(@PathVariable Long id) {
		Activity activity = activityService.findOne(id);
		if (activity == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(activity), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<ActivityDTO> add(@RequestBody @Valid ActivityDTO newActivity) {

		Activity savedActivity = activityService.save(toActivity.convert(newActivity));

		return new ResponseEntity<>(toDTO.convert(savedActivity), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<ActivityDTO> edit(@RequestBody @Valid ActivityDTO activity, @PathVariable Long id) {

		if (id != activity.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Activity persisted = activityService.save(toActivity.convert(activity));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<ActivityDTO> delete(@PathVariable Long id) {
		Activity deleted = activityService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDuration/{value}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityDTO>> getActivityListByDuration(@PathVariable double  value) {

		List<Activity> activityList = activityService.findByDuration(value);
			
		return new ResponseEntity<>(toDTO.convert(activityList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDistance/{value}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityDTO>> getActivityListByDistance(@PathVariable double  value) {

		List<Activity> activityList = activityService.findByDistance(value);
			
		return new ResponseEntity<>(toDTO.convert(activityList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDate/{value}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityDTO>> getActivityListByDate(@PathVariable  Date  value) {

		List<Activity> activityList = activityService.findByDate(value);
			
		return new ResponseEntity<>(toDTO.convert(activityList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterBySteps/{value}", method = RequestMethod.GET)
	ResponseEntity<List<ActivityDTO>> getActivityListBySteps(@PathVariable Integer  value) {

		List<Activity> activityList = activityService.findBySteps(value);
			
		return new ResponseEntity<>(toDTO.convert(activityList), HttpStatus.OK);
	}

}
