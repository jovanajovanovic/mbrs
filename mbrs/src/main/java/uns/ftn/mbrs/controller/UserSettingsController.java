package uns.ftn.mbrs.controller;

import java.util.List;

import uns.ftn.mbrs.model.UserSettings;
import uns.ftn.mbrs.service.UserSettingsService;
import uns.ftn.mbrs.converter.UserSettingsDTOToUserSettings;
import uns.ftn.mbrs.converter.UserSettingsToUserSettingsDTO;
import uns.ftn.mbrs.dto.UserSettingsDTO;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/userSettings")
public class UserSettingsController {  

	@Autowired
	private UserSettingsService userSettingsService;
	
	@Autowired
	private UserSettingsToUserSettingsDTO toDTO;
	
	@Autowired
	private UserSettingsDTOToUserSettings toUserSettings;
	
	@RequestMapping(method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsList () {

		List<UserSettings> userSettingsList = userSettingsService.findAll();
	
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	ResponseEntity<UserSettingsDTO> getUserSettings(@PathVariable Long id) {
		UserSettings userSettings = userSettingsService.findOne(id);
		if (userSettings == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(userSettings), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<UserSettingsDTO> add(@RequestBody @Valid UserSettingsDTO newUserSettings) {

		UserSettings savedUserSettings = userSettingsService.save(toUserSettings.convert(newUserSettings));

		return new ResponseEntity<>(toDTO.convert(savedUserSettings), HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public ResponseEntity<UserSettingsDTO> edit(@RequestBody @Valid UserSettingsDTO userSettings, @PathVariable Long id) {

		if (id != userSettings.getId()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		UserSettings persisted = userSettingsService.save(toUserSettings.convert(userSettings));

		return new ResponseEntity<>(toDTO.convert(persisted), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	ResponseEntity<UserSettingsDTO> delete(@PathVariable Long id) {
		UserSettings deleted = userSettingsService.remove(id);

		return new ResponseEntity<>(toDTO.convert(deleted), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByUserInfoPrivacy/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByUserInfoPrivacy(@PathVariable myplugin.generator.fmmodel.FMType@23003666 value) {

		List<UserSettings> userSettingsList = userSettingsService.findByUserInfoPrivacy(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByPostPrivacy/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByPostPrivacy(@PathVariable myplugin.generator.fmmodel.FMType@32092bc3 value) {

		List<UserSettings> userSettingsList = userSettingsService.findByPostPrivacy(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByGoalPrivacy/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByGoalPrivacy(@PathVariable myplugin.generator.fmmodel.FMType@55f487fe value) {

		List<UserSettings> userSettingsList = userSettingsService.findByGoalPrivacy(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByNewComments/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByNewComments(@PathVariable myplugin.generator.fmmodel.FMType@273abe4b value) {

		List<UserSettings> userSettingsList = userSettingsService.findByNewComments(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByNewLikes/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByNewLikes(@PathVariable myplugin.generator.fmmodel.FMType@5ab0fcc value) {

		List<UserSettings> userSettingsList = userSettingsService.findByNewLikes(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByFriendshipRequest/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByFriendshipRequest(@PathVariable myplugin.generator.fmmodel.FMType@7e876b89 value) {

		List<UserSettings> userSettingsList = userSettingsService.findByFriendshipRequest(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByAcceptedFriendship/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByAcceptedFriendship(@PathVariable myplugin.generator.fmmodel.FMType@fbdd8d0 value) {

		List<UserSettings> userSettingsList = userSettingsService.findByAcceptedFriendship(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByActivityRequest/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByActivityRequest(@PathVariable myplugin.generator.fmmodel.FMType@7d87e78a value) {

		List<UserSettings> userSettingsList = userSettingsService.findByActivityRequest(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByAcceptedActivity/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByAcceptedActivity(@PathVariable myplugin.generator.fmmodel.FMType@200f5299 value) {

		List<UserSettings> userSettingsList = userSettingsService.findByAcceptedActivity(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByCanceledActivity/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByCanceledActivity(@PathVariable myplugin.generator.fmmodel.FMType@6591ae32 value) {

		List<UserSettings> userSettingsList = userSettingsService.findByCanceledActivity(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

	@RequestMapping(value = "/filterByNightTheme/{value}", method = RequestMethod.GET)
	ResponseEntity<List<UserSettingsDTO>> getUserSettingsListByNightTheme(@PathVariable myplugin.generator.fmmodel.FMType@48b8108 value) {

		List<UserSettings> userSettingsList = userSettingsService.findByNightTheme(value);
			
		return new ResponseEntity<>(toDTO.convert(userSettingsList), HttpStatus.OK);
	}

}
