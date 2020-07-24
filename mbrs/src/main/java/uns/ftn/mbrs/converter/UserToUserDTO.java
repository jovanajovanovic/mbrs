package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.service.UserService;


import uns.ftn.mbrs.converter.UserSettingsToUserSettingsDTO;

@Component
public class UserToUserDTO implements Converter<User, UserDTO> {

	@Autowired
	private UserSettingsToUserSettingsDTO toUserSettingsDTO;

	@Override
	public UserDTO convert(User user) {
		UserDTO dto = new UserDTO();
		
		dto.setId(user.getId());
		dto.setUsername(user.getUsername());
		dto.setPassword(user.getPassword());
		dto.setName(user.getName());
		dto.setSurname(user.getSurname());
		dto.setDateOfBirth(user.getDateOfBirth());
		dto.setLocation(user.getLocation());
		dto.setBiography(user.getBiography());
		dto.setHeight(user.getHeight());
		dto.setWeight(user.getWeight());
		dto.setUserSettings(toUserSettingsDTO.convert(user.getUserSettings()));
		return dto;
	}
	
	public List<UserDTO> convert(List<User> userList){
		List<UserDTO> userDTOList = new ArrayList<>();
		
		for(User user : userList){
			userDTOList.add(convert(user));
		}
		
		return userDTOList;
	}
}