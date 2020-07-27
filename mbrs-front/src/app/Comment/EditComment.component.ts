import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Comment-edit',
  templateUrl: './EditComment.component.html',
  styleUrls: []
})
export class EditCommentComponent implements OnInit {

  Comment:FormGroup;
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
      this.id = params.CommentId;
      });
  	  	
      this.Comment = this.formBuilder.group({
         	text :['',Validators.required],
	     	date :['',Validators.required],
      });
      
      this.service.getCommentById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
     this.form.controls.name.setValue(this.data.text);
     this.form.controls.name.setValue(this.data.date);
     this.form.controls.name.setValue(this.data.);
  }

  get f() { return this.Comment.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Comment.getRawValue();
    console.log(this.data)
    this.service.editComment(this.data,this.id).subscribe(
      data => {
    });
  }

}