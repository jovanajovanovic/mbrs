import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Goal-add',
  templateUrl: './AddGoal.component.html',
  styleUrls: []
})
export class AddGoalComponent implements OnInit {

  Goal:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.Goal = this.formBuilder.group({
         	title :['',Validators.required],
	     	duration :['',Validators.required],
	     	date :['',Validators.required],
	     	distance :['',Validators.required],
	     	achieved :['',Validators.required],
      });
  }

  get f() { return this.Goal.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Goal.getRawValue();
    console.log(this.data)
    this.service.addGoal(this.data).subscribe(
      data => {
    });
  }

}