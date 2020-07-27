import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-ActivityRequestNotification-edit',
  templateUrl: './EditActivityRequestNotification.component.html',
  styleUrls: []
})
export class EditActivityRequestNotificationComponent implements OnInit {

  ActivityRequestNotification:FormGroup;
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
      this.id = params.ActivityRequestNotificationId;
      });
  	  	
      this.ActivityRequestNotification = this.formBuilder.group({
	     	date :['',Validators.required],
	     	type :['',Validators.required],
         	description :['',Validators.required],
      });
      
      this.service.getActivityRequestNotificationById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
     
     
	     	this.ActivityRequestNotification.controls.date.setValue(this.data.date);
     
	     	this.ActivityRequestNotification.controls.type.setValue(this.data.type);
     
         	this.ActivityRequestNotification.controls.description.setValue(this.data.description);
     
  }

  get f() { return this.ActivityRequestNotification.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.ActivityRequestNotification.getRawValue();
    console.log(this.data)
    this.service.editActivityRequestNotification(this.data,this.id).subscribe(
      data => {
    });
  }

}