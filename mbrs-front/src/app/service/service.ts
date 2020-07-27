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
    return this.http.get(SERVER_URL + 'api/friendshipRequestNotification');
  }
  
  getFriendshipRequestNotificationById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/friendshipRequestNotification/' +id);
  }

  addFriendshipRequestNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/friendshipRequestNotification/',data);
  }
  
  editFriendshipRequestNotification(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/friendshipRequestNotification/'+id, data);
  }
  
   deleteFriendshipRequestNotificationById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/friendshipRequestNotification/' + id);
  }
  

  getNotificationAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/notification');
  }
  
  getNotificationById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/notification/' +id);
  }

  addNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/notification/',data);
  }
  
  editNotification(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/notification/'+id, data);
  }
  
   deleteNotificationById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/notification/' + id);
  }
  

  getActivityRequestNotificationAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/activityRequestNotification');
  }
  
  getActivityRequestNotificationById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/activityRequestNotification/' +id);
  }

  addActivityRequestNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/activityRequestNotification/',data);
  }
  
  editActivityRequestNotification(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/activityRequestNotification/'+id, data);
  }
  
   deleteActivityRequestNotificationById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/activityRequestNotification/' + id);
  }
  

  getFriendshipRequestAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/friendshipRequest');
  }
  
  getFriendshipRequestById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/friendshipRequest/' +id);
  }

  addFriendshipRequest(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/friendshipRequest/',data);
  }
  
  editFriendshipRequest(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/friendshipRequest/'+id, data);
  }
  
   deleteFriendshipRequestById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/friendshipRequest/' + id);
  }
  

  getUserSettingsAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/userSettings');
  }
  
  getUserSettingsById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/userSettings/' +id);
  }

  addUserSettings(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/userSettings/',data);
  }
  
  editUserSettings(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/userSettings/'+id, data);
  }
  
   deleteUserSettingsById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/userSettings/' + id);
  }
  

  getActivityAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/activity');
  }
  
  getActivityById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/activity/' +id);
  }

  addActivity(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/activity/',data);
  }
  
  editActivity(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/activity/'+id, data);
  }
  
   deleteActivityById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/activity/' + id);
  }
  

  getPostAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/post');
  }
  
  getPostById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/post/' +id);
  }

  addPost(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/post/',data);
  }
  
  editPost(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/post/'+id, data);
  }
  
   deletePostById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/post/' + id);
  }
  

  getUserAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/user');
  }
  
  getUserById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/user/' +id);
  }

  addUser(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/user/',data);
  }
  
  editUser(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/user/'+id, data);
  }
  
   deleteUserById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/user/' + id);
  }
  

  getActivityRequestAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/activityRequest');
  }
  
  getActivityRequestById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/activityRequest/' +id);
  }

  addActivityRequest(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/activityRequest/',data);
  }
  
  editActivityRequest(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/activityRequest/'+id, data);
  }
  
   deleteActivityRequestById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/activityRequest/' + id);
  }
  

  getGoalAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/goal');
  }
  
  getGoalById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/goal/' +id);
  }

  addGoal(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/goal/',data);
  }
  
  editGoal(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/goal/'+id, data);
  }
  
   deleteGoalById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/goal/' + id);
  }
  

  getCommentAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/comment');
  }
  
  getCommentById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/comment/' +id);
  }

  addComment(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/comment/',data);
  }
  
  editComment(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/comment/'+id, data);
  }
  
   deleteCommentById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/comment/' + id);
  }
  

  getLikeReactionAll(): Observable<any>{
    return this.http.get(SERVER_URL + 'api/likeReaction');
  }
  
  getLikeReactionById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/likeReaction/' +id);
  }

  addLikeReaction(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/likeReaction/',data);
  }
  
  editLikeReaction(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/likeReaction/'+id, data);
  }
  
   deleteLikeReactionById(id): Observable<any>{
    return this.http.delete(SERVER_URL + 'api/likeReaction/' + id);
  }
  

}