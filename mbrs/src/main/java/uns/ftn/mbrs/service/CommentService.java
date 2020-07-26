package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Comment;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface CommentService{


	Comment findOne(Long id); 
	
	Comment save(Comment comment);
		
	List<Comment> findAll();
	
	Comment remove(Long id);
	

	List<Comment> findByText(String  text);

	List<Comment> findByDate( Date  date);

	List<Comment> findByUser(Long id);

}