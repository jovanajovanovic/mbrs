package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.LikeReaction;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface LikeReactionService{


	LikeReaction findOne(Long id); 
	
	LikeReaction save(LikeReaction likeReaction);
		
	List<LikeReaction> findAll();
	
	LikeReaction remove(Long id);
	

	List<LikeReaction> findByUser(Long id);

	List<LikeReaction> findByPost(Long id);

}