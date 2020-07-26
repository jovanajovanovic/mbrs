package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.repository.UserRepository;
import uns.ftn.mbrs.service.UserService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findOne(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public User remove(Long id) {
		User user = userRepository.findById(id).get();
		if(user == null){
			throw new IllegalArgumentException("Tried to delete non-existant User");
		}
		userRepository.delete(user);
		return user;
	}
	
	@Override
	public List<User> findByUsername(String  username) {
		return userRepository.findByUsername(username);
	}
	
	@Override
	public List<User> findByName(String  name) {
		return userRepository.findByName(name);
	}
	
	@Override
	public List<User> findBySurname(String  surname) {
		return userRepository.findBySurname(surname);
	}
	
	@Override
	public List<User> findByDateOfBirth( Date  dateOfBirth) {
		return userRepository.findByDateOfBirth(dateOfBirth);
	}
	
	@Override
	public List<User> findByLocation(String  location) {
		return userRepository.findByLocation(location);
	}
	
	@Override
	public List<User> findByBiography(String  biography) {
		return userRepository.findByBiography(biography);
	}
	
	@Override
	public List<User> findByHeight(double  height) {
		return userRepository.findByHeight(height);
	}
	
	@Override
	public List<User> findByWeight(double  weight) {
		return userRepository.findByWeight(weight);
	}
	
	@Override
	public List<User> findByUserSettings(Long id) {
		return userRepository.findByUserSettings(id);
	}
	
}