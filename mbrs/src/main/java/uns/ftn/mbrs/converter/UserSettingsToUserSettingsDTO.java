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
public class UserSettingsToUserSettingsDTO implements Converter<UserSettings, UserSettingsDTO> {


	@Override
	public UserSettingsDTO convert(UserSettings userSettings) {
		UserSettingsDTO dto = new UserSettingsDTO();
		
		dto.setId(userSettings.getId());
		dto.setUserInfoPrivacy(userSettings.getUserInfoPrivacy());

		dto.setPostPrivacy(userSettings.getPostPrivacy());

		dto.setGoalPrivacy(userSettings.getGoalPrivacy());

		dto.setNewComments(userSettings.getNewComments());

		dto.setNewLikes(userSettings.getNewLikes());

		dto.setFriendshipRequest(userSettings.getFriendshipRequest());

		dto.setAcceptedFriendship(userSettings.getAcceptedFriendship());

		dto.setActivityRequest(userSettings.getActivityRequest());

		dto.setAcceptedActivity(userSettings.getAcceptedActivity());

		dto.setCanceledActivity(userSettings.getCanceledActivity());

		dto.setNightTheme(userSettings.getNightTheme());

		return dto;
	}
	
	public List<UserSettingsDTO> convert(List<UserSettings> userSettingsList){
		List<UserSettingsDTO> userSettingsDTOList = new ArrayList<>();
		
		for(UserSettings userSettings : userSettingsList){
			userSettingsDTOList.add(convert(userSettings));
		}
		
		return userSettingsDTOList;
	}
}