package uns.ftn.mbrs.controller;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;


import uns.ftn.mbrs.model.Notification;
import uns.ftn.mbrs.service.NotificationService;
import uns.ftn.mbrs.converter.NotificationDTOToNotification;
import uns.ftn.mbrs.converter.NotificationToNotificationDTO;
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
	protected NotificationService notificationService;
	
	@Autowired
	private NotificationToNotificationDTO toDTO;
	
	@Autowired
	private NotificationDTOToNotification toNotification;
	

	
	
	
}
