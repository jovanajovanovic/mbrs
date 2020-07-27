import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Activity-edit',
  templateUrl: './EditActivity.component.html',
  styleUrls: []
})
export class EditActivityComponent implements OnInit {

  Activity:FormGroup;
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
      this.id = params.ActivityId;
      });
  	  	
      this.Activity = this.formBuilder.group({
	     	duration :['',Validators.required],
	     	distance :['',Validators.required],
	     	date :['',Validators.required],
      });
      
      this.service.getActivityById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
     this.form.controls.name.setValue(this.data.duration);
     this.form.controls.name.setValue(this.data.distance);
     this.form.controls.name.setValue(this.data.date);
     this.form.controls.name.setValue(this.data.steps);
  }

  get f() { return this.Activity.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Activity.getRawValue();
    console.log(this.data)
    this.service.editActivity(this.data,this.id).subscribe(
      data => {
    });
  }

}