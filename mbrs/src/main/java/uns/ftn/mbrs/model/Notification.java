package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

import uns.ftn.mbrs.model.NotificationType;
import uns.ftn.mbrs.model.User;



@Entity
public class Notification {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private String  description ;
	     @Column
	     private  Date  date ;
	     @Column
	     private NotificationType  type ;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", referencedColumnName="id")
	     private User  user;
	
		public Notification(){}
		
		public Notification(Long id, 
		String   description , Date   date ,NotificationType   type ,User   user
		){
			this.id = id; 
			this.description  =  description ;
			this.date  =  date ;
			this.type  =  type ;
			this.user =  user;
		}
		
		public Notification(String   description  , Date   date  ,NotificationType   type  ,User   user ){
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
			this.user  = user ;
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
	      
	    public User  getUser (){
	           return user;
	    }
	      
	    public void setUser(User   User){
	           this.user = user;
	    }
	      
	
	}
