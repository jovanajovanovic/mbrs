import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-ActivityRequest-add',
  templateUrl: './AddActivityRequest.component.html',
  styleUrls: []
})
export class AddActivityRequestComponent implements OnInit {

  ActivityRequest:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.ActivityRequest = this.formBuilder.group({
	     	date :['',Validators.required],
         	location :['',Validators.required],
	     	status :['',Validators.required],
      });
  }

  get f() { return this.ActivityRequest.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.ActivityRequest.getRawValue();
    console.log(this.data)
    this.service.addActivityRequest(this.data).subscribe(
      data => {
    });
  }

}