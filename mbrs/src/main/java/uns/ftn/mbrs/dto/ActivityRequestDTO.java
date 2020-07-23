package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.model.ActivityRequestStatus;
import uns.ftn.mbrs.dto.UserDTO;

public class ActivityRequestDTO{
	private Long id;
	  	 private date date;
		
	  	 private String location;
		
	  	 private ActivityRequestStatus status;
		
	     private UserDTO  activityRequestor ;
		
	     private UserDTO  activityRequestee ;
		
	
	
	
	public ActivityRequestDTO(){}
	public ActivityRequestDTO(Long id, 
			this.id = id;
 date date   ,
			this.id = id;
 String location   ,
			this.id = id;
 ActivityRequestStatus status   ,
			this.id = id;
	 	UserDTO  activityRequestor  ,
			this.id = id;
	 	UserDTO  activityRequestee  ){
			this.date   = date  ;
			this.location   = location  ;
			this.status   = status  ;
			this.activityRequestor   = activityRequestor  ;
			this.activityRequestee   = activityRequestee  ;
		}
	public ActivityRequestDTO(
 date date   ,
 String location   ,
 ActivityRequestStatus status   ,
	 	UserDTO  activityRequestor  ,
	 	UserDTO  activityRequestee  ){
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
	    	
	      
	     
	    public UserDTO getActivityRequestor  (){
	           return activityRequestor ;
	    }
	      
	    public void ArrayListActivityRequestor (UserDTO  activityRequestor ){
	           this.activityRequestor  = activityRequestor ;
	    }
	    
	      
	     
	    public UserDTO getActivityRequestee  (){
	           return activityRequestee ;
	    }
	      
	    public void ArrayListActivityRequestee (UserDTO  activityRequestee ){
	           this.activityRequestee  = activityRequestee ;
	    }
	    
	      
	     

}