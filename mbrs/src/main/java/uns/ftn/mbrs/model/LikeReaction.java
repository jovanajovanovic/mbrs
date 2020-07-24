package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

import uns.ftn.mbrs.model.User;



@Entity
public class LikeReaction {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", referencedColumnName="id")
	     private User  user;
	
		public LikeReaction(){}
		
		public LikeReaction(Long id, 
		User   user
		){
			this.id = id; 
			this.user =  user;
		}
		
		public LikeReaction(User   user ){
			this.user  = user ;
		}
		
		public Long getId(){
		return id;
	}
	
		public void setId(Long id){
			this.id = id;
		}
	
	    public User  getUser (){
	           return user;
	    }
	      
	    public void setUser(User   User){
	           this.user = user;
	    }
	      
	
	}
