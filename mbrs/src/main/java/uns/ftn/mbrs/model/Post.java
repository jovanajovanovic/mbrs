package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import uns.ftn.mbrs.model.Visibility;
import uns.ftn.mbrs.model.LikeReaction;
import uns.ftn.mbrs.model.Comment;
import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.model.Activity;


@Table(name="post")
@Entity
public class Post {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private String  description ;
	 	
	     @Column
	     private Visibility  visibility ;
	 	
	     @OneToMany
	     private Set<LikeReaction >  likeReaction = new HashSet<LikeReaction>();
	     @OneToMany
	     private Set<Comment >  comment = new HashSet<Comment>();
		 @ManyToOne(fetch=FetchType.LAZY)
	     private User  user;
	 	
	  	 @OneToOne
	     private Activity  activity;
	 	
	
		public Post(){}
		
		public Post(Long id, 
		String   description ,Visibility   visibility ,Set<LikeReaction >  likeReaction,Set<Comment >  comment,User   user,Activity   activity
		){
			this.id = id; 
			this.description  =  description ;
			this.visibility  =  visibility ;
			this.likeReaction  =  likeReaction ;
			this.comment  =  comment ;
			this.user =  user;
			this.activity =  activity;
		}
		
		public Post(String   description  ,Visibility   visibility  ,Set<LikeReaction >  likeReaction ,Set<Comment >  comment ,User   user ,Activity   activity ){
			this.description   = description  ;
			this.visibility   = visibility  ;
			this.likeReaction  =  likeReaction ;
			this.comment  =  comment ;
			this.user  = user ;
			this.activity  = activity ;
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
	      
	    public Visibility  getVisibility  (){
	           return visibility ;
	    }
	      
	    public void setVisibility (Visibility   visibility ){
	           this.visibility  = visibility ;
	    }
	      
	    public Set<LikeReaction > getLikeReaction(){
	           return  likeReaction;
	    }
	      
	    public void setLikeReaction( Set<LikeReaction >  likeReaction){
	           this.likeReaction = likeReaction;
	    }
	      
	    public Set<Comment > getComment(){
	           return  comment;
	    }
	      
	    public void setComment( Set<Comment >  comment){
	           this.comment = comment;
	    }
	      
	    public User  getUser (){
	           return user;
	    }
	      
	    public void setUser(User   User){
	           this.user = user;
	    }
	      
	    public Activity  getActivity (){
	           return activity;
	    }
	      
	    public void setActivity(Activity   Activity){
	           this.activity = activity;
	    }
	      
	
	}
