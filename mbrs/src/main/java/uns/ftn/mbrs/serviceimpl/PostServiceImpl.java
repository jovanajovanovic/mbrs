package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Post;
import uns.ftn.mbrs.repository.PostRepository;
import uns.ftn.mbrs.service.PostService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	
	@Override
	public Post findOne(Long id) {
		return postRepository.findById(id).get();
	}

	@Override
	public List<Post> findAll() {
		return postRepository.findAll();
	}

	@Override
	public Post save(Post post) {
		return postRepository.save(post);
	}
	
	@Override
	public Post remove(Long id) {
		Post post = postRepository.findById(id).get();
		if(post == null){
			throw new IllegalArgumentException("Tried to delete non-existant Post");
		}
		postRepository.delete(post);
		return post;
	}
	
	@Override
	public List<Post> findByUser(Long id) {
		return postRepository.findByUser(id);
	}
	
	@Override
	public List<Post> findByActivity(Long id) {
		return postRepository.findByActivity(id);
	}
	
}