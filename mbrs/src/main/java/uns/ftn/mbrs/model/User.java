package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

import uns.ftn.mbrs.model.Goal;
import uns.ftn.mbrs.model.ActivityRequest;
import uns.ftn.mbrs.model.Post;
import uns.ftn.mbrs.model.FriendshipRequest;
import uns.ftn.mbrs.model.ActivityRequestNotification;
import uns.ftn.mbrs.model.UserSettings;
import uns.ftn.mbrs.model.FriendshipRequestNotification;


@Table(name="user")
@Entity
public class User {  

		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		 private Long id; 
		
		
	     @Column
	     private String  username ;
	     @Column
	     private String  password ;
	     @Column
	     private String  name ;
	     @Column
	     private String  surname ;
	     @Column
	     private  Date  dateOfBirth ;
	     @Column
	     private String  location ;
	     @Column
	     private String  biography ;
	     @Column
	     private double  height ;
	     @OneToMany
	     private Set<Goal >  goal = new HashSet<Goal>();
	     @OneToMany
	     private Set<ActivityRequest >  pendingActivities  = new HashSet<ActivityRequest>();
	     @Column
	     private double  weight ;
	     @OneToMany
	     private Set<ActivityRequest >  activityRequest = new HashSet<ActivityRequest>();
	     @OneToMany
	     private Set<Post >  post = new HashSet<Post>();
	     @OneToMany
	     private Set<FriendshipRequest >  pendingFriendships  = new HashSet<FriendshipRequest>();
	     @OneToMany
	     private Set<FriendshipRequest >  friendshipRequest = new HashSet<FriendshipRequest>();
	     @OneToMany
	     private Set<ActivityRequestNotification >  activityRequestNotification = new HashSet<ActivityRequestNotification>();
	  	 @OneToOne
	     private UserSettings  userSettings;
	     @OneToMany
	     private Set<FriendshipRequestNotification >  friendshipRequestNotification = new HashSet<FriendshipRequestNotification>();
	
		public User(){}
		
		public User(Long id, 
		String   username ,String   password ,String   name ,String   surname , Date   dateOfBirth ,String   location ,String   biography ,double   height ,Set<Goal >  goal,Set<ActivityRequest >  pendingActivities ,double   weight ,Set<ActivityRequest >  activityRequest,Set<Post >  post,Set<FriendshipRequest >  pendingFriendships ,Set<FriendshipRequest >  friendshipRequest,Set<ActivityRequestNotification >  activityRequestNotification,UserSettings   userSettings,Set<FriendshipRequestNotification >  friendshipRequestNotification
		){
			this.id = id; 
			this.username  =  username ;
			this.password  =  password ;
			this.name  =  name ;
			this.surname  =  surname ;
			this.dateOfBirth  =  dateOfBirth ;
			this.location  =  location ;
			this.biography  =  biography ;
			this.height  =  height ;
			this.goal  =  goal ;
			this.pendingActivities   =  pendingActivities  ;
			this.weight  =  weight ;
			this.activityRequest  =  activityRequest ;
			this.post  =  post ;
			this.pendingFriendships   =  pendingFriendships  ;
			this.friendshipRequest  =  friendshipRequest ;
			this.activityRequestNotification  =  activityRequestNotification ;
			this.userSettings =  userSettings;
			this.friendshipRequestNotification  =  friendshipRequestNotification ;
		}
		
		public User(String   username  ,String   password  ,String   name  ,String   surname  , Date   dateOfBirth  ,String   location  ,String   biography  ,double   height  ,Set<Goal >  goal ,Set<ActivityRequest >  pendingActivities  ,double   weight  ,Set<ActivityRequest >  activityRequest ,Set<Post >  post ,Set<FriendshipRequest >  pendingFriendships  ,Set<FriendshipRequest >  friendshipRequest ,Set<ActivityRequestNotification >  activityRequestNotification ,UserSettings   userSettings ,Set<FriendshipRequestNotification >  friendshipRequestNotification ){
			this.username   = username  ;
			this.password   = password  ;
			this.name   = name  ;
			this.surname   = surname  ;
			this.dateOfBirth   = dateOfBirth  ;
			this.location   = location  ;
			this.biography   = biography  ;
			this.height   = height  ;
			this.goal  =  goal ;
			this.pendingActivities   =  pendingActivities  ;
			this.weight   = weight  ;
			this.activityRequest  =  activityRequest ;
			this.post  =  post ;
			this.pendingFriendships   =  pendingFriendships  ;
			this.friendshipRequest  =  friendshipRequest ;
			this.activityRequestNotification  =  activityRequestNotification ;
			this.userSettings  = userSettings ;
			this.friendshipRequestNotification  =  friendshipRequestNotification ;
		}
		
