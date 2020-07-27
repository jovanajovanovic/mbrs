package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.UserSettings;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface UserSettingsService{


	UserSettings findOne(Long id); 
	
	UserSettings save(UserSettings userSettings);
		
	List<UserSettings> findAll();
	
	UserSettings remove(Long id);
	

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