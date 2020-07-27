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
         	this.User.controls.username.setValue(this.data.username);
     
         	this.User.controls.password.setValue(this.data.password);
     
         	this.User.controls.name.setValue(this.data.name);
     
         	this.User.controls.surname.setValue(this.data.surname);
     
	     	this.User.controls.dateOfBirth.setValue(this.data.dateOfBirth);
     
         	this.User.controls.location.setValue(this.data.location);
     
         	this.User.controls.biography.setValue(this.data.biography);
     
	     	this.User.controls.height.setValue(this.data.height);
     
     
     
	     	this.User.controls.weight.setValue(this.data.weight);
     
     
     
     
     
     
     
     
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