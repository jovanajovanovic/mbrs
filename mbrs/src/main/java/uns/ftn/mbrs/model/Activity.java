package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;


@Table(name="activity")
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
	     private  Date  date ;
	 	
	     @Column
	     private Integer  steps ;
	 	
	
		public Activity(){}
		
		public Activity(Long id, 
		double   duration ,double   distance , Date   date ,Integer   steps 
		){
			this.id = id; 
			this.duration  =  duration ;
			this.distance  =  distance ;
			this.date  =  date ;
			this.steps  =  steps ;
		}
		
		public Activity(double   duration  ,double   distance  , Date   date  ,Integer   steps  ){
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
	
	    public double  getDuration  (){
	           return duration ;
	    }
	      
	    public void setDuration (double   duration ){
	           this.duration  = duration ;
	    }
	      
	    public double  getDistance  (){
	           return distance ;
	    }
	      
	    public void setDistance (double   distance ){
	           this.distance  = distance ;
	    }
	      
	    public  Date  getDate  (){
	           return date ;
	    }
	      
	    public void setDate ( Date   date ){
	           this.date  = date ;
	    }
	      
	    public Integer  getSteps  (){
	           return steps ;
	    }
	      
	    public void setSteps (Integer   steps ){
	           this.steps  = steps ;
	    }
	      
	
	}
