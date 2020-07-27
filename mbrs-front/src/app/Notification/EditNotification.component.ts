import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Notification-edit',
  templateUrl: './EditNotification.component.html',
  styleUrls: []
})
export class EditNotificationComponent implements OnInit {

  Notification:FormGroup;
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
      this.id = params.NotificationId;
      });
  	  	
      this.Notification = this.formBuilder.group({
         	description :['',Validators.required],
	     	date :['',Validators.required],
	     	type :['',Validators.required],
      });
      
      this.service.getNotificationById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
         	this.Notification.controls.description.setValue(this.data.description);
     
	     	this.Notification.controls.date.setValue(this.data.date);
     
	     	this.Notification.controls.type.setValue(this.data.type);
     
     
  }

  get f() { return this.Notification.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Notification.getRawValue();
    console.log(this.data)
    this.service.editNotification(this.data,this.id).subscribe(
      data => {
    });
  }

}