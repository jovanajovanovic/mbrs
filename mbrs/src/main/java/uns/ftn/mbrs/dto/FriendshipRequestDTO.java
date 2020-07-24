package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.model.FriendshipRequestStatus;
import uns.ftn.mbrs.dto.UserDTO;

public class FriendshipRequestDTO{
	private Long id;
	  	 private FriendshipRequestStatus  status;
		
	     private UserDTO  friendshipRequestor ;
		
	     private UserDTO  friendshipRequestee ;
		
	
	
	
	public FriendshipRequestDTO(){}
	public FriendshipRequestDTO(Long id, FriendshipRequestStatus status,UserDTO  friendshipRequestor,UserDTO  friendshipRequestee){
		this.id = id;
			this.status   = status  ;
			this.friendshipRequestor   = friendshipRequestor  ;
			this.friendshipRequestee   = friendshipRequestee  ;
		}
	public FriendshipRequestDTO( FriendshipRequestStatus  status   ,UserDTO  friendshipRequestor  ,UserDTO  friendshipRequestee  ){
			this.status   = status  ;
			this.friendshipRequestor   = friendshipRequestor  ;
			this.friendshipRequestee   = friendshipRequestee  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public FriendshipRequestStatus  getStatus  (){
	           return status ;
	    }
	      
	    public void setStatus (FriendshipRequestStatus   status ){
	           this.status  = status ;
	    }
	    	
	      
	     
	    public UserDTO getFriendshipRequestor  (){
	           return friendshipRequestor ;
	    }
	      
	    public void ArrayListFriendshipRequestor (UserDTO  friendshipRequestor ){
	           this.friendshipRequestor  = friendshipRequestor ;
	    }
	    
	      
	     
	    public UserDTO getFriendshipRequestee  (){
	           return friendshipRequestee ;
	    }
	      
	    public void ArrayListFriendshipRequestee (UserDTO  friendshipRequestee ){
	           this.friendshipRequestee  = friendshipRequestee ;
	    }
	    
	      
	     

}