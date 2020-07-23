package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.LikeReaction;

public interface LikeReactionService extends CrudService<LikeReaction> {

	List<LikeReaction> findByUserId(Long id);

}