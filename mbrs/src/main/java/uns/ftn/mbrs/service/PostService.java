package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.Post;

public interface PostService extends CrudService<Post> {

	List<Post> findByDescription(String description);

	List<Post> findByVisibility(Visibility visibility);

	List<Post> findByUserId(Long id);

	List<Post> findByActivityId(Long id);

}