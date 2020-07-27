import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-ActivityRequest-edit',
  templateUrl: './EditActivityRequest.component.html',
  styleUrls: []
})
export class EditActivityRequestComponent implements OnInit {

  ActivityRequest:FormGroup;
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
      this.id = params.ActivityRequestId;
      });
  	  	
      this.ActivityRequest = this.formBuilder.group({
	     	date :['',Validators.required],
         	location :['',Validators.required],
	     	status :['',Validators.required],
      });
      
      this.service.getActivityRequestById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
	     	this.ActivityRequest.controls.date.setValue(this.data.date);
     
         	this.ActivityRequest.controls.location.setValue(this.data.location);
     
	     	this.ActivityRequest.controls.status.setValue(this.data.status);
     
     
     
  }

  get f() { return this.ActivityRequest.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.ActivityRequest.getRawValue();
    console.log(this.data)
    this.service.editActivityRequest(this.data,this.id).subscribe(
      data => {
    });
  }

}