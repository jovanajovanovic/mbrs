package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.model.NotificationType;

public class NotificationDTO{
	private Long id;
	  	 private String  description;
		
	  	 private  Date  date;
		
	  	 private NotificationType  type;
		
	
	
	
	public NotificationDTO(){}
	public NotificationDTO(Long id, String description, Date date,NotificationType type){
		this.id = id;
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
		}
	public NotificationDTO( String  description   ,  Date  date   , NotificationType  type   ){
			this.description   = description  ;
			this.date   = date  ;
			this.type   = type  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public String  getDescription  (){
	           return description ;
	    }
	      
	    public void setDescription (String   description ){
	           this.description  = description ;
	    }
	    	
	      
	     
	    public  Date  getDate  (){
	           return date ;
	    }
	      
	    public void setDate ( Date   date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public NotificationType  getType  (){
	           return type ;
	    }
	      
	    public void setType (NotificationType   type ){
	           this.type  = type ;
	    }
	    	
	      
	     

}