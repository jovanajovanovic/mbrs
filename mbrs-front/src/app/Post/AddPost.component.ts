import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Post-add',
  templateUrl: './AddPost.component.html',
  styleUrls: []
})
export class AddPostComponent implements OnInit {

  Post:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.Post = this.formBuilder.group({
         	description :['',Validators.required],
	     	visibility :['',Validators.required],
      });
  }

  get f() { return this.Post.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Post.getRawValue();
    console.log(this.data)
    this.service.addPost(this.data).subscribe(
      data => {
    });
  }

}