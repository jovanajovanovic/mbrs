package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

import uns.ftn.mbrs.model.User;



@Entity
public class Comment {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private String  text ;
	     @Column
	     private  Date  date ;
		 @ManyToOne(fetch=FetchType.LAZY)
		 @JoinColumn(name="user_id", referencedColumnName="id")
	     private User  user;
	
		public Comment(){}
		
		public Comment(Long id, 
		String   text , Date   date ,User   user
		){
			this.id = id; 
			this.text  =  text ;
			this.date  =  date ;
			this.user =  user;
		}
		
		public Comment(String   text  , Date   date  ,User   user ){
			this.text   = text  ;
			this.date   = date  ;
			this.user  = user ;
		}
		
		public Long getId(){
		return id;
	}
	
		public void setId(Long id){
			this.id = id;
		}
	
	    public String  getText  (){
	           return text ;
	    }
	      
	    public void setText (String   text ){
	           this.text  = text ;
	    }
	      
	    public  Date  getDate  (){
	           return date ;
	    }
	      
	    public void setDate ( Date   date ){
	           this.date  = date ;
	    }
	      
	    public User  getUser (){
	           return user;
	    }
	      
	    public void setUser(User   User){
	           this.user = user;
	    }
	      
	
	}
