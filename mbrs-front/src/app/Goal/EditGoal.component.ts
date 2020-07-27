import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Goal-edit',
  templateUrl: './EditGoal.component.html',
  styleUrls: []
})
export class EditGoalComponent implements OnInit {

  Goal:FormGroup;
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
      this.id = params.GoalId;
      });
  	  	
      this.Goal = this.formBuilder.group({
         	title :['',Validators.required],
	     	duration :['',Validators.required],
	     	date :['',Validators.required],
	     	distance :['',Validators.required],
	     	achieved :['',Validators.required],
      });
      
      this.service.getGoalById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
         	this.Goal.controls.title.setValue(this.data.title);
     
	     	this.Goal.controls.duration.setValue(this.data.duration);
     
	     	this.Goal.controls.date.setValue(this.data.date);
     
	     	this.Goal.controls.distance.setValue(this.data.distance);
     
	     	this.Goal.controls.achieved.setValue(this.data.achieved);
     
     
  }

  get f() { return this.Goal.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Goal.getRawValue();
    console.log(this.data)
    this.service.editGoal(this.data,this.id).subscribe(
      data => {
    });
  }

}