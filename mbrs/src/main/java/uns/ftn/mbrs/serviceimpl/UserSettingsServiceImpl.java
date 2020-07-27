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
	
	
}