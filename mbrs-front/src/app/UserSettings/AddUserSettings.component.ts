import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-UserSettings-add',
  templateUrl: './AddUserSettings.component.html',
  styleUrls: []
})
export class AddUserSettingsComponent implements OnInit {

  UserSettings:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
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
  }

  get f() { return this.UserSettings.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.UserSettings.getRawValue();
    console.log(this.data)
    this.service.addUserSettings(this.data).subscribe(
      data => {
    });
  }

}