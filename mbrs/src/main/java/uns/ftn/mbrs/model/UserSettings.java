package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

import uns.ftn.mbrs.model.Visibility;
import uns.ftn.mbrs.model.Visibility;
import uns.ftn.mbrs.model.Visibility;



@Entity
public class UserSettings {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private Visibility  userInfoPrivacy ;
	     @Column
	     private Visibility  postPrivacy ;
	     @Column
	     private Visibility  goalPrivacy ;
	     @Column
	     private Boolean  newComments ;
	     @Column
	     private Boolean  newLikes ;
	     @Column
	     private Boolean  friendshipRequest ;
	     @Column
	     private Boolean  acceptedFriendship ;
	     @Column
	     private Boolean  activityRequest ;
	     @Column
	     private Boolean  acceptedActivity ;
	     @Column
	     private Boolean  canceledActivity ;
	     @Column
	     private Boolean  nightTheme ;
	
		public UserSettings(){}
		
		public UserSettings(Long id, 
		Visibility  userInfoPrivacy ,Visibility  postPrivacy ,Visibility  goalPrivacy ,Boolean  newComments ,Boolean  newLikes ,Boolean  friendshipRequest ,Boolean  acceptedFriendship ,Boolean  activityRequest ,Boolean  acceptedActivity ,Boolean  canceledActivity ,Boolean  nightTheme 
		){
			this.id = id; 
			this.userInfoPrivacy  =  userInfoPrivacy ;
			this.postPrivacy  =  postPrivacy ;
			this.goalPrivacy  =  goalPrivacy ;
			this.newComments  =  newComments ;
			this.newLikes  =  newLikes ;
			this.friendshipRequest  =  friendshipRequest ;
			this.acceptedFriendship  =  acceptedFriendship ;
			this.activityRequest  =  activityRequest ;
			this.acceptedActivity  =  acceptedActivity ;
			this.canceledActivity  =  canceledActivity ;
			this.nightTheme  =  nightTheme ;
		}
		
		public UserSettings(Visibility  userInfoPrivacy  ,Visibility  postPrivacy  ,Visibility  goalPrivacy  ,Boolean  newComments  ,Boolean  newLikes  ,Boolean  friendshipRequest  ,Boolean  acceptedFriendship  ,Boolean  activityRequest  ,Boolean  acceptedActivity  ,Boolean  canceledActivity  ,Boolean  nightTheme  ){
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
