package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;




@Entity
public class Activity {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private double  duration ;
	     @Column
	     private double  distance ;
	     @Column
	     private date  date ;
	     @Column
	     private Integer  steps ;
	
		public Activity(){}
		
		public Activity(Long id, 
		double  duration ,double  distance ,date  date ,Integer  steps 
		){
			this.id = id; 
			this.duration  =  duration ;
			this.distance  =  distance ;
			this.date  =  date ;
			this.steps  =  steps ;
		}
		
		public Activity(double  duration  ,double  distance  ,date  date  ,Integer  steps  ){
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
