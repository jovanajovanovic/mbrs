package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.LikeReaction;


@Repository
public interface LikeReactionRepository extends JpaRepository<LikeReaction, Long> {

	List<LikeReaction> findByUser(Long id);

	List<LikeReaction> findByPost(Long id);

}