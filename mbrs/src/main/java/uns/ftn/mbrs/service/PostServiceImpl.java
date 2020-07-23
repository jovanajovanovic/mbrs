package uns.ftn.mbrs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.Post;
import uns.ftn.mbrs.repository.PostRepository;
import uns.ftn.mbrs.service.PostService;


@Service
@Transactional
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public Post findOne(Long id) {
		return postRepository.findOne(id);
	}

	@Override
	public List<Post> findAll() {
		return postRepository.findAll();
	}

	@Override
	public Post save(Post post) {
		return postRepository.save(post);
	}
	
	public Post remove(Long id) {
		Post post = postRepository.findOne(id);
		if(post == null){
			throw new IllegalArgumentException("Tried to delete non-existant Post");
		}
		postRepository.delete(post);
		return post;
	}
	
	public List<Post> findByDescription(String description) {
		return postRepository.findByDescription(description);
	}
	
	public List<Post> findByVisibility(Visibility visibility) {
		return postRepository.findByVisibility(visibility);
	}
	
	public List<Post> findByUserId(Long id) {
		return postRepository.findByUserId(id);
	}
	
	public List<Post> findByActivityId(Long id) {
		return postRepository.findByActivityId(id);
	}
	
}