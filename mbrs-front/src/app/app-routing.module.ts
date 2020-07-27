import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProbaComponent } from './proba/proba.component';
import { Routes, RouterModule } from '@angular/router';

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

const routes: Routes = [
  {
    path: 'FriendshipRequestNotification/add',
    component: AddFriendshipRequestNotificationComponent
  },
  {
    path: 'FriendshipRequestNotification/edit/:FriendshipRequestNotificationId',
    component: EditFriendshipRequestNotificationComponent
  },
  
  {
    path: 'Notification/add',
    component: AddNotificationComponent
  },
  {
    path: 'Notification/edit/:NotificationId',
    component: EditNotificationComponent
  },
  
  {
    path: 'ActivityRequestNotification/add',
    component: AddActivityRequestNotificationComponent
  },
  {
    path: 'ActivityRequestNotification/edit/:ActivityRequestNotificationId',
    component: EditActivityRequestNotificationComponent
  },
  
  {
    path: 'FriendshipRequest/add',
    component: AddFriendshipRequestComponent
  },
  {
    path: 'FriendshipRequest/edit/:FriendshipRequestId',
    component: EditFriendshipRequestComponent
  },
  
  {
    path: 'UserSettings/add',
    component: AddUserSettingsComponent
  },
  {
    path: 'UserSettings/edit/:UserSettingsId',
    component: EditUserSettingsComponent
  },
  
  {
    path: 'Activity/add',
    component: AddActivityComponent
  },
  {
    path: 'Activity/edit/:ActivityId',
    component: EditActivityComponent
  },
  
  {
    path: 'Post/add',
    component: AddPostComponent
  },
  {
    path: 'Post/edit/:PostId',
    component: EditPostComponent
  },
  
  {
    path: 'User/add',
    component: AddUserComponent
  },
  {
    path: 'User/edit/:UserId',
    component: EditUserComponent
  },
  
  {
    path: 'ActivityRequest/add',
    component: AddActivityRequestComponent
  },
  {
    path: 'ActivityRequest/edit/:ActivityRequestId',
    component: EditActivityRequestComponent
  },
  
  {
    path: 'Goal/add',
    component: AddGoalComponent
  },
  {
    path: 'Goal/edit/:GoalId',
    component: EditGoalComponent
  },
  
  {
    path: 'Comment/add',
    component: AddCommentComponent
  },
  {
    path: 'Comment/edit/:CommentId',
    component: EditCommentComponent
  },
  
  {
    path: 'LikeReaction/add',
    component: AddLikeReactionComponent
  },
  {
    path: 'LikeReaction/edit/:LikeReactionId',
    component: EditLikeReactionComponent
  },
  
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }