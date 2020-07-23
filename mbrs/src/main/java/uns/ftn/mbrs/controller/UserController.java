package uns.ftn.mbrs.controller;

import java.util.List;

import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.service.UserService;
import uns.ftn.mbrs.support.UserDTOToUser;
import uns.ftn.mbrs.support.UserToUserDTO;
import uns.ftn.mbrs.dto.UserDTO;

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
@RequestMapping(value="/api/user")
public class UserController {  

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserToUserDTO toDTO;
	
	@Autowired
	private UserDTOToUser toUser;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserList () {

		List<User> userList = userService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
		User user = userService.findOne(id);
		if (user == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(user), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<UserDTO> add(@RequestBody @Valid UserDTO newUser) {

		User savedUser = userService.save(toUser.convert(newUser));

		return new ResponseEntity<>(toDTO.convert(savedUser), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<UserDTO> edit(@RequestBody @Valid UserDTO user, @PathVariable Long id) {

		if (id != user.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		User persisted = userService.save(toUser.convert(user));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<UserDTO> delete(@PathVariable Long id) {
		User deleted = userService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByUsername/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListByUsername(@PathVariable myplugin.generator.fmmodel.FMType@19b90894 value) {

		List<User> userList = userService.findByUsername(value);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByName/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListByName(@PathVariable myplugin.generator.fmmodel.FMType@31886890 value) {

		List<User> userList = userService.findByName(value);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterBySurname/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListBySurname(@PathVariable myplugin.generator.fmmodel.FMType@68893a73 value) {

		List<User> userList = userService.findBySurname(value);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByDateOfBirth/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListByDateOfBirth(@PathVariable myplugin.generator.fmmodel.FMType@482c1790 value) {

		List<User> userList = userService.findByDateOfBirth(value);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByLocation/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListByLocation(@PathVariable myplugin.generator.fmmodel.FMType@19805ba9 value) {

		List<User> userList = userService.findByLocation(value);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByBiography/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListByBiography(@PathVariable myplugin.generator.fmmodel.FMType@6b3e6ce1 value) {

		List<User> userList = userService.findByBiography(value);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByHeight/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListByHeight(@PathVariable myplugin.generator.fmmodel.FMType@4a458957 value) {

		List<User> userList = userService.findByHeight(value);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByWeight/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListByWeight(@PathVariable myplugin.generator.fmmodel.FMType@627d9718 value) {

		List<User> userList = userService.findByWeight(value);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterBymyplugin.generator.fmmodel.FMType@79bbd5edId/{id}", method = RequestMethod.GET)
	ResponseEntity<List<UserDTO>> getUserListBymyplugin.generator.fmmodel.FMType@79bbd5edId(@PathVariable Long id) {

		List<User> userList = userService.findBymyplugin.generator.fmmodel.FMType@79bbd5edId(id);
			
		return new ResponseEntity<>(toDTO.convert(userList), HttpStatus.OK);
	}

}
