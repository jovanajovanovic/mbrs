package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Comment;
import uns.ftn.mbrs.repository.CommentRepository;
import uns.ftn.mbrs.service.CommentService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	
	@Override
	public Comment findOne(Long id) {
		return commentRepository.findById(id).get();
	}

	@Override
	public List<Comment> findAll() {
		return commentRepository.findAll();
	}

	@Override
	public Comment save(Comment comment) {
		return commentRepository.save(comment);
	}
	
	@Override
	public Comment remove(Long id) {
		Comment comment = commentRepository.findById(id).get();
		if(comment == null){
			throw new IllegalArgumentException("Tried to delete non-existant Comment");
		}
		commentRepository.delete(comment);
		return comment;
	}
	
	@Override
	public List<Comment> findByUser(Long id) {
		return commentRepository.findByUser(id);
	}
	
}