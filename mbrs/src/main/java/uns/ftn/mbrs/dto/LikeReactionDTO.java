package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.dto.UserDTO;

public class LikeReactionDTO{
	private Long id;
	     private UserDTO  user;
		
	
	
	
	public LikeReactionDTO(){}
	public LikeReactionDTO(Long id, 
			this.id = id;
	 	UserDTO  user ){
			this.user  = user ;
		}
	public LikeReactionDTO(
	 	UserDTO  user ){
			this.user  = user ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void ArrayListUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     

}