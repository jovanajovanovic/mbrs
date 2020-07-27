import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-FriendshipRequest-edit',
  templateUrl: './EditFriendshipRequest.component.html',
  styleUrls: []
})
export class EditFriendshipRequestComponent implements OnInit {

  FriendshipRequest:FormGroup;
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
      this.id = params.FriendshipRequestId;
      });
  	  	
      this.FriendshipRequest = this.formBuilder.group({
	     	status :['',Validators.required],
      });
      
      this.service.getFriendshipRequestById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
	     	this.FriendshipRequest.controls.status.setValue(this.data.status);
     
     
     
  }

  get f() { return this.FriendshipRequest.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.FriendshipRequest.getRawValue();
    console.log(this.data)
    this.service.editFriendshipRequest(this.data,this.id).subscribe(
      data => {
    });
  }

}