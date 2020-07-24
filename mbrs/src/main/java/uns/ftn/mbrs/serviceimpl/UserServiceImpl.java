package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.repository.UserRepository;
import uns.ftn.mbrs.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findOne(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public User remove(Long id) {
		User user = userRepository.findOne(id);
		if(user == null){
			throw new IllegalArgumentException("Tried to delete non-existant User");
		}
		userRepository.delete(user);
		return user;
	}
	
	public List<User> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	public List<User> findByName(String name) {
		return userRepository.findByName(name);
	}
	
	public List<User> findBySurname(String surname) {
		return userRepository.findBySurname(surname);
	}
	
	public List<User> findByDateOfBirth(date dateOfBirth) {
		return userRepository.findByDateOfBirth(dateOfBirth);
	}
	
	public List<User> findByLocation(String location) {
		return userRepository.findByLocation(location);
	}
	
	public List<User> findByBiography(String biography) {
		return userRepository.findByBiography(biography);
	}
	
	public List<User> findByHeight(double height) {
		return userRepository.findByHeight(height);
	}
	
	public List<User> findByWeight(double weight) {
		return userRepository.findByWeight(weight);
	}
	
	public List<User> findByUserSettingsId(Long id) {
		return userRepository.findByUserSettingsId(id);
	}
	
}