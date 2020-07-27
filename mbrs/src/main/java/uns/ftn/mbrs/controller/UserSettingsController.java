package uns.ftn.mbrs.controller;

import java.util.List;
import java.util.Date;
import uns.ftn.mbrs.model.*;


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
	protected UserSettingsService userSettingsService;
	
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

	
	
}
