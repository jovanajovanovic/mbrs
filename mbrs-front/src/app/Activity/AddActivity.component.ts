import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Activity-add',
  templateUrl: './AddActivity.component.html',
  styleUrls: []
})
export class AddActivityComponent implements OnInit {

  Activity:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.Activity = this.formBuilder.group({
	     	duration :['',Validators.required],
	     	distance :['',Validators.required],
	     	date :['',Validators.required],
      });
  }

  get f() { return this.Activity.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Activity.getRawValue();
    console.log(this.data)
    this.service.addActivity(this.data).subscribe(
      data => {
    });
  }

}