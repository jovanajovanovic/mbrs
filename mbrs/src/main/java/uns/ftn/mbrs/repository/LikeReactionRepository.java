package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.LikeReaction;


@Repository
public interface LikeReactionRepository extends JpaRepository<LikeReaction, Long> {

	List<LikeReaction> findByUserId(Long id);

}