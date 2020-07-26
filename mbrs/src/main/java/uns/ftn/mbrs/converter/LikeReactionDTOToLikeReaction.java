package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.LikeReaction;
import uns.ftn.mbrs.dto.LikeReactionDTO;
import uns.ftn.mbrs.service.LikeReactionService;

@Component
public class LikeReactionDTOToLikeReaction implements Converter<LikeReactionDTO, LikeReaction>{

	@Autowired
	private UserDTOToUser toUser;
	@Autowired
	private PostDTOToPost toPost;
	
	@Autowired
	LikeReactionService likeReactionService;
	
	@Override
	public LikeReaction convert(LikeReactionDTO dto){
		LikeReaction likeReaction = new LikeReaction();
		
		if (dto.getId() != null) {
			likeReaction = likeReactionService.findOne(dto.getId());
			
			if(likeReaction == null){
				throw new IllegalStateException("likeReaction not exists in db");
			}
		}
		
		likeReaction.setId(dto.getId());
		
		likeReaction.setUser(toUser.convert(dto.getUser()));
		likeReaction.setPost(toPost.convert(dto.getPost()));
		
		return likeReaction;
	}
	
	public List<LikeReaction> convert (List<LikeReactionDTO> likeReactionDTOList){
		List<LikeReaction> likeReactionList = new ArrayList<>();
		
		for(LikeReactionDTO dto : likeReactionDTOList){
			likeReactionList.add(convert(dto));
		}
		
		return likeReactionList;
	}
	
	
}