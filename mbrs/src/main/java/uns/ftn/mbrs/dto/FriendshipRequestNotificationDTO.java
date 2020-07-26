package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.dto.FriendshipRequestDTO;
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.model.NotificationType;

public class FriendshipRequestNotificationDTO{
	private Long id;
	     private FriendshipRequestDTO  friendshipRequest;
		
	     private UserDTO  user;
		
	  	 private String  description;
		
	  	 private  Date  date;
		
	  	 private NotificationType  type;
		
	
	
	
	public FriendshipRequestNotificationDTO(){}
	public FriendshipRequestNotificationDTO(Long id, FriendshipRequestDTO  friendshipRequest,UserDTO  user,String description, Date date,NotificationType type){
		this.id = id;
			this.friendshipRequest  = friendshipRequest ;
			this.user  = user ;
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
		}
	public FriendshipRequestNotificationDTO(FriendshipRequestDTO  friendshipRequest ,UserDTO  user , String  description   ,  Date  date   , NotificationType  type   ){
			this.friendshipRequest  = friendshipRequest ;
			this.user  = user ;
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public FriendshipRequestDTO getFriendshipRequest (){
	           return friendshipRequest;
	    }
	      
	    public void setFriendshipRequest(FriendshipRequestDTO  FriendshipRequest){
	           this.friendshipRequest = friendshipRequest;
	    }
	    
	      
	     
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void setUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     
	    public String  getDescription (){
	           return description ;
	    }
	      
	    public void setDescription (String  description ){
	           this.description  = description ;
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
	    	
	      
	     

}