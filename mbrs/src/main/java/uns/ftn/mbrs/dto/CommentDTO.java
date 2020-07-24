package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.dto.UserDTO;

public class CommentDTO{
	private Long id;
	  	 private String  text;
		
	  	 private  Date  date;
		
	     private UserDTO  user;
		
	
	
	
	public CommentDTO(){}
	public CommentDTO(Long id, String text, Date date,UserDTO  user){
		this.id = id;
			this.text   = text  ;
			this.date   = date  ;
			this.user  = user ;
		}
	public CommentDTO( String  text   ,  Date  date   ,UserDTO  user ){
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
	    	
	      
	     
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void ArrayListUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     

}