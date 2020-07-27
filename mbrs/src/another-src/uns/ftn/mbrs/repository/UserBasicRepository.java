package uns.ftn.mbrs.repository;

import org.springframework.stereotype.Repository;
import uns.ftn.mbrs.model.User;

import java.util.List;

@Repository
public interface UserBasicRepository extends UserRepository{

    List<User> findByUsername(String username);
}
