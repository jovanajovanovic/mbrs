package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.dto.ActivityRequestDTO;
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.model.NotificationType;

public class ActivityRequestNotificationDTO{
	private Long id;
	     private ActivityRequestDTO  activityRequest;
		
	     private UserDTO  user;
		
	  	 private  Date  date;
		
	  	 private NotificationType  type;
		
	  	 private String  description;
		
	
	
	
	public ActivityRequestNotificationDTO(){}
	public ActivityRequestNotificationDTO(Long id, ActivityRequestDTO  activityRequest,UserDTO  user, Date date,NotificationType type,String description){
		this.id = id;
			this.activityRequest  = activityRequest ;
			this.user  = user ;
			this.date   = date  ;
			this.type   = type  ;
			this.description   = description  ;
		}
	public ActivityRequestNotificationDTO(ActivityRequestDTO  activityRequest ,UserDTO  user ,  Date  date   , NotificationType  type   , String  description   ){
			this.activityRequest  = activityRequest ;
			this.user  = user ;
			this.date   = date  ;
			this.type   = type  ;
			this.description   = description  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public ActivityRequestDTO getActivityRequest (){
	           return activityRequest;
	    }
	      
	    public void setActivityRequest(ActivityRequestDTO  ActivityRequest){
	           this.activityRequest = activityRequest;
	    }
	    
	      
	     
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void setUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     
	    public  Date  getDate (){
	           return date ;
	    }
	      
	    public void setDate (Date date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public NotificationType  getType (){
	           return type ;
	    }
	      
	    public void setType (NotificationType  type ){
	           this.type  = type ;
	    }
	    	
	      
	     
	    public String  getDescription (){
	           return description ;
	    }
	      
	    public void setDescription (String  description ){
	           this.description  = description ;
	    }
	    	
	      
	     

}