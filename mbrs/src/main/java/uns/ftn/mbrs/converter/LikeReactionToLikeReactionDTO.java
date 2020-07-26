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
import uns.ftn.mbrs.converter.PostToPostDTO;

@Component
public class LikeReactionToLikeReactionDTO implements Converter<LikeReaction, LikeReactionDTO> {

	@Autowired
	private UserToUserDTO toUserDTO;
	@Autowired
	private PostToPostDTO toPostDTO;

	@Override
	public LikeReactionDTO convert(LikeReaction likeReaction) {
		LikeReactionDTO dto = new LikeReactionDTO();
		
		dto.setId(likeReaction.getId());
		dto.setUser(toUserDTO.convert(likeReaction.getUser()));
		dto.setPost(toPostDTO.convert(likeReaction.getPost()));
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