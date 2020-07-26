package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.LikeReaction;
import uns.ftn.mbrs.repository.LikeReactionRepository;
import uns.ftn.mbrs.service.LikeReactionService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class LikeReactionServiceImpl implements LikeReactionService {

	@Autowired
	private LikeReactionRepository likeReactionRepository;
	
	@Override
	public LikeReaction findOne(Long id) {
		return likeReactionRepository.findById(id).get();
	}

	@Override
	public List<LikeReaction> findAll() {
		return likeReactionRepository.findAll();
	}

	@Override
	public LikeReaction save(LikeReaction likeReaction) {
		return likeReactionRepository.save(likeReaction);
	}
	
	@Override
	public LikeReaction remove(Long id) {
		LikeReaction likeReaction = likeReactionRepository.findById(id).get();
		if(likeReaction == null){
			throw new IllegalArgumentException("Tried to delete non-existant LikeReaction");
		}
		likeReactionRepository.delete(likeReaction);
		return likeReaction;
	}
	
	@Override
	public List<LikeReaction> findByUser(Long id) {
		return likeReactionRepository.findByUser(id);
	}
	
	@Override
	public List<LikeReaction> findByPost(Long id) {
		return likeReactionRepository.findByPost(id);
	}
	
}