		public Long getId(){
		return id;
	}
	
		public void setId(Long id){
			this.id = id;
		}
	
	    public String  getUsername  (){
	           return username ;
	    }
	      
	    public void setUsername (String   username ){
	           this.username  = username ;
	    }
	      
	    public String  getPassword  (){
	           return password ;
	    }
	      
	    public void setPassword (String   password ){
	           this.password  = password ;
	    }
	      
	    public String  getName  (){
	           return name ;
	    }
	      
	    public void setName (String   name ){
	           this.name  = name ;
	    }
	      
	    public String  getSurname  (){
	           return surname ;
	    }
	      
	    public void setSurname (String   surname ){
	           this.surname  = surname ;
	    }
	      
	    public  Date  getDateOfBirth  (){
	           return dateOfBirth ;
	    }
	      
	    public void setDateOfBirth ( Date   dateOfBirth ){
	           this.dateOfBirth  = dateOfBirth ;
	    }
	      
	    public String  getLocation  (){
	           return location ;
	    }
	      
	    public void setLocation (String   location ){
	           this.location  = location ;
	    }
	      
	    public String  getBiography  (){
	           return biography ;
	    }
	      
	    public void setBiography (String   biography ){
	           this.biography  = biography ;
	    }
	      
	    public double  getHeight  (){
	           return height ;
	    }
	      
	    public void setHeight (double   height ){
	           this.height  = height ;
	    }
	      
	    public Set<Goal > getGoal(){
	           return  goal;
	    }
	      
	    public void setGoal( Set<Goal >  goal){
	           this.goal = goal;
	    }
	      
	    public Set<ActivityRequest > getPendingActivities (){
	           return  pendingActivities ;
	    }
	      
	    public void setPendingActivities ( Set<ActivityRequest >  pendingActivities ){
	           this.pendingActivities  = pendingActivities ;
	    }
	      
	    public double  getWeight  (){
	           return weight ;
	    }
	      
	    public void setWeight (double   weight ){
	           this.weight  = weight ;
	    }
	      
	    public Set<ActivityRequest > getActivityRequest(){
	           return  activityRequest;
	    }
	      
	    public void setActivityRequest( Set<ActivityRequest >  activityRequest){
	           this.activityRequest = activityRequest;
	    }
	      
	    public Set<Post > getPost(){
	           return  post;
	    }
	      
	    public void setPost( Set<Post >  post){
	           this.post = post;
	    }
	      
	    public Set<FriendshipRequest > getPendingFriendships (){
	           return  pendingFriendships ;
	    }
	      
	    public void setPendingFriendships ( Set<FriendshipRequest >  pendingFriendships ){
	           this.pendingFriendships  = pendingFriendships ;
	    }
	      
	    public Set<FriendshipRequest > getFriendshipRequest(){
	           return  friendshipRequest;
	    }
	      
	    public void setFriendshipRequest( Set<FriendshipRequest >  friendshipRequest){
	           this.friendshipRequest = friendshipRequest;
	    }
	      
	    public Set<ActivityRequestNotification > getActivityRequestNotification(){
	           return  activityRequestNotification;
	    }
	      
	    public void setActivityRequestNotification( Set<ActivityRequestNotification >  activityRequestNotification){
	           this.activityRequestNotification = activityRequestNotification;
	    }
	      
	    public UserSettings  getUserSettings (){
	           return userSettings;
	    }
	      
	    public void setUserSettings(UserSettings   UserSettings){
	           this.userSettings = userSettings;
	    }
	      
	    public Set<FriendshipRequestNotification > getFriendshipRequestNotification(){
	           return  friendshipRequestNotification;
	    }
	      
	    public void setFriendshipRequestNotification( Set<FriendshipRequestNotification >  friendshipRequestNotification){
	           this.friendshipRequestNotification = friendshipRequestNotification;
	    }
	      
	
	}
