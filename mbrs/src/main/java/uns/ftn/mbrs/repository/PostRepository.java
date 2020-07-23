package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByDescription(String description);
	
	List<Post> findByVisibility(Visibility visibility);
	
	List<Post> findByUserId(Long id);

	List<Post> findByActivityId(Long id);

}