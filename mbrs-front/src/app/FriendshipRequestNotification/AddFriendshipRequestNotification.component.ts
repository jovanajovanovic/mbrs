import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-FriendshipRequestNotification-add',
  templateUrl: './AddFriendshipRequestNotification.component.html',
  styleUrls: []
})
export class AddFriendshipRequestNotificationComponent implements OnInit {

  FriendshipRequestNotification:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.FriendshipRequestNotification = this.formBuilder.group({
      });
  }

  get f() { return this.FriendshipRequestNotification.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.FriendshipRequestNotification.getRawValue();
    console.log(this.data)
    this.service.addFriendshipRequestNotification(this.data).subscribe(
      data => {
    });
  }

}