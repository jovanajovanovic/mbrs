import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-UserSettings-edit',
  templateUrl: './EditUserSettings.component.html',
  styleUrls: []
})
export class EditUserSettingsComponent implements OnInit {

  UserSettings:FormGroup;
  submitted = false;
  data: any;
  id:number;
  

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
  
  	  this.activatedRoute.params.subscribe(params =>{
      this.id = params.UserSettingsId;
      });
  	  	
      this.UserSettings = this.formBuilder.group({
	     	userInfoPrivacy :['',Validators.required],
	     	postPrivacy :['',Validators.required],
	     	goalPrivacy :['',Validators.required],
	     	newComments :['',Validators.required],
	     	newLikes :['',Validators.required],
	     	friendshipRequest :['',Validators.required],
	     	acceptedFriendship :['',Validators.required],
	     	activityRequest :['',Validators.required],
	     	acceptedActivity :['',Validators.required],
	     	canceledActivity :['',Validators.required],
	     	nightTheme :['',Validators.required],
      });
      
      this.service.getUserSettingsById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
	     	this.UserSettings.controls.userInfoPrivacy.setValue(this.data.userInfoPrivacy);
     
	     	this.UserSettings.controls.postPrivacy.setValue(this.data.postPrivacy);
     
	     	this.UserSettings.controls.goalPrivacy.setValue(this.data.goalPrivacy);
     
	     	this.UserSettings.controls.newComments.setValue(this.data.newComments);
     
	     	this.UserSettings.controls.newLikes.setValue(this.data.newLikes);
     
	     	this.UserSettings.controls.friendshipRequest.setValue(this.data.friendshipRequest);
     
	     	this.UserSettings.controls.acceptedFriendship.setValue(this.data.acceptedFriendship);
     
	     	this.UserSettings.controls.activityRequest.setValue(this.data.activityRequest);
     
	     	this.UserSettings.controls.acceptedActivity.setValue(this.data.acceptedActivity);
     
	     	this.UserSettings.controls.canceledActivity.setValue(this.data.canceledActivity);
     
	     	this.UserSettings.controls.nightTheme.setValue(this.data.nightTheme);
     
  }

  get f() { return this.UserSettings.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.UserSettings.getRawValue();
    console.log(this.data)
    this.service.editUserSettings(this.data,this.id).subscribe(
      data => {
    });
  }

}