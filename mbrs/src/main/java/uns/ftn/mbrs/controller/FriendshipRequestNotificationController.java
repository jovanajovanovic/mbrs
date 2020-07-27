package uns.ftn.mbrs.controller;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;


import uns.ftn.mbrs.model.FriendshipRequestNotification;
import uns.ftn.mbrs.service.FriendshipRequestNotificationService;
import uns.ftn.mbrs.converter.FriendshipRequestNotificationDTOToFriendshipRequestNotification;
import uns.ftn.mbrs.converter.FriendshipRequestNotificationToFriendshipRequestNotificationDTO;
import uns.ftn.mbrs.dto.FriendshipRequestNotificationDTO;

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
@RequestMapping(value="/api/friendshipRequestNotification")
public class FriendshipRequestNotificationController {  

	@Autowired
	protected FriendshipRequestNotificationService friendshipRequestNotificationService;
	
	@Autowired
	private FriendshipRequestNotificationToFriendshipRequestNotificationDTO toDTO;
	
	@Autowired
	private FriendshipRequestNotificationDTOToFriendshipRequestNotification toFriendshipRequestNotification;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<FriendshipRequestNotificationDTO>> getFriendshipRequestNotificationList () {

		List<FriendshipRequestNotification> friendshipRequestNotificationList = friendshipRequestNotificationService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(friendshipRequestNotificationList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<FriendshipRequestNotificationDTO> getFriendshipRequestNotification(@PathVariable Long id) {
		FriendshipRequestNotification friendshipRequestNotification = friendshipRequestNotificationService.findOne(id);
		if (friendshipRequestNotification == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(friendshipRequestNotification), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<FriendshipRequestNotificationDTO> add(@RequestBody @Valid FriendshipRequestNotificationDTO newFriendshipRequestNotification) {

		FriendshipRequestNotification savedFriendshipRequestNotification = friendshipRequestNotificationService.save(toFriendshipRequestNotification.convert(newFriendshipRequestNotification));

		return new ResponseEntity<>(toDTO.convert(savedFriendshipRequestNotification), HttpStatus.CREATED);
	}
	
	
	
	@RequestMapping(value = "/filterByFriendshipRequestId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<FriendshipRequestNotificationDTO>> getFriendshipRequestNotificationListByFriendshipRequestId(@PathVariable Long id) {

		List<FriendshipRequestNotification> friendshipRequestNotificationList = friendshipRequestNotificationService.findByFriendshipRequest(id);
			
		return new ResponseEntity<>(toDTO.convert(friendshipRequestNotificationList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByUserId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<FriendshipRequestNotificationDTO>> getFriendshipRequestNotificationListByUserId(@PathVariable Long id) {

		List<FriendshipRequestNotification> friendshipRequestNotificationList = friendshipRequestNotificationService.findByUser(id);
			
		return new ResponseEntity<>(toDTO.convert(friendshipRequestNotificationList), HttpStatus.OK);
	}

}
