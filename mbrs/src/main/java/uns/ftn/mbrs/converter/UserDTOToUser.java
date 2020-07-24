package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.service.UserService;

@Component
public class UserDTOToUser implements Converter<UserDTO, User>{

	@Autowired
	private UserSettingsDTOToUserSettings toUserSettings;
	
	@Autowired
	UserService userService;
	
	@Override
	public User convert(UserDTO dto){
		User user = new User();
		
		if (dto.getId() != null) {
			user = userService.findOne(dto.getId());
			
			if(user == null){
				throw new IllegalStateException("user not exists in db");
			}
		}
		
		user.setId(dto.getId());
		
		user.setUsername(dto.getUsername());
		user.setPassword(dto.getPassword());
		user.setName(dto.getName());
		user.setSurname(dto.getSurname());
		user.setDateOfBirth(dto.getDateOfBirth());
		user.setLocation(dto.getLocation());
		user.setBiography(dto.getBiography());
		user.setHeight(dto.getHeight());
		user.setWeight(dto.getWeight());
		user.setUserSettings(toUserSettings.convert(dto.getUserSettings()));
		
		return user;
	}
	
	public List<User> convert (List<UserDTO> userDTOList){
		List<User> userList = new ArrayList<>();
		
		for(UserDTO dto : userDTOList){
			userList.add(convert(dto));
		}
		
		return userList;
	}
	
	
}