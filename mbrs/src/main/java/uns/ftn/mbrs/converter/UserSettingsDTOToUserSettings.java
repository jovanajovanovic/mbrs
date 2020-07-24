package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.UserSettings;
import uns.ftn.mbrs.dto.UserSettingsDTO;
import uns.ftn.mbrs.service.UserSettingsService;

@Component
public class UserSettingsDTOToUserSettings implements Converter<UserSettingsDTO, UserSettings>{

	
	@Autowired
	UserSettingsService userSettingsService;
	
	@Override
	public UserSettings convert(UserSettingsDTO dto){
		UserSettings userSettings = new UserSettings();
		
		if (dto.getId() != null) {
			userSettings = userSettingsService.findOne(dto.getId());
			
			if(userSettings == null){
				throw new IllegalStateException("userSettings not exists in db");
			}
		}
		
		userSettings.setId(dto.getId());
		
		userSettings.setUserInfoPrivacy(dto.getUserInfoPrivacy());
		userSettings.setPostPrivacy(dto.getPostPrivacy());
		userSettings.setGoalPrivacy(dto.getGoalPrivacy());
		userSettings.setNewComments(dto.getNewComments());
		userSettings.setNewLikes(dto.getNewLikes());
		userSettings.setFriendshipRequest(dto.getFriendshipRequest());
		userSettings.setAcceptedFriendship(dto.getAcceptedFriendship());
		userSettings.setActivityRequest(dto.getActivityRequest());
		userSettings.setAcceptedActivity(dto.getAcceptedActivity());
		userSettings.setCanceledActivity(dto.getCanceledActivity());
		userSettings.setNightTheme(dto.getNightTheme());
		
		return userSettings;
	}
	
	public List<UserSettings> convert (List<UserSettingsDTO> userSettingsDTOList){
		List<UserSettings> userSettingsList = new ArrayList<>();
		
		for(UserSettingsDTO dto : userSettingsDTOList){
			userSettingsList.add(convert(dto));
		}
		
		return userSettingsList;
	}
	
	
}