package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.LikeReaction;
import uns.ftn.mbrs.repository.LikeReactionRepository;
import uns.ftn.mbrs.service.LikeReactionService;


@Service
@Transactional
public class LikeReactionServiceImpl implements LikeReactionService {

	@Autowired
	private LikeReactionRepository likeReactionRepository;
	
	@Override
	public LikeReaction findOne(Long id) {
		return likeReactionRepository.findOne(id);
	}

	@Override
	public List<LikeReaction> findAll() {
		return likeReactionRepository.findAll();
	}

	@Override
	public LikeReaction save(LikeReaction likeReaction) {
		return likeReactionRepository.save(likeReaction);
	}
	
	public LikeReaction remove(Long id) {
		LikeReaction likeReaction = likeReactionRepository.findOne(id);
		if(likeReaction == null){
			throw new IllegalArgumentException("Tried to delete non-existant LikeReaction");
		}
		likeReactionRepository.delete(likeReaction);
		return likeReaction;
	}
	
	public List<LikeReaction> findByUserId(Long id) {
		return likeReactionRepository.findByUserId(id);
	}
	
}