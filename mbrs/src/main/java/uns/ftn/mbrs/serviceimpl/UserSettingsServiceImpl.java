package uns.ftn.mbrs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.UserSettings;
import uns.ftn.mbrs.repository.UserSettingsRepository;
import uns.ftn.mbrs.service.UserSettingsService;
import uns.ftn.mbrs.model.*;

import java.util.Date;


@Service
@Transactional
public class UserSettingsServiceImpl implements UserSettingsService {

	@Autowired
	private UserSettingsRepository userSettingsRepository;
	
	@Override
	public UserSettings findOne(Long id) {
		return userSettingsRepository.findById(id).get();
	}

	@Override
	public List<UserSettings> findAll() {
		return userSettingsRepository.findAll();
	}

	@Override
	public UserSettings save(UserSettings userSettings) {
		return userSettingsRepository.save(userSettings);
	}
	
	@Override
	public UserSettings remove(Long id) {
		UserSettings userSettings = userSettingsRepository.findById(id).get();
		if(userSettings == null){
			throw new IllegalArgumentException("Tried to delete non-existant UserSettings");
		}
		userSettingsRepository.delete(userSettings);
		return userSettings;
	}
	
	@Override
	public List<UserSettings> findByUserInfoPrivacy(Visibility  userInfoPrivacy) {
		return userSettingsRepository.findByUserInfoPrivacy(userInfoPrivacy);
	}
	
	@Override
	public List<UserSettings> findByPostPrivacy(Visibility  postPrivacy) {
		return userSettingsRepository.findByPostPrivacy(postPrivacy);
	}
	
	@Override
	public List<UserSettings> findByGoalPrivacy(Visibility  goalPrivacy) {
		return userSettingsRepository.findByGoalPrivacy(goalPrivacy);
	}
	
	@Override
	public List<UserSettings> findByNewComments(Boolean  newComments) {
		return userSettingsRepository.findByNewComments(newComments);
	}
	
	@Override
	public List<UserSettings> findByNewLikes(Boolean  newLikes) {
		return userSettingsRepository.findByNewLikes(newLikes);
	}
	
	@Override
	public List<UserSettings> findByFriendshipRequest(Boolean  friendshipRequest) {
		return userSettingsRepository.findByFriendshipRequest(friendshipRequest);
	}
	
	@Override
	public List<UserSettings> findByAcceptedFriendship(Boolean  acceptedFriendship) {
		return userSettingsRepository.findByAcceptedFriendship(acceptedFriendship);
	}
	
	@Override
	public List<UserSettings> findByActivityRequest(Boolean  activityRequest) {
		return userSettingsRepository.findByActivityRequest(activityRequest);
	}
	
	@Override
	public List<UserSettings> findByAcceptedActivity(Boolean  acceptedActivity) {
		return userSettingsRepository.findByAcceptedActivity(acceptedActivity);
	}
	
	@Override
	public List<UserSettings> findByCanceledActivity(Boolean  canceledActivity) {
		return userSettingsRepository.findByCanceledActivity(canceledActivity);
	}
	
	@Override
	public List<UserSettings> findByNightTheme(Boolean  nightTheme) {
		return userSettingsRepository.findByNightTheme(nightTheme);
	}
	
}