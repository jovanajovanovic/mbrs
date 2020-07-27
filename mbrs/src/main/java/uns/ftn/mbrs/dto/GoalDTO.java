package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.dto.UserDTO;

public class GoalDTO{
	private Long id;
	  	 private String  title;
		
	  	 private double  duration;
		
	  	 private  Date  date;
		
	  	 private double  distance;
		
	  	 private Boolean  achieved;
		
	     private UserDTO  user;
		
	
	
	
	public GoalDTO(){}
	public GoalDTO(Long id, String title,double duration, Date date,double distance,Boolean achieved,UserDTO  user){
		this.id = id;
			this.title   = title  ;
			this.duration   = duration  ;
			this.date   = date  ;
			this.distance   = distance  ;
			this.achieved   = achieved  ;
			this.user  = user ;
		}
	public GoalDTO( String  title   , double  duration   ,  Date  date   , double  distance   , Boolean  achieved   ,UserDTO  user ){
			this.title   = title  ;
			this.duration   = duration  ;
			this.date   = date  ;
			this.distance   = distance  ;
			this.achieved   = achieved  ;
			this.user  = user ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public String  getTitle (){
	           return title ;
	    }
	      
	    public void setTitle (String  title ){
	           this.title  = title ;
	    }
	    	
	      
	     
	    public double  getDuration (){
	           return duration ;
	    }
	      
	    public void setDuration (double  duration ){
	           this.duration  = duration ;
	    }
	    	
	      
	     
	    public  Date  getDate (){
	           return date ;
	    }
	      
	    public void setDate (Date date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public double  getDistance (){
	           return distance ;
	    }
	      
	    public void setDistance (double  distance ){
	           this.distance  = distance ;
	    }
	    	
	      
	     
	    public Boolean  getAchieved (){
	           return achieved ;
	    }
	      
	    public void setAchieved (Boolean  achieved ){
	           this.achieved  = achieved ;
	    }
	    	
	      
	     
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void setUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     

}