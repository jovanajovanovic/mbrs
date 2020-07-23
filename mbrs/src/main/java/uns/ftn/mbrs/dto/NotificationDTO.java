package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.model.NotificationType;
import uns.ftn.mbrs.dto.UserDTO;

public class NotificationDTO{
	private Long id;
	  	 private String description;
		
	  	 private date date;
		
	  	 private NotificationType type;
		
	     private UserDTO  user;
		
	
	
	
	public NotificationDTO(){}
	public NotificationDTO(Long id, 
			this.id = id;
 String description   ,
			this.id = id;
 date date   ,
			this.id = id;
 NotificationType type   ,
			this.id = id;
	 	UserDTO  user ){
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
			this.user  = user ;
		}
	public NotificationDTO(
 String description   ,
 date date   ,
 NotificationType type   ,
	 	UserDTO  user ){
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
			this.user  = user ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public String getDescription  (){
	           return description ;
	    }
	      
	    public void setDescription (String  description ){
	           this.description  = description ;
	    }
	    	
	      
	     
	    public date getDate  (){
	           return date ;
	    }
	      
	    public void setDate (date  date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public NotificationType getType  (){
	           return type ;
	    }
	      
	    public void setType (NotificationType  type ){
	           this.type  = type ;
	    }
	    	
	      
	     
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void ArrayListUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     

}