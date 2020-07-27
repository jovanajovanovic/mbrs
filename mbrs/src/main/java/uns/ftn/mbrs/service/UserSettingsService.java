package uns.ftn.mbrs.service;

import uns.ftn.mbrs.model.UserSettings;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;

public interface UserSettingsService{

	
	UserSettings findOne(Long id); 
	
	UserSettings save(UserSettings userSettings);
	
	List<UserSettings> findAll();
	

}