import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-User-edit',
  templateUrl: './EditUser.component.html',
  styleUrls: []
})
export class EditUserComponent implements OnInit {

  User:FormGroup;
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
      this.id = params.UserId;
      });
  	  	
      this.User = this.formBuilder.group({
         	username :['',Validators.required],
         	password :['',Validators.required],
         	name :['',Validators.required],
         	surname :['',Validators.required],
	     	dateOfBirth :['',Validators.required],
         	location :['',Validators.required],
         	biography :['',Validators.required],
	     	height :['',Validators.required],
	     	weight :['',Validators.required],
      });
      
      this.service.getUserById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
     this.form.controls.name.setValue(this.data.username);
     this.form.controls.name.setValue(this.data.password);
     this.form.controls.name.setValue(this.data.name);
     this.form.controls.name.setValue(this.data.surname);
     this.form.controls.name.setValue(this.data.dateOfBirth);
     this.form.controls.name.setValue(this.data.location);
     this.form.controls.name.setValue(this.data.biography);
     this.form.controls.name.setValue(this.data.height);
     this.form.controls.name.setValue(this.data.);
     this.form.controls.name.setValue(this.data.pendingActivities);
     this.form.controls.name.setValue(this.data.weight);
     this.form.controls.name.setValue(this.data.);
     this.form.controls.name.setValue(this.data.);
     this.form.controls.name.setValue(this.data.pendingFriendships);
     this.form.controls.name.setValue(this.data.);
     this.form.controls.name.setValue(this.data.);
     this.form.controls.name.setValue(this.data.);
  }

  get f() { return this.User.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.User.getRawValue();
    console.log(this.data)
    this.service.editUser(this.data,this.id).subscribe(
      data => {
    });
  }

}