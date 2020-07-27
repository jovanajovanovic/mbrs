package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.Comment;
import uns.ftn.mbrs.dto.CommentDTO;
import uns.ftn.mbrs.service.CommentService;

@Component
public class CommentDTOToComment implements Converter<CommentDTO, Comment>{

	@Autowired
	private UserDTOToUser toUser;
	
	@Autowired
	CommentService commentService;
	
	@Override
	public Comment convert(CommentDTO dto){
		Comment comment = new Comment();
		
		if (dto.getId() != null) {
			comment = commentService.findOne(dto.getId());
			
			if(comment == null){
				throw new IllegalStateException("comment not exists in db");
			}
		}
		
		comment.setId(dto.getId());
		
			comment.setText(dto.getText());

			comment.setDate(dto.getDate());

		if (dto.getUser() != null){
			comment.setUser(toUser.convert(dto.getUser()));
		}	
		
		return comment;
	}
	
	public List<Comment> convert (List<CommentDTO> commentDTOList){
		List<Comment> commentList = new ArrayList<>();
		
		for(CommentDTO dto : commentDTOList){
			commentList.add(convert(dto));
		}
		
		return commentList;
	}
	
	
}