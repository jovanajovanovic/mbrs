import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProbaComponent } from './proba/proba.component';
import { Routes, RouterModule } from '@angular/router';

	import { AddFriendshipRequestNotificationComponent } from './FriendshipRequestNotification/AddFriendshipRequestNotification.component';
	import { EditFriendshipRequestNotificationComponent } from './FriendshipRequestNotification/EditFriendshipRequestNotification.component';
	import { ShowFriendshipRequestNotificationComponent } from './FriendshipRequestNotification/ShowFriendshipRequestNotification.component';
	import { AddNotificationComponent } from './Notification/AddNotification.component';
	import { EditNotificationComponent } from './Notification/EditNotification.component';
	import { ShowNotificationComponent } from './Notification/ShowNotification.component';
	import { AddActivityRequestNotificationComponent } from './ActivityRequestNotification/AddActivityRequestNotification.component';
	import { EditActivityRequestNotificationComponent } from './ActivityRequestNotification/EditActivityRequestNotification.component';
	import { ShowActivityRequestNotificationComponent } from './ActivityRequestNotification/ShowActivityRequestNotification.component';
	import { AddFriendshipRequestComponent } from './FriendshipRequest/AddFriendshipRequest.component';
	import { EditFriendshipRequestComponent } from './FriendshipRequest/EditFriendshipRequest.component';
	import { ShowFriendshipRequestComponent } from './FriendshipRequest/ShowFriendshipRequest.component';
	import { AddUserSettingsComponent } from './UserSettings/AddUserSettings.component';
	import { EditUserSettingsComponent } from './UserSettings/EditUserSettings.component';
	import { ShowUserSettingsComponent } from './UserSettings/ShowUserSettings.component';
	import { AddActivityComponent } from './Activity/AddActivity.component';
	import { EditActivityComponent } from './Activity/EditActivity.component';
	import { ShowActivityComponent } from './Activity/ShowActivity.component';
	import { AddPostComponent } from './Post/AddPost.component';
	import { EditPostComponent } from './Post/EditPost.component';
	import { ShowPostComponent } from './Post/ShowPost.component';
	import { AddUserComponent } from './User/AddUser.component';
	import { EditUserComponent } from './User/EditUser.component';
	import { ShowUserComponent } from './User/ShowUser.component';
	import { AddActivityRequestComponent } from './ActivityRequest/AddActivityRequest.component';
	import { EditActivityRequestComponent } from './ActivityRequest/EditActivityRequest.component';
	import { ShowActivityRequestComponent } from './ActivityRequest/ShowActivityRequest.component';
	import { AddGoalComponent } from './Goal/AddGoal.component';
	import { EditGoalComponent } from './Goal/EditGoal.component';
	import { ShowGoalComponent } from './Goal/ShowGoal.component';
	import { AddCommentComponent } from './Comment/AddComment.component';
	import { EditCommentComponent } from './Comment/EditComment.component';
	import { ShowCommentComponent } from './Comment/ShowComment.component';
	import { AddLikeReactionComponent } from './LikeReaction/AddLikeReaction.component';
	import { EditLikeReactionComponent } from './LikeReaction/EditLikeReaction.component';
	import { ShowLikeReactionComponent } from './LikeReaction/ShowLikeReaction.component';

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
    path: 'FriendshipRequestNotification/show',
    component: ShowFriendshipRequestNotificationComponent
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
    path: 'Notification/show',
    component: ShowNotificationComponent
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
    path: 'ActivityRequestNotification/show',
    component: ShowActivityRequestNotificationComponent
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
    path: 'FriendshipRequest/show',
    component: ShowFriendshipRequestComponent
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
    path: 'UserSettings/show',
    component: ShowUserSettingsComponent
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
    path: 'Activity/show',
    component: ShowActivityComponent
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
    path: 'Post/show',
    component: ShowPostComponent
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
    path: 'User/show',
    component: ShowUserComponent
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
    path: 'ActivityRequest/show',
    component: ShowActivityRequestComponent
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
    path: 'Goal/show',
    component: ShowGoalComponent
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
    path: 'Comment/show',
    component: ShowCommentComponent
  },
  
  {
    path: 'LikeReaction/add',
    component: AddLikeReactionComponent
  },
  {
    path: 'LikeReaction/edit/:LikeReactionId',
    component: EditLikeReactionComponent
  },
  {
    path: 'LikeReaction/show',
    component: ShowLikeReactionComponent
  },
  
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }