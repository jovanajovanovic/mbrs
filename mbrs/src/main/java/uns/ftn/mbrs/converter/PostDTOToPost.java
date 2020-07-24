package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.Post;
import uns.ftn.mbrs.dto.PostDTO;
import uns.ftn.mbrs.service.PostService;

@Component
public class PostDTOToPost implements Converter<PostDTO, Post>{

	@Autowired
	private UserDTOToUser toUser;
	@Autowired
	private ActivityDTOToActivity toActivity;
	
	@Autowired
	PostService postService;
	
	@Override
	public Post convert(PostDTO dto){
		Post post = new Post();
		
		if (dto.getId() != null) {
			post = postService.findOne(dto.getId());
			
			if(post == null){
				throw new IllegalStateException("post not exists in db");
			}
		}
		
		post.setId(dto.getId());
		
		post.setDescription(dto.getDescription());
		post.setVisibility(dto.getVisibility());
		post.setUser(toUser.convert(dto.getUser()));
		post.setActivity(toActivity.convert(dto.getActivity()));
		
		return post;
	}
	
	public List<Post> convert (List<PostDTO> postDTOList){
		List<Post> postList = new ArrayList<>();
		
		for(PostDTO dto : postDTOList){
			postList.add(convert(dto));
		}
		
		return postList;
	}
	
	
}