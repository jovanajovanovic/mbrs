package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.model.NotificationType;
import uns.ftn.mbrs.dto.UserDTO;

public class NotificationDTO{
	private Long id;
	  	 private String  description;
		
	  	 private  Date  date;
		
	  	 private NotificationType  type;
		
	     private UserDTO  user;
		
	
	
	
	public NotificationDTO(){}
	public NotificationDTO(Long id, String description, Date date,NotificationType type,UserDTO  user){
		this.id = id;
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
			this.user  = user ;
		}
	public NotificationDTO( String  description   ,  Date  date   , NotificationType  type   ,UserDTO  user ){
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
			this.user  = user ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public String  getDescription  (){
	           return description ;
	    }
	      
	    public void setDescription (String   description ){
	           this.description  = description ;
	    }
	    	
	      
	     
	    public  Date  getDate  (){
	           return date ;
	    }
	      
	    public void setDate ( Date   date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public NotificationType  getType  (){
	           return type ;
	    }
	      
	    public void setType (NotificationType   type ){
	           this.type  = type ;
	    }
	    	
	      
	     
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void ArrayListUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     

}