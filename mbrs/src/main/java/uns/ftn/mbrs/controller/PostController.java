package uns.ftn.mbrs.controller;

import java.util.List;

import uns.ftn.mbrs.model.Post;
import uns.ftn.mbrs.service.PostService;
import uns.ftn.mbrs.converter.PostDTOToPost;
import uns.ftn.mbrs.converter.PostToPostDTO;
import uns.ftn.mbrs.dto.PostDTO;

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
@RequestMapping(value="/api/post")
public class PostController {  

	@Autowired
	private PostService postService;
	
	@Autowired
	private PostToPostDTO toDTO;
	
	@Autowired
	private PostDTOToPost toPost;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<PostDTO>> getPostList () {

		List<Post> postList = postService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(postList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<PostDTO> getPost(@PathVariable Long id) {
		Post post = postService.findOne(id);
		if (post == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(post), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<PostDTO> add(@RequestBody @Valid PostDTO newPost) {

		Post savedPost = postService.save(toPost.convert(newPost));

		return new ResponseEntity<>(toDTO.convert(savedPost), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<PostDTO> edit(@RequestBody @Valid PostDTO post, @PathVariable Long id) {

		if (id != post.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Post persisted = postService.save(toPost.convert(post));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<PostDTO> delete(@PathVariable Long id) {
		Post deleted = postService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDescription/{value}", method = RequestMethod.GET)
	ResponseEntity<List<PostDTO>> getPostListByDescription(@PathVariable myplugin.generator.fmmodel.FMType@7eada228 value) {

		List<Post> postList = postService.findByDescription(value);
			
		return new ResponseEntity<>(toDTO.convert(postList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByVisibility/{value}", method = RequestMethod.GET)
	ResponseEntity<List<PostDTO>> getPostListByVisibility(@PathVariable myplugin.generator.fmmodel.FMType@7ebdf158 value) {

		List<Post> postList = postService.findByVisibility(value);
			
		return new ResponseEntity<>(toDTO.convert(postList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterBymyplugin.generator.fmmodel.FMType@50e75bbdId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<PostDTO>> getPostListBymyplugin.generator.fmmodel.FMType@50e75bbdId(@PathVariable Long id) {

		List<Post> postList = postService.findBymyplugin.generator.fmmodel.FMType@50e75bbdId(id);
			
		return new ResponseEntity<>(toDTO.convert(postList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterBymyplugin.generator.fmmodel.FMType@7c066161Id/{id}", method = RequestMethod.GET)
	ResponseEntity<List<PostDTO>> getPostListBymyplugin.generator.fmmodel.FMType@7c066161Id(@PathVariable Long id) {

		List<Post> postList = postService.findBymyplugin.generator.fmmodel.FMType@7c066161Id(id);
			
		return new ResponseEntity<>(toDTO.convert(postList), HttpStatus.OK);
	}

}
