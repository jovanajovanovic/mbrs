package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.dto.ActivityRequestDTO;

public class ActivityRequestNotificationDTO{
	private Long id;
	     private ActivityRequestDTO  activityRequest;
		
	
	
	
	public ActivityRequestNotificationDTO(){}
	public ActivityRequestNotificationDTO(Long id, 
			this.id = id;
	 	ActivityRequestDTO  activityRequest ){
			this.activityRequest  = activityRequest ;
		}
	public ActivityRequestNotificationDTO(
	 	ActivityRequestDTO  activityRequest ){
			this.activityRequest  = activityRequest ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public ActivityRequestDTO getActivityRequest (){
	           return activityRequest;
	    }
	      
	    public void ArrayListActivityRequest(ActivityRequestDTO  ActivityRequest){
	           this.activityRequest = activityRequest;
	    }
	    
	      
	     

}