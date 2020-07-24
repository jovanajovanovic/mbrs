package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.Post;
import uns.ftn.mbrs.dto.PostDTO;
import uns.ftn.mbrs.service.PostService;


import uns.ftn.mbrs.converter.UserToUserDTO;
import uns.ftn.mbrs.converter.ActivityToActivityDTO;

@Component
public class PostToPostDTO implements Converter<Post, PostDTO> {

	@Autowired
	private UserToUserDTO toUserDTO;
	@Autowired
	private ActivityToActivityDTO toActivityDTO;

	@Override
	public PostDTO convert(Post post) {
		PostDTO dto = new PostDTO();
		
		dto.setId(post.getId());
		dto.setDescription(post.getDescription());
		dto.setVisibility(post.getVisibility());
		dto.setUser(toUserDTO.convert(post.getUser()));
		dto.setActivity(toActivityDTO.convert(post.getActivity()));
		return dto;
	}
	
	public List<PostDTO> convert(List<Post> postList){
		List<PostDTO> postDTOList = new ArrayList<>();
		
		for(Post post : postList){
			postDTOList.add(convert(post));
		}
		
		return postDTOList;
	}
}