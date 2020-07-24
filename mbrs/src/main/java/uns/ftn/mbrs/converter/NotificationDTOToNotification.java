package uns.ftn.mbrs.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import uns.ftn.mbrs.model.Notification;
import uns.ftn.mbrs.dto.NotificationDTO;
import uns.ftn.mbrs.service.NotificationService;

@Component
public class NotificationDTOToNotification implements Converter<NotificationDTO, Notification>{

	
	@Autowired
	NotificationService notificationService;
	
	@Override
	public Notification convert(NotificationDTO dto){
		Notification notification = new Notification();
		
		if (dto.getId() != null) {
			notification = notificationService.findOne(dto.getId());
			
			if(notification == null){
				throw new IllegalStateException("notification not exists in db");
			}
		}
		
		notification.setId(dto.getId());
		
		notification.setDescription(dto.getDescription());
		notification.setDate(dto.getDate());
		notification.setType(dto.getType());
		
		return notification;
	}
	
	public List<Notification> convert (List<NotificationDTO> notificationDTOList){
		List<Notification> notificationList = new ArrayList<>();
		
		for(NotificationDTO dto : notificationDTOList){
			notificationList.add(convert(dto));
		}
		
		return notificationList;
	}
	
	
}