package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

import uns.ftn.mbrs.model.FriendshipRequestStatus;
import uns.ftn.mbrs.model.User;



@Entity
public class FriendshipRequest {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private FriendshipRequestStatus  status ;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", referencedColumnName="id")
	     private User  friendshipRequestor ;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", referencedColumnName="id")
	     private User  friendshipRequestee ;
	
		public FriendshipRequest(){}
		
		public FriendshipRequest(Long id, 
		FriendshipRequestStatus   status ,User   friendshipRequestor ,User   friendshipRequestee 
		){
			this.id = id; 
			this.status  =  status ;
			this.friendshipRequestor  =  friendshipRequestor ;
			this.friendshipRequestee  =  friendshipRequestee ;
		}
		
		public FriendshipRequest(FriendshipRequestStatus   status  ,User   friendshipRequestor  ,User   friendshipRequestee  ){
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
	      
	    public User  getFriendshipRequestor  (){
	           return friendshipRequestor ;
	    }
	      
	    public void setFriendshipRequestor (User   friendshipRequestor ){
	           this.friendshipRequestor  = friendshipRequestor ;
	    }
	      
	    public User  getFriendshipRequestee  (){
	           return friendshipRequestee ;
	    }
	      
	    public void setFriendshipRequestee (User   friendshipRequestee ){
	           this.friendshipRequestee  = friendshipRequestee ;
	    }
	      
	
	}
