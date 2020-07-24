import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ProbaComponent } from './proba/proba.component';

	import { AddFriendshipRequestNotificationComponent } from './FriendshipRequestNotification/AddFriendshipRequestNotification.component';
	import { AddNotificationComponent } from './Notification/AddNotification.component';
	import { AddActivityRequestNotificationComponent } from './ActivityRequestNotification/AddActivityRequestNotification.component';
	import { AddFriendshipRequestComponent } from './FriendshipRequest/AddFriendshipRequest.component';
	import { AddUserSettingsComponent } from './UserSettings/AddUserSettings.component';
	import { AddActivityComponent } from './Activity/AddActivity.component';
	import { AddPostComponent } from './Post/AddPost.component';
	import { AddUserComponent } from './User/AddUser.component';
	import { AddActivityRequestComponent } from './ActivityRequest/AddActivityRequest.component';
	import { AddGoalComponent } from './Goal/AddGoal.component';
	import { AddCommentComponent } from './Comment/AddComment.component';
	import { AddLikeReactionComponent } from './LikeReaction/AddLikeReaction.component';

@NgModule({
  declarations: [
    AppComponent,
    ProbaComponent,
    AddFriendshipRequestNotificationComponent,
    AddNotificationComponent,
    AddActivityRequestNotificationComponent,
    AddFriendshipRequestComponent,
    AddUserSettingsComponent,
    AddActivityComponent,
    AddPostComponent,
    AddUserComponent,
    AddActivityRequestComponent,
    AddGoalComponent,
    AddCommentComponent,
    AddLikeReactionComponent,
    
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
