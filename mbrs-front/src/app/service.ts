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
  
  
  getFriendshipRequestNotificationById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/FriendshipRequestNotification/' +id);
  }

  addFriendshipRequestNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/FriendshipRequestNotification/',data);
  }
  
  editFriendshipRequestNotification(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/FriendshipRequestNotification/'+id, data);
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
  
  getActivityRequestNotificationById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/ActivityRequestNotification/' +id);
  }

  addActivityRequestNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/ActivityRequestNotification/',data);
  }
  
  editActivityRequestNotification(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/ActivityRequestNotification/'+id, data);
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
  
  getUserSettingsById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/UserSettings/' +id);
  }

  addUserSettings(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/UserSettings/',data);
  }
  
  editUserSettings(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/UserSettings/'+id, data);
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
  
  getPostById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Post/' +id);
  }

  addPost(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/Post/',data);
  }
  
  editPost(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/Post/'+id, data);
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
  
  getActivityRequestById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/ActivityRequest/' +id);
  }

  addActivityRequest(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/ActivityRequest/',data);
  }
  
  editActivityRequest(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/ActivityRequest/'+id, data);
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
  
  getCommentById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/Comment/' +id);
  }

  addComment(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/Comment/',data);
  }
  
  editComment(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/Comment/'+id, data);
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
  

}