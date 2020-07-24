package uns.ftn.mbrs.model;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

import uns.ftn.mbrs.model.Goal;
import uns.ftn.mbrs.model.ActivityRequest;
import uns.ftn.mbrs.model.Post;
import uns.ftn.mbrs.model.FriendshipRequest;
import uns.ftn.mbrs.model.Notification;
import uns.ftn.mbrs.model.UserSettings;



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
	     @OneToMany(mappedBy="user")
	     private Set<Goal >  goal = new HashSet<Goal>();
	     @OneToMany(mappedBy="user")
	     private Set<ActivityRequest >  pendingActivities  = new HashSet<ActivityRequest>();
	     @Column
	     private double  weight ;
	     @OneToMany(mappedBy="user")
	     private Set<ActivityRequest >  activityRequest = new HashSet<ActivityRequest>();
	     @OneToMany(mappedBy="user")
	     private Set<Post >  post = new HashSet<Post>();
	     @OneToMany(mappedBy="user")
	     private Set<FriendshipRequest >  pendingFriendships  = new HashSet<FriendshipRequest>();
	     @OneToMany(mappedBy="user")
	     private Set<FriendshipRequest >  friendshipRequest = new HashSet<FriendshipRequest>();
	     @OneToMany(mappedBy="user")
	     private Set<Notification >  notification = new HashSet<Notification>();
	  	 @OneToOne
	     private UserSettings  userSettings;
	
		public User(){}
		
		public User(Long id, 
		String   username ,String   password ,String   name ,String   surname , Date   dateOfBirth ,String   location ,String   biography ,double   height ,Set<Goal >  goal,Set<ActivityRequest >  pendingActivities ,double   weight ,Set<ActivityRequest >  activityRequest,Set<Post >  post,Set<FriendshipRequest >  pendingFriendships ,Set<FriendshipRequest >  friendshipRequest,Set<Notification >  notification,UserSettings   userSettings
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
			this.notification  =  notification ;
			this.userSettings =  userSettings;
		}
		
		public User(String   username  ,String   password  ,String   name  ,String   surname  , Date   dateOfBirth  ,String   location  ,String   biography  ,double   height  ,Set<Goal >  goal ,Set<ActivityRequest >  pendingActivities  ,double   weight  ,Set<ActivityRequest >  activityRequest ,Set<Post >  post ,Set<FriendshipRequest >  pendingFriendships  ,Set<FriendshipRequest >  friendshipRequest ,Set<Notification >  notification ,UserSettings   userSettings ){
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
			this.notification  =  notification ;
			this.userSettings  = userSettings ;
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
	      
	    public Set<Notification > getNotification(){
	           return  notification;
	    }
	      
	    public void setNotification( Set<Notification >  notification){
	           this.notification = notification;
	    }
	      
	    public UserSettings  getUserSettings (){
	           return userSettings;
	    }
	      
	    public void setUserSettings(UserSettings   UserSettings){
	           this.userSettings = userSettings;
	    }
	      
	
	}
