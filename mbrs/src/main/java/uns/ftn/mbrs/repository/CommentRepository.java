package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findByText(String  text);
	
	List<Comment> findByDate( Date  date);
	
	List<Comment> findByUser(Long id);

	List<Comment> findByPost(Long id);

}