package uns.ftn.mbrs.dto;


import java.util.ArrayList; 
import uns.ftn.mbrs.model.Visibility;

public class UserSettingsDTO{
	private Long id;
	  	 private Visibility userInfoPrivacy;
		
	  	 private Visibility postPrivacy;
		
	  	 private Visibility goalPrivacy;
		
	  	 private Boolean newComments;
		
	  	 private Boolean newLikes;
		
	  	 private Boolean friendshipRequest;
		
	  	 private Boolean acceptedFriendship;
		
	  	 private Boolean activityRequest;
		
	  	 private Boolean acceptedActivity;
		
	  	 private Boolean canceledActivity;
		
	  	 private Boolean nightTheme;
		
	
	
	
	public UserSettingsDTO(){}
	public UserSettingsDTO(Long id, 
			this.id = id;
 Visibility userInfoPrivacy   ,
			this.id = id;
 Visibility postPrivacy   ,
			this.id = id;
 Visibility goalPrivacy   ,
			this.id = id;
 Boolean newComments   ,
			this.id = id;
 Boolean newLikes   ,
			this.id = id;
 Boolean friendshipRequest   ,
			this.id = id;
 Boolean acceptedFriendship   ,
			this.id = id;
 Boolean activityRequest   ,
			this.id = id;
 Boolean acceptedActivity   ,
			this.id = id;
 Boolean canceledActivity   ,
			this.id = id;
 Boolean nightTheme   ){
			this.userInfoPrivacy   = userInfoPrivacy  ;
			this.postPrivacy   = postPrivacy  ;
			this.goalPrivacy   = goalPrivacy  ;
			this.newComments   = newComments  ;
			this.newLikes   = newLikes  ;
			this.friendshipRequest   = friendshipRequest  ;
			this.acceptedFriendship   = acceptedFriendship  ;
			this.activityRequest   = activityRequest  ;
			this.acceptedActivity   = acceptedActivity  ;
			this.canceledActivity   = canceledActivity  ;
			this.nightTheme   = nightTheme  ;
		}
	public UserSettingsDTO(
 Visibility userInfoPrivacy   ,
 Visibility postPrivacy   ,
 Visibility goalPrivacy   ,
 Boolean newComments   ,
 Boolean newLikes   ,
 Boolean friendshipRequest   ,
 Boolean acceptedFriendship   ,
 Boolean activityRequest   ,
 Boolean acceptedActivity   ,
 Boolean canceledActivity   ,
 Boolean nightTheme   ){
			this.userInfoPrivacy   = userInfoPrivacy  ;
			this.postPrivacy   = postPrivacy  ;
			this.goalPrivacy   = goalPrivacy  ;
			this.newComments   = newComments  ;
			this.newLikes   = newLikes  ;
			this.friendshipRequest   = friendshipRequest  ;
			this.acceptedFriendship   = acceptedFriendship  ;
			this.activityRequest   = activityRequest  ;
			this.acceptedActivity   = acceptedActivity  ;
			this.canceledActivity   = canceledActivity  ;
			this.nightTheme   = nightTheme  ;
		}
	
	
	public Long getId(){
		return id;
	}
	
	public setId(Long id){
		this.id = id;
	}
	
	    public Visibility getUserInfoPrivacy  (){
	           return userInfoPrivacy ;
	    }
	      
	    public void setUserInfoPrivacy (Visibility  userInfoPrivacy ){
	           this.userInfoPrivacy  = userInfoPrivacy ;
	    }
	    	
	      
	     
	    public Visibility getPostPrivacy  (){
	           return postPrivacy ;
	    }
	      
	    public void setPostPrivacy (Visibility  postPrivacy ){
	           this.postPrivacy  = postPrivacy ;
	    }
	    	
	      
	     
	    public Visibility getGoalPrivacy  (){
	           return goalPrivacy ;
	    }
	      
	    public void setGoalPrivacy (Visibility  goalPrivacy ){
	           this.goalPrivacy  = goalPrivacy ;
	    }
	    	
	      
	     
	    public Boolean getNewComments  (){
	           return newComments ;
	    }
	      
	    public void setNewComments (Boolean  newComments ){
	           this.newComments  = newComments ;
	    }
	    	
	      
	     
	    public Boolean getNewLikes  (){
	           return newLikes ;
	    }
	      
	    public void setNewLikes (Boolean  newLikes ){
	           this.newLikes  = newLikes ;
	    }
	    	
	      
	     
	    public Boolean getFriendshipRequest  (){
	           return friendshipRequest ;
	    }
	      
	    public void setFriendshipRequest (Boolean  friendshipRequest ){
	           this.friendshipRequest  = friendshipRequest ;
	    }
	    	
	      
	     
	    public Boolean getAcceptedFriendship  (){
	           return acceptedFriendship ;
	    }
	      
	    public void setAcceptedFriendship (Boolean  acceptedFriendship ){
	           this.acceptedFriendship  = acceptedFriendship ;
	    }
	    	
	      
	     
	    public Boolean getActivityRequest  (){
	           return activityRequest ;
	    }
	      
	    public void setActivityRequest (Boolean  activityRequest ){
	           this.activityRequest  = activityRequest ;
	    }
	    	
	      
	     
	    public Boolean getAcceptedActivity  (){
	           return acceptedActivity ;
	    }
	      
	    public void setAcceptedActivity (Boolean  acceptedActivity ){
	           this.acceptedActivity  = acceptedActivity ;
	    }
	    	
	      
	     
	    public Boolean getCanceledActivity  (){
	           return canceledActivity ;
	    }
	      
	    public void setCanceledActivity (Boolean  canceledActivity ){
	           this.canceledActivity  = canceledActivity ;
	    }
	    	
	      
	     
	    public Boolean getNightTheme  (){
	           return nightTheme ;
	    }
	      
	    public void setNightTheme (Boolean  nightTheme ){
	           this.nightTheme  = nightTheme ;
	    }
	    	
	      
	     

}