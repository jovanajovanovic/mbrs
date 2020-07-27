import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-FriendshipRequestNotification-edit',
  templateUrl: './EditFriendshipRequestNotification.component.html',
  styleUrls: []
})
export class EditFriendshipRequestNotificationComponent implements OnInit {

  FriendshipRequestNotification:FormGroup;
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
      this.id = params.FriendshipRequestNotificationId;
      });
  	  	
      this.FriendshipRequestNotification = this.formBuilder.group({
      });
      
      this.service.getFriendshipRequestNotificationById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
     
  }

  get f() { return this.FriendshipRequestNotification.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.FriendshipRequestNotification.getRawValue();
    console.log(this.data)
    this.service.editFriendshipRequestNotification(this.data,this.id).subscribe(
      data => {
    });
  }

}