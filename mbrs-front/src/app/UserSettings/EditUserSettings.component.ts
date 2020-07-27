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
     this.form.controls.name.setValue(this.data.userInfoPrivacy);
     this.form.controls.name.setValue(this.data.postPrivacy);
     this.form.controls.name.setValue(this.data.goalPrivacy);
     this.form.controls.name.setValue(this.data.newComments);
     this.form.controls.name.setValue(this.data.newLikes);
     this.form.controls.name.setValue(this.data.friendshipRequest);
     this.form.controls.name.setValue(this.data.acceptedFriendship);
     this.form.controls.name.setValue(this.data.activityRequest);
     this.form.controls.name.setValue(this.data.acceptedActivity);
     this.form.controls.name.setValue(this.data.canceledActivity);
     this.form.controls.name.setValue(this.data.nightTheme);
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