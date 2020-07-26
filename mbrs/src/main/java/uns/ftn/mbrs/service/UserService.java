package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.User;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface UserService{


	User findOne(Long id); 
	
	User save(User user);
		
	List<User> findAll();
	
	User remove(Long id);
	

	List<User> findByUsername(String  username);

	List<User> findByName(String  name);

	List<User> findBySurname(String  surname);

	List<User> findByDateOfBirth( Date  dateOfBirth);

	List<User> findByLocation(String  location);

	List<User> findByBiography(String  biography);

	List<User> findByHeight(double  height);

	List<User> findByWeight(double  weight);

	List<User> findByUserSettings(Long id);

}