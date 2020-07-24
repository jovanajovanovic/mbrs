package uns.ftn.mbrs.dto;

import java.util.Date;

import java.util.ArrayList; 
import uns.ftn.mbrs.dto.GoalDTO;
import uns.ftn.mbrs.dto.ActivityRequestDTO;
import uns.ftn.mbrs.dto.PostDTO;
import uns.ftn.mbrs.dto.FriendshipRequestDTO;
import uns.ftn.mbrs.dto.ActivityRequestNotificationDTO;
import uns.ftn.mbrs.dto.UserSettingsDTO;
import uns.ftn.mbrs.dto.FriendshipRequestNotificationDTO;

public class UserDTO{
	private Long id;
	  	 private String  username;
		
	  	 private String  password;
		
	  	 private String  name;
		
	  	 private String  surname;
		
	  	 private  Date  dateOfBirth;
		
	  	 private String  location;
		
	  	 private String  biography;
		
	  	 private double  height;
		
	     private ArrayList<GoalDTO>  goal = new ArrayList<Goal>();
		
	     private ArrayList<ActivityRequestDTO>  pendingActivities  = new ArrayList<ActivityRequest>();
		
	  	 private double  weight;
		
	     private ArrayList<ActivityRequestDTO>  activityRequest = new ArrayList<ActivityRequest>();
		
	     private ArrayList<PostDTO>  post = new ArrayList<Post>();
		
	     private ArrayList<FriendshipRequestDTO>  pendingFriendships  = new ArrayList<FriendshipRequest>();
		
	     private ArrayList<FriendshipRequestDTO>  friendshipRequest = new ArrayList<FriendshipRequest>();
		
	     private ArrayList<ActivityRequestNotificationDTO>  activityRequestNotification = new ArrayList<ActivityRequestNotification>();
		
	     private UserSettingsDTO  userSettings;
		
	     private ArrayList<FriendshipRequestNotificationDTO>  friendshipRequestNotification = new ArrayList<FriendshipRequestNotification>();
		
	
	
	
	public UserDTO(){}
	public UserDTO(Long id, String username,String password,String name,String surname, Date dateOfBirth,String location,String biography,double height,ArrayList<GoalDTO> goal ,ArrayList<ActivityRequestDTO> pendingActivities ,double weight,ArrayList<ActivityRequestDTO> activityRequest ,ArrayList<PostDTO> post ,ArrayList<FriendshipRequestDTO> pendingFriendships ,ArrayList<FriendshipRequestDTO> friendshipRequest ,ArrayList<ActivityRequestNotificationDTO> activityRequestNotification ,UserSettingsDTO  userSettings,ArrayList<FriendshipRequestNotificationDTO> friendshipRequestNotification ){
		this.id = id;
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
	public UserDTO( String  username   , String  password   , String  name   , String  surname   ,  Date  dateOfBirth   , String  location   , String  biography   , double  height   , ArrayList<GoalDTO>  goal , ArrayList<ActivityRequestDTO>  pendingActivities  , double  weight   , ArrayList<ActivityRequestDTO>  activityRequest , ArrayList<PostDTO>  post , ArrayList<FriendshipRequestDTO>  pendingFriendships  , ArrayList<FriendshipRequestDTO>  friendshipRequest , ArrayList<ActivityRequestNotificationDTO>  activityRequestNotification ,UserSettingsDTO  userSettings , ArrayList<FriendshipRequestNotificationDTO>  friendshipRequestNotification ){
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
	    	
	      
	     
	     public ArrayList<GoalDTO> get Goal(){
	           return  goal;
	    }
	      
	    public void setGoal( ArrayList<GoalDTO>  goal){
	           this.goal = goal;
	    }
	     public ArrayList<ActivityRequestDTO> get PendingActivities (){
	           return  pendingActivities ;
	    }
	      
	    public void setPendingActivities ( ArrayList<ActivityRequestDTO>  pendingActivities ){
	           this.pendingActivities  = pendingActivities ;
	    }
	    public double  getWeight  (){
	           return weight ;
	    }
	      
	    public void setWeight (double   weight ){
	           this.weight  = weight ;
	    }
	    	
	      
	     
	     public ArrayList<ActivityRequestDTO> get ActivityRequest(){
	           return  activityRequest;
	    }
	      
	    public void setActivityRequest( ArrayList<ActivityRequestDTO>  activityRequest){
	           this.activityRequest = activityRequest;
	    }
	     public ArrayList<PostDTO> get Post(){
	           return  post;
	    }
	      
	    public void setPost( ArrayList<PostDTO>  post){
	           this.post = post;
	    }
	     public ArrayList<FriendshipRequestDTO> get PendingFriendships (){
	           return  pendingFriendships ;
	    }
	      
	    public void setPendingFriendships ( ArrayList<FriendshipRequestDTO>  pendingFriendships ){
	           this.pendingFriendships  = pendingFriendships ;
	    }
	     public ArrayList<FriendshipRequestDTO> get FriendshipRequest(){
	           return  friendshipRequest;
	    }
	      
	    public void setFriendshipRequest( ArrayList<FriendshipRequestDTO>  friendshipRequest){
	           this.friendshipRequest = friendshipRequest;
	    }
	     public ArrayList<ActivityRequestNotificationDTO> get ActivityRequestNotification(){
	           return  activityRequestNotification;
	    }
	      
	    public void setActivityRequestNotification( ArrayList<ActivityRequestNotificationDTO>  activityRequestNotification){
	           this.activityRequestNotification = activityRequestNotification;
	    }
	    public UserSettingsDTO getUserSettings (){
	           return userSettings;
	    }
	      
	    public void setUserSettings(UserSettingsDTO  UserSettings){
	           this.userSettings = userSettings;
	    }
	    
	      
	     
	     public ArrayList<FriendshipRequestNotificationDTO> get FriendshipRequestNotification(){
	           return  friendshipRequestNotification;
	    }
	      
	    public void setFriendshipRequestNotification( ArrayList<FriendshipRequestNotificationDTO>  friendshipRequestNotification){
	           this.friendshipRequestNotification = friendshipRequestNotification;
	    }

}