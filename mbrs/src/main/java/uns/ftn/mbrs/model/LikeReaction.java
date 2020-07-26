package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.model.Post;



@Entity
public class LikeReaction {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", nullable=false)
	     private User  user;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="post_id", nullable=false)
	     private Post  post;
	
		public LikeReaction(){}
		
		public LikeReaction(Long id, 
		User   user,Post   post
		){
			this.id = id; 
			this.user =  user;
			this.post =  post;
		}
		
		public LikeReaction(User   user ,Post   post ){
			this.user  = user ;
			this.post  = post ;
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
	      
	    public Post  getPost (){
	           return post;
	    }
	      
	    public void setPost(Post   Post){
	           this.post = post;
	    }
	      
	
	}
