package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findByText(String text);
	
	List<Comment> findByDate(date date);
	
	List<Comment> findByUserId(Long id);

}