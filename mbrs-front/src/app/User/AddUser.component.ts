import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-User-add',
  templateUrl: './AddUser.component.html',
  styleUrls: []
})
export class AddUserComponent implements OnInit {

  User:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.User = this.formBuilder.group({
         	username :['',Validators.required],
         	password :['',Validators.required],
         	name :['',Validators.required],
         	surname :['',Validators.required],
	     	dateOfBirth :['',Validators.required],
         	location :['',Validators.required],
         	biography :['',Validators.required],
	     	height :['',Validators.required],
	     	weight :['',Validators.required],
      });
  }

  get f() { return this.User.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.User.getRawValue();
    console.log(this.data)
    this.service.addUser(this.data).subscribe(
      data => {
    });
  }

}