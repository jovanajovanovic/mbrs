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
public class NotificationToNotificationDTO implements Converter<Notification, NotificationDTO> {


	@Override
	public NotificationDTO convert(Notification notification) {
		NotificationDTO dto = new NotificationDTO();
		
		dto.setId(notification.getId());
		dto.setDescription(notification.getDescription());

		dto.setDate(notification.getDate());

		dto.setType(notification.getType());

		return dto;
	}
	
	public List<NotificationDTO> convert(List<Notification> notificationList){
		List<NotificationDTO> notificationDTOList = new ArrayList<>();
		
		for(Notification notification : notificationList){
			notificationDTOList.add(convert(notification));
		}
		
		return notificationDTOList;
	}
}