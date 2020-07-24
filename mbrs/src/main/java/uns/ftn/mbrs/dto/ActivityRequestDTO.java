package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.model.ActivityRequestStatus;
import uns.ftn.mbrs.dto.UserDTO;

public class ActivityRequestDTO{
	private Long id;
	  	 private  Date  date;
		
	  	 private String  location;
		
	  	 private ActivityRequestStatus  status;
		
	     private UserDTO  activityRequestor ;
		
	     private UserDTO  activityRequestee ;
		
	
	
	
	public ActivityRequestDTO(){}
	public ActivityRequestDTO(Long id,  Date date,String location,ActivityRequestStatus status,UserDTO  activityRequestor,UserDTO  activityRequestee){
		this.id = id;
			this.date   = date  ;
			this.location   = location  ;
			this.status   = status  ;
			this.activityRequestor   = activityRequestor  ;
			this.activityRequestee   = activityRequestee  ;
		}
	public ActivityRequestDTO(  Date  date   , String  location   , ActivityRequestStatus  status   ,UserDTO  activityRequestor  ,UserDTO  activityRequestee  ){
			this.date   = date  ;
			this.location   = location  ;
			this.status   = status  ;
			this.activityRequestor   = activityRequestor  ;
			this.activityRequestee   = activityRequestee  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public  Date  getDate  (){
	           return date ;
	    }
	      
	    public void setDate ( Date   date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public String  getLocation  (){
	           return location ;
	    }
	      
	    public void setLocation (String   location ){
	           this.location  = location ;
	    }
	    	
	      
	     
	    public ActivityRequestStatus  getStatus  (){
	           return status ;
	    }
	      
	    public void setStatus (ActivityRequestStatus   status ){
	           this.status  = status ;
	    }
	    	
	      
	     
	    public UserDTO getActivityRequestor  (){
	           return activityRequestor ;
	    }
	      
	    public void setActivityRequestor (UserDTO  activityRequestor ){
	           this.activityRequestor  = activityRequestor ;
	    }
	    
	      
	     
	    public UserDTO getActivityRequestee  (){
	           return activityRequestee ;
	    }
	      
	    public void setActivityRequestee (UserDTO  activityRequestee ){
	           this.activityRequestee  = activityRequestee ;
	    }
	    
	      
	     

}