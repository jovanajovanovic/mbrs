package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.FriendshipRequestNotification;
import uns.ftn.mbrs.dto.FriendshipRequestNotificationDTO;
import uns.ftn.mbrs.service.FriendshipRequestNotificationService;


import uns.ftn.mbrs.converter.FriendshipRequestToFriendshipRequestDTO;
import uns.ftn.mbrs.converter.UserToUserDTO;

@Component
public class FriendshipRequestNotificationToFriendshipRequestNotificationDTO implements Converter<FriendshipRequestNotification, FriendshipRequestNotificationDTO> {

	@Autowired
	private FriendshipRequestToFriendshipRequestDTO toFriendshipRequestDTO;
	@Autowired
	private UserToUserDTO toUserDTO;

	@Override
	public FriendshipRequestNotificationDTO convert(FriendshipRequestNotification friendshipRequestNotification) {
		FriendshipRequestNotificationDTO dto = new FriendshipRequestNotificationDTO();
		
		dto.setId(friendshipRequestNotification.getId());
		dto.setFriendshipRequest(toFriendshipRequestDTO.convert(friendshipRequestNotification.getFriendshipRequest()));
		dto.setUser(toUserDTO.convert(friendshipRequestNotification.getUser()));
		dto.setDescription(friendshipRequestNotification.getDescription());
		dto.setDate(friendshipRequestNotification.getDate());
		dto.setType(friendshipRequestNotification.getType());
		return dto;
	}
	
	public List<FriendshipRequestNotificationDTO> convert(List<FriendshipRequestNotification> friendshipRequestNotificationList){
		List<FriendshipRequestNotificationDTO> friendshipRequestNotificationDTOList = new ArrayList<>();
		
		for(FriendshipRequestNotification friendshipRequestNotification : friendshipRequestNotificationList){
			friendshipRequestNotificationDTOList.add(convert(friendshipRequestNotification));
		}
		
		return friendshipRequestNotificationDTOList;
	}
}