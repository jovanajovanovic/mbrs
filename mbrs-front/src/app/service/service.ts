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
  
  
  addFriendshipRequestNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/FriendshipRequestNotification',data);
  }
  addNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/Notification',data);
  }
  addActivityRequestNotification(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/ActivityRequestNotification',data);
  }
  addFriendshipRequest(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/FriendshipRequest',data);
  }
  addUserSettings(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/UserSettings',data);
  }
  addActivity(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/Activity',data);
  }
  addPost(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/Post',data);
  }
  addUser(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/User',data);
  }
  addActivityRequest(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/ActivityRequest',data);
  }
  addGoal(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/Goal',data);
  }
  addComment(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/Comment',data);
  }
  addLikeReaction(data): Observable<any>{
    return this.http.post(SERVER_URL + '/api/LikeReaction',data);
  }

}