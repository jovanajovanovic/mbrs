package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.dto.FriendshipRequestDTO;

public class FriendshipRequestNotificationDTO{
	private Long id;
	     private FriendshipRequestDTO  friendshipRequest;
		
	
	
	
	public FriendshipRequestNotificationDTO(){}
	public FriendshipRequestNotificationDTO(Long id, FriendshipRequestDTO  friendshipRequest){
		this.id = id;
			this.friendshipRequest  = friendshipRequest ;
		}
	public FriendshipRequestNotificationDTO(FriendshipRequestDTO  friendshipRequest ){
			this.friendshipRequest  = friendshipRequest ;
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
	      
	    public void ArrayListFriendshipRequest(FriendshipRequestDTO  FriendshipRequest){
	           this.friendshipRequest = friendshipRequest;
	    }
	    
	      
	     

}