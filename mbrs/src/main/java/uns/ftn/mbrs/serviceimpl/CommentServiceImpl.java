package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Comment;
import uns.ftn.mbrs.repository.CommentRepository;
import uns.ftn.mbrs.service.CommentService;


@Service
@Transactional
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public Comment findOne(Long id) {
		return commentRepository.findOne(id);
	}

	@Override
	public List<Comment> findAll() {
		return commentRepository.findAll();
	}

	@Override
	public Comment save(Comment comment) {
		return commentRepository.save(comment);
	}
	
	public Comment remove(Long id) {
		Comment comment = commentRepository.findOne(id);
		if(comment == null){
			throw new IllegalArgumentException("Tried to delete non-existant Comment");
		}
		commentRepository.delete(comment);
		return comment;
	}
	
	public List<Comment> findByText(String text) {
		return commentRepository.findByText(text);
	}
	
	public List<Comment> findByDate(date date) {
		return commentRepository.findByDate(date);
	}
	
	public List<Comment> findByUserId(Long id) {
		return commentRepository.findByUserId(id);
	}
	
}