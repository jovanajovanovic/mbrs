import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Notification-add',
  templateUrl: './AddNotification.component.html',
  styleUrls: []
})
export class AddNotificationComponent implements OnInit {

  Notification:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.Notification = this.formBuilder.group({
         	description :['',Validators.required],
	     	date :['',Validators.required],
	     	type :['',Validators.required],
      });
  }

  get f() { return this.Notification.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Notification.getRawValue();
    console.log(this.data)
    this.service.addNotification(this.data).subscribe(
      data => {
    });
  }

}