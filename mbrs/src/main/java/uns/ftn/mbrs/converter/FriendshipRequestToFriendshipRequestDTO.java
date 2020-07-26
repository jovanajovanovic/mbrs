package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.FriendshipRequest;
import uns.ftn.mbrs.dto.FriendshipRequestDTO;
import uns.ftn.mbrs.service.FriendshipRequestService;


import uns.ftn.mbrs.converter.UserToUserDTO;
import uns.ftn.mbrs.converter.UserToUserDTO;

@Component
public class FriendshipRequestToFriendshipRequestDTO implements Converter<FriendshipRequest, FriendshipRequestDTO> {

	@Autowired
	private UserToUserDTO tofriendshipRequestorDTO;
	@Autowired
	private UserToUserDTO tofriendshipRequesteeDTO;

	@Override
	public FriendshipRequestDTO convert(FriendshipRequest friendshipRequest) {
		FriendshipRequestDTO dto = new FriendshipRequestDTO();
		
		dto.setId(friendshipRequest.getId());
		dto.setStatus(friendshipRequest.getStatus());
		dto.setFriendshipRequestor(tofriendshipRequestorDTO.convert(friendshipRequest.getFriendshipRequestor()));
		dto.setFriendshipRequestee(tofriendshipRequesteeDTO.convert(friendshipRequest.getFriendshipRequestee()));
		return dto;
	}
	
	public List<FriendshipRequestDTO> convert(List<FriendshipRequest> friendshipRequestList){
		List<FriendshipRequestDTO> friendshipRequestDTOList = new ArrayList<>();
		
		for(FriendshipRequest friendshipRequest : friendshipRequestList){
			friendshipRequestDTOList.add(convert(friendshipRequest));
		}
		
		return friendshipRequestDTOList;
	}
}