package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.dto.UserDTO;

public class CommentDTO{
	private Long id;
	  	 private String text;
		
	  	 private date date;
		
	     private UserDTO  user;
		
	
	
	
	public CommentDTO(){}
	public CommentDTO(Long id, 
			this.id = id;
 String text   ,
			this.id = id;
 date date   ,
			this.id = id;
	 	UserDTO  user ){
			this.text   = text  ;
			this.date   = date  ;
			this.user  = user ;
		}
	public CommentDTO(
 String text   ,
 date date   ,
	 	UserDTO  user ){
			this.text   = text  ;
			this.date   = date  ;
			this.user  = user ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public String getText  (){
	           return text ;
	    }
	      
	    public void setText (String  text ){
	           this.text  = text ;
	    }
	    	
	      
	     
	    public date getDate  (){
	           return date ;
	    }
	      
	    public void setDate (date  date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void ArrayListUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     

}