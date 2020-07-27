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
	public List<User> findByUserSettings(Long id) {
		return userRepository.findByUserSettings(id);
	}
	
}