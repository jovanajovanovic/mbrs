package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Comment;

public interface CommentService extends CrudService<Comment> {

	List<Comment> findByText(String text);

	List<Comment> findByDate(date date);

	List<Comment> findByUserId(Long id);

}