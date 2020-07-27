package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.LikeReaction;
import uns.ftn.mbrs.dto.LikeReactionDTO;
import uns.ftn.mbrs.service.LikeReactionService;


import uns.ftn.mbrs.converter.UserToUserDTO;

@Component
public class LikeReactionToLikeReactionDTO implements Converter<LikeReaction, LikeReactionDTO> {

	@Autowired
	private UserToUserDTO toUserDTO;

	@Override
	public LikeReactionDTO convert(LikeReaction likeReaction) {
		LikeReactionDTO dto = new LikeReactionDTO();
		
		dto.setId(likeReaction.getId());
		if (likeReaction.getUser() != null){
		dto.setUser(toUserDTO.convert(likeReaction.getUser()));
		}		
		return dto;
	}
	
	public List<LikeReactionDTO> convert(List<LikeReaction> likeReactionList){
		List<LikeReactionDTO> likeReactionDTOList = new ArrayList<>();
		
		for(LikeReaction likeReaction : likeReactionList){
			likeReactionDTOList.add(convert(likeReaction));
		}
		
		return likeReactionDTOList;
	}
}