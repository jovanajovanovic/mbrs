package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 

public class ActivityDTO{
	private Long id;
	  	 private double  duration;
		
	  	 private double  distance;
		
	  	 private  Date  date;
		
	  	 private Integer  steps;
		
	
	
	
	public ActivityDTO(){}
	public ActivityDTO(Long id, double duration,double distance, Date date,Integer steps){
		this.id = id;
			this.duration   = duration  ;
			this.distance   = distance  ;
			this.date   = date  ;
			this.steps   = steps  ;
		}
	public ActivityDTO( double  duration   , double  distance   ,  Date  date   , Integer  steps   ){
			this.duration   = duration  ;
			this.distance   = distance  ;
			this.date   = date  ;
			this.steps   = steps  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public double  getDuration (){
	           return duration ;
	    }
	      
	    public void setDuration (double  duration ){
	           this.duration  = duration ;
	    }
	    	
	      
	     
	    public double  getDistance (){
	           return distance ;
	    }
	      
	    public void setDistance (double  distance ){
	           this.distance  = distance ;
	    }
	    	
	      
	     
	    public  Date  getDate (){
	           return date ;
	    }
	      
	    public void setDate (Date date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public Integer  getSteps (){
	           return steps ;
	    }
	      
	    public void setSteps (Integer  steps ){
	           this.steps  = steps ;
	    }
	    	
	      
	     

}