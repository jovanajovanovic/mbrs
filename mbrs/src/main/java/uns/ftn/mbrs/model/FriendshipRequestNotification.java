package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

import uns.ftn.mbrs.model.FriendshipRequest;
import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.model.NotificationType;



@Entity
public class FriendshipRequestNotification {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	  	 @OneToOne
	     private FriendshipRequest  friendshipRequest;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", referencedColumnName="id")
	     private User  user;
	     @Column
	     private String  description ;
	     @Column
	     private  Date  date ;
	     @Column
	     private NotificationType  type ;
	
		public FriendshipRequestNotification(){}
		
		public FriendshipRequestNotification(Long id, 
		FriendshipRequest   friendshipRequest,User   user,String   description , Date   date ,NotificationType   type 
		){
			this.id = id; 
			this.friendshipRequest =  friendshipRequest;
			this.user =  user;
			this.description  =  description ;
			this.date  =  date ;
			this.type  =  type ;
		}
		
		public FriendshipRequestNotification(FriendshipRequest   friendshipRequest ,User   user ,String   description  , Date   date  ,NotificationType   type  ){
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
	
	    public FriendshipRequest  getFriendshipRequest (){
	           return friendshipRequest;
	    }
	      
	    public void setFriendshipRequest(FriendshipRequest   FriendshipRequest){
	           this.friendshipRequest = friendshipRequest;
	    }
	      
	    public User  getUser (){
	           return user;
	    }
	      
	    public void setUser(User   User){
	           this.user = user;
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
	      
	
	}
