import { Injectable } from '@angular/core';
import { SERVER_URL} from '../app.constant';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Service {

  constructor(private http:HttpClient){

  }
  
  
  

  getFriendshipRequestNotificationAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/FriendshipRequestNotification');
  }
  
  getFriendshipRequestNotificationById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/FriendshipRequestNotification/' +id);
  }

  addFriendshipRequestNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/FriendshipRequestNotification/',data);
  }
  
  editFriendshipRequestNotification(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/FriendshipRequestNotification/'+id, data);
  }
  
   deleteFriendshipRequestNotificationById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/FriendshipRequestNotification/' + id);
  }
  

  getNotificationAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Notification');
  }
  
  getNotificationById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Notification/' +id);
  }

  addNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/Notification/',data);
  }
  
  editNotification(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/Notification/'+id, data);
  }
  
   deleteNotificationById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/Notification/' + id);
  }
  

  getActivityRequestNotificationAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/ActivityRequestNotification');
  }
  
  getActivityRequestNotificationById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/ActivityRequestNotification/' +id);
  }

  addActivityRequestNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/ActivityRequestNotification/',data);
  }
  
  editActivityRequestNotification(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/ActivityRequestNotification/'+id, data);
  }
  
   deleteActivityRequestNotificationById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/ActivityRequestNotification/' + id);
  }
  

  getFriendshipRequestAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/FriendshipRequest');
  }
  
  getFriendshipRequestById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/FriendshipRequest/' +id);
  }

  addFriendshipRequest(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/FriendshipRequest/',data);
  }
  
  editFriendshipRequest(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/FriendshipRequest/'+id, data);
  }
  
   deleteFriendshipRequestById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/FriendshipRequest/' + id);
  }
  

  getUserSettingsAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/UserSettings');
  }
  
  getUserSettingsById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/UserSettings/' +id);
  }

  addUserSettings(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/UserSettings/',data);
  }
  
  editUserSettings(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/UserSettings/'+id, data);
  }
  
   deleteUserSettingsById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/UserSettings/' + id);
  }
  

  getActivityAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Activity');
  }
  
  getActivityById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Activity/' +id);
  }

  addActivity(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/Activity/',data);
  }
  
  editActivity(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/Activity/'+id, data);
  }
  
   deleteActivityById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/Activity/' + id);
  }
  

  getPostAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Post');
  }
  
  getPostById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Post/' +id);
  }

  addPost(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/Post/',data);
  }
  
  editPost(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/Post/'+id, data);
  }
  
   deletePostById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/Post/' + id);
  }
  

  getUserAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/User');
  }
  
  getUserById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/User/' +id);
  }

  addUser(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/User/',data);
  }
  
  editUser(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/User/'+id, data);
  }
  
   deleteUserById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/User/' + id);
  }
  

  getActivityRequestAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/ActivityRequest');
  }
  
  getActivityRequestById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/ActivityRequest/' +id);
  }

  addActivityRequest(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/ActivityRequest/',data);
  }
  
  editActivityRequest(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/ActivityRequest/'+id, data);
  }
  
   deleteActivityRequestById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/ActivityRequest/' + id);
  }
  

  getGoalAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Goal');
  }
  
  getGoalById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Goal/' +id);
  }

  addGoal(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/Goal/',data);
  }
  
  editGoal(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/Goal/'+id, data);
  }
  
   deleteGoalById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/Goal/' + id);
  }
  

  getCommentAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Comment');
  }
  
  getCommentById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Comment/' +id);
  }

  addComment(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/Comment/',data);
  }
  
  editComment(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/Comment/'+id, data);
  }
  
   deleteCommentById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/Comment/' + id);
  }
  

  getLikeReactionAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/LikeReaction');
  }
  
  getLikeReactionById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/LikeReaction/' +id);
  }

  addLikeReaction(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/LikeReaction/',data);
  }
  
  editLikeReaction(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/LikeReaction/'+id, data);
  }
  
   deleteLikeReactionById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/LikeReaction/' + id);
  }
  

}