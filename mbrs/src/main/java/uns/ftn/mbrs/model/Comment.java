package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.model.Post;



@Entity
public class Comment {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private String  text ;
	     @Column
	     private  Date  date ;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", nullable=false)
	     private User  user;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="post_id", nullable=false)
	     private Post  post;
	
		public Comment(){}
		
		public Comment(Long id, 
		String   text , Date   date ,User   user,Post   post
		){
			this.id = id; 
			this.text  =  text ;
			this.date  =  date ;
			this.user =  user;
			this.post =  post;
		}
		
		public Comment(String   text  , Date   date  ,User   user ,Post   post ){
			this.text   = text  ;
			this.date   = date  ;
			this.user  = user ;
			this.post  = post ;
		}
		
		public Long getId(){
		return id;
	}
	
		public void setId(Long id){
			this.id = id;
		}
	
	    public String  getText  (){
	           return text ;
	    }
	      
	    public void setText (String   text ){
	           this.text  = text ;
	    }
	      
	    public  Date  getDate  (){
	           return date ;
	    }
	      
	    public void setDate ( Date   date ){
	           this.date  = date ;
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
