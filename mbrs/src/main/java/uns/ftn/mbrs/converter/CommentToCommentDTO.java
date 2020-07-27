package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.Comment;
import uns.ftn.mbrs.dto.CommentDTO;
import uns.ftn.mbrs.service.CommentService;


import uns.ftn.mbrs.converter.UserToUserDTO;

@Component
public class CommentToCommentDTO implements Converter<Comment, CommentDTO> {

	@Autowired
	private UserToUserDTO toUserDTO;

	@Override
	public CommentDTO convert(Comment comment) {
		CommentDTO dto = new CommentDTO();
		
		dto.setId(comment.getId());
		dto.setText(comment.getText());

		dto.setDate(comment.getDate());

		if (comment.getUser() != null){
		dto.setUser(toUserDTO.convert(comment.getUser()));
		}		
		return dto;
	}
	
	public List<CommentDTO> convert(List<Comment> commentList){
		List<CommentDTO> commentDTOList = new ArrayList<>();
		
		for(Comment comment : commentList){
			commentDTOList.add(convert(comment));
		}
		
		return commentDTOList;
	}
}