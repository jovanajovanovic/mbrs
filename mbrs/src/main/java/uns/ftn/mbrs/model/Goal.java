package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import uns.ftn.mbrs.model.User;


@Table(name="goal")
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
	     private  Date  date ;
	 	
	     @Column
	     private double  distance ;
	 	
	     @Column
	     private Boolean  achieved ;
	 	
		 @ManyToOne(fetch=FetchType.LAZY)
	     private User  user;
	 	
	
		public Goal(){}
		
		public Goal(Long id, 
		String   title ,double   duration , Date   date ,double   distance ,Boolean   achieved ,User   user
		){
			this.id = id; 
			this.title  =  title ;
			this.duration  =  duration ;
			this.date  =  date ;
			this.distance  =  distance ;
			this.achieved  =  achieved ;
			this.user =  user;
		}
		
		public Goal(String   title  ,double   duration  , Date   date  ,double   distance  ,Boolean   achieved  ,User   user ){
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
	
	    public String  getTitle  (){
	           return title ;
	    }
	      
	    public void setTitle (String   title ){
	           this.title  = title ;
	    }
	      
	    public double  getDuration  (){
	           return duration ;
	    }
	      
	    public void setDuration (double   duration ){
	           this.duration  = duration ;
	    }
	      
	    public  Date  getDate  (){
	           return date ;
	    }
	      
	    public void setDate ( Date   date ){
	           this.date  = date ;
	    }
	      
	    public double  getDistance  (){
	           return distance ;
	    }
	      
	    public void setDistance (double   distance ){
	           this.distance  = distance ;
	    }
	      
	    public Boolean  getAchieved  (){
	           return achieved ;
	    }
	      
	    public void setAchieved (Boolean   achieved ){
	           this.achieved  = achieved ;
	    }
	      
	    public User  getUser (){
	           return user;
	    }
	      
	    public void setUser(User   User){
	           this.user = user;
	    }
	      
	
	}
