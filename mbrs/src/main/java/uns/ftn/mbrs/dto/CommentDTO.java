package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.dto.PostDTO;

public class CommentDTO{
	private Long id;
	  	 private String  text;
		
	  	 private  Date  date;
		
	     private UserDTO  user;
		
	     private PostDTO  post;
		
	
	
	
	public CommentDTO(){}
	public CommentDTO(Long id, String text, Date date,UserDTO  user,PostDTO  post){
		this.id = id;
			this.text   = text  ;
			this.date   = date  ;
			this.user  = user ;
			this.post  = post ;
		}
	public CommentDTO( String  text   ,  Date  date   ,UserDTO  user ,PostDTO  post ){
			this.text   = text  ;
			this.date   = date  ;
			this.user  = user ;
			this.post  = post ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public String  getText (){
	           return text ;
	    }
	      
	    public void setText (String  text ){
	           this.text  = text ;
	    }
	    	
	      
	     
	    public  Date  getDate (){
	           return date ;
	    }
	      
	    public void setDate (Date date ){
	           this.date  = date ;
	    }
	    	
	      
	     
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void setUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     
	    public PostDTO getPost (){
	           return post;
	    }
	      
	    public void setPost(PostDTO  Post){
	           this.post = post;
	    }
	    
	      
	     

}