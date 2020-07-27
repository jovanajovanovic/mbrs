package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.User;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface UserService{

	
	User findOne(Long id); 
	
	User save(User user);
	
	List<User> findAll();
	

	List<User> findByUserSettings(Long id);

}