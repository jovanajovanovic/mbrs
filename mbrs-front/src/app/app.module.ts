import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ProbaComponent } from './proba/proba.component';

	import { AddFriendshipRequestNotificationComponent } from './FriendshipRequestNotification/AddFriendshipRequestNotification.component';
	import { EditFriendshipRequestNotificationComponent } from './FriendshipRequestNotification/EditFriendshipRequestNotification.component';
	import { AddNotificationComponent } from './Notification/AddNotification.component';
	import { EditNotificationComponent } from './Notification/EditNotification.component';
	import { AddActivityRequestNotificationComponent } from './ActivityRequestNotification/AddActivityRequestNotification.component';
	import { EditActivityRequestNotificationComponent } from './ActivityRequestNotification/EditActivityRequestNotification.component';
	import { AddFriendshipRequestComponent } from './FriendshipRequest/AddFriendshipRequest.component';
	import { EditFriendshipRequestComponent } from './FriendshipRequest/EditFriendshipRequest.component';
	import { AddUserSettingsComponent } from './UserSettings/AddUserSettings.component';
	import { EditUserSettingsComponent } from './UserSettings/EditUserSettings.component';
	import { AddActivityComponent } from './Activity/AddActivity.component';
	import { EditActivityComponent } from './Activity/EditActivity.component';
	import { AddPostComponent } from './Post/AddPost.component';
	import { EditPostComponent } from './Post/EditPost.component';
	import { AddUserComponent } from './User/AddUser.component';
	import { EditUserComponent } from './User/EditUser.component';
	import { AddActivityRequestComponent } from './ActivityRequest/AddActivityRequest.component';
	import { EditActivityRequestComponent } from './ActivityRequest/EditActivityRequest.component';
	import { AddGoalComponent } from './Goal/AddGoal.component';
	import { EditGoalComponent } from './Goal/EditGoal.component';
	import { AddCommentComponent } from './Comment/AddComment.component';
	import { EditCommentComponent } from './Comment/EditComment.component';
	import { AddLikeReactionComponent } from './LikeReaction/AddLikeReaction.component';
	import { EditLikeReactionComponent } from './LikeReaction/EditLikeReaction.component';

@NgModule({
  declarations: [
    AppComponent,
    ProbaComponent,
    AddFriendshipRequestNotificationComponent,
    EditFriendshipRequestNotificationComponent,
    AddNotificationComponent,
    EditNotificationComponent,
    AddActivityRequestNotificationComponent,
    EditActivityRequestNotificationComponent,
    AddFriendshipRequestComponent,
    EditFriendshipRequestComponent,
    AddUserSettingsComponent,
    EditUserSettingsComponent,
    AddActivityComponent,
    EditActivityComponent,
    AddPostComponent,
    EditPostComponent,
    AddUserComponent,
    EditUserComponent,
    AddActivityRequestComponent,
    EditActivityRequestComponent,
    AddGoalComponent,
    EditGoalComponent,
    AddCommentComponent,
    EditCommentComponent,
    AddLikeReactionComponent,
    EditLikeReactionComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
