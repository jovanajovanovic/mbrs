package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

import uns.ftn.mbrs.model.ActivityRequest;



@Entity
public class ActivityRequestNotification {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	  	 @OneToOne
	     private ActivityRequest  activityRequest;
	
		public ActivityRequestNotification(){}
		
		public ActivityRequestNotification(Long id, 
		ActivityRequest  activityRequest
		){
			this.id = id; 
			this.activityRequest =  activityRequest;
		}
		
		public ActivityRequestNotification(ActivityRequest  activityRequest ){
			this.activityRequest  = activityRequest ;
		}
		
		public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public ActivityRequest getActivityRequest (){
	           return activityRequest;
	    }
	      
	    public void setActivityRequest(ActivityRequest  ActivityRequest){
	           this.activityRequest = activityRequest;
	    }
	      
	
	}
