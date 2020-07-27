package uns.ftn.mbrs.controller;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;


import uns.ftn.mbrs.model.LikeReaction;
import uns.ftn.mbrs.service.LikeReactionService;
import uns.ftn.mbrs.converter.LikeReactionDTOToLikeReaction;
import uns.ftn.mbrs.converter.LikeReactionToLikeReactionDTO;
import uns.ftn.mbrs.dto.LikeReactionDTO;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/likeReaction")
public class LikeReactionController {  

	@Autowired
	private LikeReactionService likeReactionService;
	
	@Autowired
	private LikeReactionToLikeReactionDTO toDTO;
	
	@Autowired
	private LikeReactionDTOToLikeReaction toLikeReaction;
	

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<LikeReactionDTO> add(@RequestBody @Valid LikeReactionDTO newLikeReaction) {

		LikeReaction savedLikeReaction = likeReactionService.save(toLikeReaction.convert(newLikeReaction));

		return new ResponseEntity<>(toDTO.convert(savedLikeReaction), HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<LikeReactionDTO> delete(@PathVariable Long id) {
		LikeReaction deleted = likeReactionService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}
	
}
