package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.FriendshipRequest;
import uns.ftn.mbrs.dto.FriendshipRequestDTO;
import uns.ftn.mbrs.service.FriendshipRequestService;

@Component
public class FriendshipRequestDTOToFriendshipRequest implements Converter<FriendshipRequestDTO, FriendshipRequest>{

	@Autowired
	private UserDTOToUser tofriendshipRequestor;
	@Autowired
	private UserDTOToUser tofriendshipRequestee;
	
	@Autowired
	FriendshipRequestService friendshipRequestService;
	
	@Override
	public FriendshipRequest convert(FriendshipRequestDTO dto){
		FriendshipRequest friendshipRequest = new FriendshipRequest();
		
		if (dto.getId() != null) {
			friendshipRequest = friendshipRequestService.findOne(dto.getId());
			
			if(friendshipRequest == null){
				throw new IllegalStateException("friendshipRequest not exists in db");
			}
		}
		
		friendshipRequest.setId(dto.getId());
		
		friendshipRequest.setStatus(dto.getStatus());
		friendshipRequest.setFriendshipRequestor(tofriendshipRequestor.convert(dto.getFriendshipRequestor()));
		friendshipRequest.setFriendshipRequestee(tofriendshipRequestee.convert(dto.getFriendshipRequestee()));
		
		return friendshipRequest;
	}
	
	public List<FriendshipRequest> convert (List<FriendshipRequestDTO> friendshipRequestDTOList){
		List<FriendshipRequest> friendshipRequestList = new ArrayList<>();
		
		for(FriendshipRequestDTO dto : friendshipRequestDTOList){
			friendshipRequestList.add(convert(dto));
		}
		
		return friendshipRequestList;
	}
	
	
}