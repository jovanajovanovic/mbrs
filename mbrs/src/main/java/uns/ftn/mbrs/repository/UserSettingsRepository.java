package uns.ftn.mbrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

import uns.ftn.mbrs.model.UserSettings;


@Repository
public interface UserSettingsRepository extends JpaRepository<UserSettings, Long> {

	List<UserSettings> findByUserInfoPrivacy(Visibility  userInfoPrivacy);
	
	List<UserSettings> findByPostPrivacy(Visibility  postPrivacy);
	
	List<UserSettings> findByGoalPrivacy(Visibility  goalPrivacy);
	
	List<UserSettings> findByNewComments(Boolean  newComments);
	
	List<UserSettings> findByNewLikes(Boolean  newLikes);
	
	List<UserSettings> findByFriendshipRequest(Boolean  friendshipRequest);
	
	List<UserSettings> findByAcceptedFriendship(Boolean  acceptedFriendship);
	
	List<UserSettings> findByActivityRequest(Boolean  activityRequest);
	
	List<UserSettings> findByAcceptedActivity(Boolean  acceptedActivity);
	
	List<UserSettings> findByCanceledActivity(Boolean  canceledActivity);
	
	List<UserSettings> findByNightTheme(Boolean  nightTheme);
	
}