package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

import uns.ftn.mbrs.model.FriendshipRequest;



@Entity
public class FriendshipRequestNotification {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	  	 @OneToOne
	     private FriendshipRequest  friendshipRequest;
	
		public FriendshipRequestNotification(){}
		
		public FriendshipRequestNotification(Long id, 
		FriendshipRequest  friendshipRequest
		){
			this.id = id; 
			this.friendshipRequest =  friendshipRequest;
		}
		
		public FriendshipRequestNotification(FriendshipRequest  friendshipRequest ){
			this.friendshipRequest  = friendshipRequest ;
		}
		
		public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public FriendshipRequest getFriendshipRequest (){
	           return friendshipRequest;
	    }
	      
	    public void setFriendshipRequest(FriendshipRequest  FriendshipRequest){
	           this.friendshipRequest = friendshipRequest;
	    }
	      
	
	}
