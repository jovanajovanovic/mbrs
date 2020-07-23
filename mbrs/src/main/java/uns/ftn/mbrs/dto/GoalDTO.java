package uns.ftn.mbrs.dto;


import java.util.ArrayList; 

public class GoalDTO{
	private Long id;
	  	 private String title;
		
	  	 private double duration;
		
	  	 private date date;
		
	  	 private double distance;
		
	  	 private Boolean achieved;
		
	
	
	
	public GoalDTO(){}
	public GoalDTO(Long id, 
			this.id = id;
 String title   ,
			this.id = id;
 double duration   ,
			this.id = id;
 date date   ,
			this.id = id;
 double distance   ,
			this.id = id;
 Boolean achieved   ){
			this.title   = title  ;
			this.duration   = duration  ;
			this.date   = date  ;
			this.distance   = distance  ;
			this.achieved   = achieved  ;
		}
	public GoalDTO(
 String title   ,
 double duration   ,
 date date   ,
 double distance   ,
 Boolean achieved   ){
			this.title   = title  ;
			this.duration   = duration  ;
			this.date   = date  ;
			this.distance   = distance  ;
			this.achieved   = achieved  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public String getTitle  (){
	           return title ;
	    }
	      
	    public void setTitle (String  title ){
	           this.title  = title ;
	    }
	    	
	      
	     
	    public double getDuration  (){
	           return duration ;
	    }
	      
	    public void setDuration (double  duration ){
	           this.duration  = duration ;
	    }
	    	
	      
	     
	    public date getDate  (){
	           return date ;
	    }
	      
	    public void setDate (date  date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public double getDistance  (){
	           return distance ;
	    }
	      
	    public void setDistance (double  distance ){
	           this.distance  = distance ;
	    }
	    	
	      
	     
	    public Boolean getAchieved  (){
	           return achieved ;
	    }
	      
	    public void setAchieved (Boolean  achieved ){
	           this.achieved  = achieved ;
	    }
	    	
	      
	     

}