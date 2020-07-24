package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.FriendshipRequestNotification;
import uns.ftn.mbrs.dto.FriendshipRequestNotificationDTO;
import uns.ftn.mbrs.service.FriendshipRequestNotificationService;

@Component
public class FriendshipRequestNotificationDTOToFriendshipRequestNotification implements Converter<FriendshipRequestNotificationDTO, FriendshipRequestNotification>{

	@Autowired
	private FriendshipRequestDTOToFriendshipRequest toFriendshipRequest;
	@Autowired
	private UserDTOToUser toUser;
	
	@Autowired
	FriendshipRequestNotificationService friendshipRequestNotificationService;
	
	@Override
	public FriendshipRequestNotification convert(FriendshipRequestNotificationDTO dto){
		FriendshipRequestNotification friendshipRequestNotification = new FriendshipRequestNotification();
		
		if (dto.getId() != null) {
			friendshipRequestNotification = friendshipRequestNotificationService.findOne(dto.getId());
			
			if(friendshipRequestNotification == null){
				throw new IllegalStateException("friendshipRequestNotification not exists in db");
			}
		}
		
		friendshipRequestNotification.setId(dto.getId());
		
		friendshipRequestNotification.setFriendshipRequest(toFriendshipRequest.convert(dto.getFriendshipRequest()));
		friendshipRequestNotification.setUser(toUser.convert(dto.getUser()));
		friendshipRequestNotification.setDescription(dto.getDescription());
		friendshipRequestNotification.setDate(dto.getDate());
		friendshipRequestNotification.setType(dto.getType());
		
		return friendshipRequestNotification;
	}
	
	public List<FriendshipRequestNotification> convert (List<FriendshipRequestNotificationDTO> friendshipRequestNotificationDTOList){
		List<FriendshipRequestNotification> friendshipRequestNotificationList = new ArrayList<>();
		
		for(FriendshipRequestNotificationDTO dto : friendshipRequestNotificationDTOList){
			friendshipRequestNotificationList.add(convert(dto));
		}
		
		return friendshipRequestNotificationList;
	}
	
	
}