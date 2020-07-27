package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import uns.ftn.mbrs.model.ActivityRequest;
import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.model.NotificationType;


@Table(name="activityRequestNotification")
@Entity
public class ActivityRequestNotification {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	  	 @OneToOne
	     private ActivityRequest  activityRequest;
	 	
		 @ManyToOne(fetch=FetchType.LAZY)
	     private User  user;
	 	
	     @Column
	     private  Date  date ;
	 	
	     @Column
	     private NotificationType  type ;
	 	
	     @Column
	     private String  description ;
	 	
	
		public ActivityRequestNotification(){}
		
		public ActivityRequestNotification(Long id, 
		ActivityRequest   activityRequest,User   user, Date   date ,NotificationType   type ,String   description 
		){
			this.id = id; 
			this.activityRequest =  activityRequest;
			this.user =  user;
			this.date  =  date ;
			this.type  =  type ;
			this.description  =  description ;
		}
		
		public ActivityRequestNotification(ActivityRequest   activityRequest ,User   user , Date   date  ,NotificationType   type  ,String   description  ){
			this.activityRequest  = activityRequest ;
			this.user  = user ;
			this.date   = date  ;
			this.type   = type  ;
			this.description   = description  ;
		}
		
		public Long getId(){
		return id;
	}
	
		public void setId(Long id){
			this.id = id;
		}
	
	    public ActivityRequest  getActivityRequest (){
	           return activityRequest;
	    }
	      
	    public void setActivityRequest(ActivityRequest   ActivityRequest){
	           this.activityRequest = activityRequest;
	    }
	      
	    public User  getUser (){
	           return user;
	    }
	      
	    public void setUser(User   User){
	           this.user = user;
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
	      
	    public String  getDescription  (){
	           return description ;
	    }
	      
	    public void setDescription (String   description ){
	           this.description  = description ;
	    }
	      
	
	}
