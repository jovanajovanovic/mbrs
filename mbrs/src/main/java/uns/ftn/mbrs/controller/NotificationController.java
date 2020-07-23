package uns.ftn.mbrs.controller;

import java.util.List;

import uns.ftn.mbrs.model.Notification;
import uns.ftn.mbrs.service.NotificationService;
import uns.ftn.mbrs.support.NotificationDTOToNotification;
import uns.ftn.mbrs.support.NotificationToNotificationDTO;
import uns.ftn.mbrs.dto.NotificationDTO;

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
@RequestMapping(value="/api/notification")
public class NotificationController {  

	@Autowired
	private NotificationService notificationService;
	
	@Autowired
	private NotificationToNotificationDTO toDTO;
	
	@Autowired
	private NotificationDTOToNotification toNotification;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<NotificationDTO>> getNotificationList () {

		List<Notification> notificationList = notificationService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(notificationList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<NotificationDTO> getNotification(@PathVariable Long id) {
		Notification notification = notificationService.findOne(id);
		if (notification == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(notification), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<NotificationDTO> add(@RequestBody @Valid NotificationDTO newNotification) {

		Notification savedNotification = notificationService.save(toNotification.convert(newNotification));

		return new ResponseEntity<>(toDTO.convert(savedNotification), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<NotificationDTO> edit(@RequestBody @Valid NotificationDTO notification, @PathVariable Long id) {

		if (id != notification.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Notification persisted = notificationService.save(toNotification.convert(notification));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<NotificationDTO> delete(@PathVariable Long id) {
		Notification deleted = notificationService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDescription/{value}", method = RequestMethod.GET)
	ResponseEntity<List<NotificationDTO>> getNotificationListByDescription(@PathVariable myplugin.generator.fmmodel.FMType@227ede32 value) {

		List<Notification> notificationList = notificationService.findByDescription(value);
			
		return new ResponseEntity<>(toDTO.convert(notificationList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDate/{value}", method = RequestMethod.GET)
	ResponseEntity<List<NotificationDTO>> getNotificationListByDate(@PathVariable myplugin.generator.fmmodel.FMType@2540a001 value) {

		List<Notification> notificationList = notificationService.findByDate(value);
			
		return new ResponseEntity<>(toDTO.convert(notificationList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByType/{value}", method = RequestMethod.GET)
	ResponseEntity<List<NotificationDTO>> getNotificationListByType(@PathVariable myplugin.generator.fmmodel.FMType@591dffd5 value) {

		List<Notification> notificationList = notificationService.findByType(value);
			
		return new ResponseEntity<>(toDTO.convert(notificationList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterBymyplugin.generator.fmmodel.FMType@1ccca168Id/{id}", method = RequestMethod.GET)
	ResponseEntity<List<NotificationDTO>> getNotificationListBymyplugin.generator.fmmodel.FMType@1ccca168Id(@PathVariable Long id) {

		List<Notification> notificationList = notificationService.findBymyplugin.generator.fmmodel.FMType@1ccca168Id(id);
			
		return new ResponseEntity<>(toDTO.convert(notificationList), HttpStatus.OK);
	}

}
