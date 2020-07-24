package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.User;

import java.util.Date;
import java.util.List;

public interface UserService extends CrudService<User> {

	List<User> findByUsername(String username);

	List<User> findByName(String name);

	List<User> findBySurname(String surname);

	List<User> findByDateOfBirth(Date dateOfBirth);

	List<User> findByLocation(String location);

	List<User> findByBiography(String biography);

	List<User> findByHeight(double height);

	List<User> findByWeight(double weight);

	List<User> findByUserSettingsId(Long id);

}