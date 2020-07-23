package uns.ftn.mbrs.dto;


import java.util.ArrayList; 

public class ActivityDTO{
	private Long id;
	  	 private double duration;
		
	  	 private double distance;
		
	  	 private date date;
		
	  	 private Integer steps;
		
	
	
	
	public ActivityDTO(){}
	public ActivityDTO(Long id, 
			this.id = id;
 double duration   ,
			this.id = id;
 double distance   ,
			this.id = id;
 date date   ,
			this.id = id;
 Integer steps   ){
			this.duration   = duration  ;
			this.distance   = distance  ;
			this.date   = date  ;
			this.steps   = steps  ;
		}
	public ActivityDTO(
 double duration   ,
 double distance   ,
 date date   ,
 Integer steps   ){
			this.duration   = duration  ;
			this.distance   = distance  ;
			this.date   = date  ;
			this.steps   = steps  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public double getDuration  (){
	           return duration ;
	    }
	      
	    public void setDuration (double  duration ){
	           this.duration  = duration ;
	    }
	    	
	      
	     
	    public double getDistance  (){
	           return distance ;
	    }
	      
	    public void setDistance (double  distance ){
	           this.distance  = distance ;
	    }
	    	
	      
	     
	    public date getDate  (){
	           return date ;
	    }
	      
	    public void setDate (date  date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public Integer getSteps  (){
	           return steps ;
	    }
	      
	    public void setSteps (Integer  steps ){
	           this.steps  = steps ;
	    }
	    	
	      
	     

}