package uns.ftn.mbrs.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import uns.ftn.mbrs.converter.UserToUserDTO;
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.repository.UserBasicRepository;
import uns.ftn.mbrs.service.UserBasicService;
import uns.ftn.mbrs.service.UserService;

import java.util.List;

@Primary
@Service
public class UserBasicServiceImpl implements UserBasicService {

    @Autowired
    private UserBasicRepository userRepository;

    @Autowired
    private UserService userService;

    @Override
    public UserDTO findByUsername(String username) {
        User findUser = userRepository.findByUsername(username).get(0) ;
        UserDTO dto = new UserToUserDTO().convert(findUser);
        return dto;
    }

    @Override
    public User findOne(Long id) {
        return userService.findOne(id);
    }

    @Override
    public User save(User user) {
        return userService.save(user);
    }

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }

    @Override
    public List<User> findByUserSettings(Long id) {
        return userService.findByUserSettings(id);
    }
}
