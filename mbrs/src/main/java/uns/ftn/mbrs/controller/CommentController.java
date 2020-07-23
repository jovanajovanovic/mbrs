package uns.ftn.mbrs.controller;

import java.util.List;

import uns.ftn.mbrs.model.Comment;
import uns.ftn.mbrs.service.CommentService;
import uns.ftn.mbrs.support.CommentDTOToComment;
import uns.ftn.mbrs.support.CommentToCommentDTO;
import uns.ftn.mbrs.dto.CommentDTO;

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
@RequestMapping(value="/api/comment")
public class CommentController {  

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private CommentToCommentDTO toDTO;
	
	@Autowired
	private CommentDTOToComment toComment;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<CommentDTO>> getCommentList () {

		List<Comment> commentList = commentService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(commentList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<CommentDTO> getComment(@PathVariable Long id) {
		Comment comment = commentService.findOne(id);
		if (comment == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(comment), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<CommentDTO> add(@RequestBody @Valid CommentDTO newComment) {

		Comment savedComment = commentService.save(toComment.convert(newComment));

		return new ResponseEntity<>(toDTO.convert(savedComment), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<CommentDTO> edit(@RequestBody @Valid CommentDTO comment, @PathVariable Long id) {

		if (id != comment.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Comment persisted = commentService.save(toComment.convert(comment));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<CommentDTO> delete(@PathVariable Long id) {
		Comment deleted = commentService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByText/{value}", method = RequestMethod.GET)
	ResponseEntity<List<CommentDTO>> getCommentListByText(@PathVariable myplugin.generator.fmmodel.FMType@76f59b9c value) {

		List<Comment> commentList = commentService.findByText(value);
			
		return new ResponseEntity<>(toDTO.convert(commentList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDate/{value}", method = RequestMethod.GET)
	ResponseEntity<List<CommentDTO>> getCommentListByDate(@PathVariable myplugin.generator.fmmodel.FMType@661e9778 value) {

		List<Comment> commentList = commentService.findByDate(value);
			
		return new ResponseEntity<>(toDTO.convert(commentList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterBymyplugin.generator.fmmodel.FMType@14ba29f2Id/{id}", method = RequestMethod.GET)
	ResponseEntity<List<CommentDTO>> getCommentListBymyplugin.generator.fmmodel.FMType@14ba29f2Id(@PathVariable Long id) {

		List<Comment> commentList = commentService.findBymyplugin.generator.fmmodel.FMType@14ba29f2Id(id);
			
		return new ResponseEntity<>(toDTO.convert(commentList), HttpStatus.OK);
	}

}
