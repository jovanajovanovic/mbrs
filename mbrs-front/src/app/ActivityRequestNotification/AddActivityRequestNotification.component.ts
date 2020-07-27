import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-ActivityRequestNotification-add',
  templateUrl: './AddActivityRequestNotification.component.html',
  styleUrls: []
})
export class AddActivityRequestNotificationComponent implements OnInit {

  ActivityRequestNotification:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.ActivityRequestNotification = this.formBuilder.group({
	     	date :['',Validators.required],
	     	type :['',Validators.required],
         	description :['',Validators.required],
      });
  }

  get f() { return this.ActivityRequestNotification.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.ActivityRequestNotification.getRawValue();
    console.log(this.data)
    this.service.addActivityRequestNotification(this.data).subscribe(
      data => {
    });
  }

}