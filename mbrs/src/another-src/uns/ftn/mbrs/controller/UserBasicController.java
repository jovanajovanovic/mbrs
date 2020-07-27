package uns.ftn.mbrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.service.UserBasicService;

@RestController
@RequestMapping(value="/api/user1")
public class UserBasicController extends UserController {

    @Autowired
    private UserBasicService userBasicService;

    @GetMapping(value = "findByUsername/{username}", produces = "application/json")
    ResponseEntity<UserDTO> getByUsername(@PathVariable String username){
        UserDTO result = userBasicService.findByUsername(username);
        return new ResponseEntity<UserDTO>(result, HttpStatus.OK);
    }


}
