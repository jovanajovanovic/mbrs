package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;




@Entity
public class Goal {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private String  title ;
	     @Column
	     private double  duration ;
	     @Column
	     private date  date ;
	     @Column
	     private double  distance ;
	     @Column
	     private Boolean  achieved ;
	
		public Goal(){}
		
		public Goal(Long id, 
		String  title ,double  duration ,date  date ,double  distance ,Boolean  achieved 
		){
			this.id = id; 
			this.title  =  title ;
			this.duration  =  duration ;
			this.date  =  date ;
			this.distance  =  distance ;
			this.achieved  =  achieved ;
		}
		
		public Goal(String  title  ,double  duration  ,date  date  ,double  distance  ,Boolean  achieved  ){
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
