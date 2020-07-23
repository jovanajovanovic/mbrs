package uns.ftn.mbrs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uns.ftn.mbrs.model.UserSettings;
import uns.ftn.mbrs.repository.UserSettingsRepository;
import uns.ftn.mbrs.service.UserSettingsService;


@Service
@Transactional
public class UserSettingsServiceImpl implements UserSettingsService {

	@Autowired
	private UserSettingsRepository userSettingsRepository;
	
	@Override
	public UserSettings findOne(Long id) {
		return userSettingsRepository.findOne(id);
	}

	@Override
	public List<UserSettings> findAll() {
		return userSettingsRepository.findAll();
	}

	@Override
	public UserSettings save(UserSettings userSettings) {
		return userSettingsRepository.save(userSettings);
	}
	
	public UserSettings remove(Long id) {
		UserSettings userSettings = userSettingsRepository.findOne(id);
		if(userSettings == null){
			throw new IllegalArgumentException("Tried to delete non-existant UserSettings");
		}
		userSettingsRepository.delete(userSettings);
		return userSettings;
	}
	
	public List<UserSettings> findByUserInfoPrivacy(Visibility userInfoPrivacy) {
		return userSettingsRepository.findByUserInfoPrivacy(userInfoPrivacy);
	}
	
	public List<UserSettings> findByPostPrivacy(Visibility postPrivacy) {
		return userSettingsRepository.findByPostPrivacy(postPrivacy);
	}
	
	public List<UserSettings> findByGoalPrivacy(Visibility goalPrivacy) {
		return userSettingsRepository.findByGoalPrivacy(goalPrivacy);
	}
	
	public List<UserSettings> findByNewComments(Boolean newComments) {
		return userSettingsRepository.findByNewComments(newComments);
	}
	
	public List<UserSettings> findByNewLikes(Boolean newLikes) {
		return userSettingsRepository.findByNewLikes(newLikes);
	}
	
	public List<UserSettings> findByFriendshipRequest(Boolean friendshipRequest) {
		return userSettingsRepository.findByFriendshipRequest(friendshipRequest);
	}
	
	public List<UserSettings> findByAcceptedFriendship(Boolean acceptedFriendship) {
		return userSettingsRepository.findByAcceptedFriendship(acceptedFriendship);
	}
	
	public List<UserSettings> findByActivityRequest(Boolean activityRequest) {
		return userSettingsRepository.findByActivityRequest(activityRequest);
	}
	
	public List<UserSettings> findByAcceptedActivity(Boolean acceptedActivity) {
		return userSettingsRepository.findByAcceptedActivity(acceptedActivity);
	}
	
	public List<UserSettings> findByCanceledActivity(Boolean canceledActivity) {
		return userSettingsRepository.findByCanceledActivity(canceledActivity);
	}
	
	public List<UserSettings> findByNightTheme(Boolean nightTheme) {
		return userSettingsRepository.findByNightTheme(nightTheme);
	}
	
}