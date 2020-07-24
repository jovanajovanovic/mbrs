import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Comment-add',
  templateUrl: './AddComment.component.html',
  styleUrls: []
})
export class AddCommentComponent implements OnInit {

  Comment:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.Comment = this.formBuilder.group({
         	text :['',Validators.required],
	     	date :['',Validators.required],
      });
  }

  get f() { return this.Comment.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Comment.getRawValue();
    console.log(this.data)
    this.service.addComment(this.data).subscribe(
      data => {
    });
  }

}