package uns.ftn.mbrs.service;

import org.springframework.beans.factory.annotation.Autowired;
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.repository.UserBasicRepository;

public interface UserBasicService extends UserService{



    UserDTO findByUsername(String username);
}
