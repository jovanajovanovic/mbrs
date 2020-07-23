package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

import uns.ftn.mbrs.model.ActivityRequestStatus;
import uns.ftn.mbrs.model.User;
import uns.ftn.mbrs.model.User;



@Entity
public class ActivityRequest {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private date  date ;
	     @Column
	     private String  location ;
	     @Column
	     private ActivityRequestStatus  status ;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", referencedColumnName="id")
	     private User  activityRequestor ;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", referencedColumnName="id")
	     private User  activityRequestee ;
	
		public ActivityRequest(){}
		
		public ActivityRequest(Long id, 
		date  date ,String  location ,ActivityRequestStatus  status ,User  activityRequestor ,User  activityRequestee 
		){
			this.id = id; 
			this.date  =  date ;
			this.location  =  location ;
			this.status  =  status ;
			this.activityRequestor  =  activityRequestor ;
			this.activityRequestee  =  activityRequestee ;
		}
		
		public ActivityRequest(date  date  ,String  location  ,ActivityRequestStatus  status  ,User  activityRequestor  ,User  activityRequestee  ){
			this.date   = date  ;
			this.location   = location  ;
			this.status   = status  ;
			this.activityRequestor   = activityRequestor  ;
			this.activityRequestee   = activityRequestee  ;
		}
		
		public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public date getDate  (){
	           return date ;
	    }
	      
	    public void setDate (date  date ){
	           this.date  = date ;
	    }
	      
	    public String getLocation  (){
	           return location ;
	    }
	      
	    public void setLocation (String  location ){
	           this.location  = location ;
	    }
	      
	    public ActivityRequestStatus getStatus  (){
	           return status ;
	    }
	      
	    public void setStatus (ActivityRequestStatus  status ){
	           this.status  = status ;
	    }
	      
	    public User getActivityRequestor  (){
	           return activityRequestor ;
	    }
	      
	    public void setActivityRequestor (User  activityRequestor ){
	           this.activityRequestor  = activityRequestor ;
	    }
	      
	    public User getActivityRequestee  (){
	           return activityRequestee ;
	    }
	      
	    public void setActivityRequestee (User  activityRequestee ){
	           this.activityRequestee  = activityRequestee ;
	    }
	      
	
	}
