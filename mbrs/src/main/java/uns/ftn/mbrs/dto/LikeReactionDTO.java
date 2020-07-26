package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.dto.PostDTO;

public class LikeReactionDTO{
	private Long id;
	     private UserDTO  user;
		
	     private PostDTO  post;
		
	
	
	
	public LikeReactionDTO(){}
	public LikeReactionDTO(Long id, UserDTO  user,PostDTO  post){
		this.id = id;
			this.user  = user ;
			this.post  = post ;
		}
	public LikeReactionDTO(UserDTO  user ,PostDTO  post ){
			this.user  = user ;
			this.post  = post ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
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