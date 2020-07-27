package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Post;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface PostService{

	
	Post findOne(Long id); 
	
	Post save(Post post);
	
	List<Post> findAll();
	Post remove(Long id);
	

	List<Post> findByUser(Long id);

	List<Post> findByActivity(Long id);

}