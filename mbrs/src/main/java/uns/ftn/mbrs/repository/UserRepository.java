package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uns.ftn.mbrs.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByUsername(String username);
	
	List<User> findByName(String name);
	
	List<User> findBySurname(String surname);
	
	List<User> findByDateOfBirth(date dateOfBirth);
	
	List<User> findByLocation(String location);
	
	List<User> findByBiography(String biography);
	
	List<User> findByHeight(double height);
	
	List<User> findByWeight(double weight);
	
	List<User> findByUserSettingsId(Long id);

}