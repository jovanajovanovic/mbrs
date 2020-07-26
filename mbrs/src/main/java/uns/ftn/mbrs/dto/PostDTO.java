package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.model.Visibility;
import uns.ftn.mbrs.dto.LikeReactionDTO;
import uns.ftn.mbrs.dto.CommentDTO;
import uns.ftn.mbrs.dto.UserDTO;
import uns.ftn.mbrs.dto.ActivityDTO;

public class PostDTO{
	private Long id;
	  	 private String  description;
		
	  	 private Visibility  visibility;
		
	     private ArrayList<LikeReactionDTO>  likeReaction = new ArrayList<LikeReactionDTO>();
		
	     private ArrayList<CommentDTO>  comment = new ArrayList<CommentDTO>();
		
	     private UserDTO  user;
		
	     private ActivityDTO  activity;
		
	
	
	
	public PostDTO(){}
	public PostDTO(Long id, String description,Visibility visibility,ArrayList<LikeReactionDTO> likeReaction ,ArrayList<CommentDTO> comment ,UserDTO  user,ActivityDTO  activity){
		this.id = id;
			this.description   = description  ;
			this.visibility   = visibility  ;
			this.likeReaction  =  likeReaction ;
			this.comment  =  comment ;
			this.user  = user ;
			this.activity  = activity ;
		}
	public PostDTO( String  description   , Visibility  visibility   , ArrayList<LikeReactionDTO>  likeReaction , ArrayList<CommentDTO>  comment ,UserDTO  user ,ActivityDTO  activity ){
			this.description   = description  ;
			this.visibility   = visibility  ;
			this.likeReaction  =  likeReaction ;
			this.comment  =  comment ;
			this.user  = user ;
			this.activity  = activity ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	    public String  getDescription (){
	           return description ;
	    }
	      
	    public void setDescription (String  description ){
	           this.description  = description ;
	    }
	    	
	      
	     
	    public Visibility  getVisibility (){
	           return visibility ;
	    }
	      
	    public void setVisibility (Visibility  visibility ){
	           this.visibility  = visibility ;
	    }
	    	
	      
	     
	     public ArrayList<LikeReactionDTO> getLikeReaction(){
	           return  likeReaction;
	    }
	      
	    public void setLikeReaction( ArrayList<LikeReactionDTO>  likeReaction){
	           this.likeReaction = likeReaction;
	    }
	     public ArrayList<CommentDTO> getComment(){
	           return  comment;
	    }
	      
	    public void setComment( ArrayList<CommentDTO>  comment){
	           this.comment = comment;
	    }
	    public UserDTO getUser (){
	           return user;
	    }
	      
	    public void setUser(UserDTO  User){
	           this.user = user;
	    }
	    
	      
	     
	    public ActivityDTO getActivity (){
	           return activity;
	    }
	      
	    public void setActivity(ActivityDTO  Activity){
	           this.activity = activity;
	    }
	    
	      
	     

}