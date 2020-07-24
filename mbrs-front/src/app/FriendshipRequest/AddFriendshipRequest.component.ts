import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-FriendshipRequest-add',
  templateUrl: './AddFriendshipRequest.component.html',
  styleUrls: []
})
export class AddFriendshipRequestComponent implements OnInit {

  FriendshipRequest:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.FriendshipRequest = this.formBuilder.group({
	     	status :['',Validators.required],
      });
  }

  get f() { return this.FriendshipRequest.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.FriendshipRequest.getRawValue();
    console.log(this.data)
    this.service.addFriendshipRequest(this.data).subscribe(
      data => {
    });
  }

}