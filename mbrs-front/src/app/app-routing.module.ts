import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProbaComponent } from './proba/proba.component';
import { Routes, RouterModule } from '@angular/router';

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

const routes: Routes = [
  {
    path: 'FriendshipRequestNotification/add',
    component: AddFriendshipRequestNotificationComponent
  },
  {
    path: 'Notification/add',
    component: AddNotificationComponent
  },
  {
    path: 'ActivityRequestNotification/add',
    component: AddActivityRequestNotificationComponent
  },
  {
    path: 'FriendshipRequest/add',
    component: AddFriendshipRequestComponent
  },
  {
    path: 'UserSettings/add',
    component: AddUserSettingsComponent
  },
  {
    path: 'Activity/add',
    component: AddActivityComponent
  },
  {
    path: 'Post/add',
    component: AddPostComponent
  },
  {
    path: 'User/add',
    component: AddUserComponent
  },
  {
    path: 'ActivityRequest/add',
    component: AddActivityRequestComponent
  },
  {
    path: 'Goal/add',
    component: AddGoalComponent
  },
  {
    path: 'Comment/add',
    component: AddCommentComponent
  },
  {
    path: 'LikeReaction/add',
    component: AddLikeReactionComponent
  },
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }