import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-Post-edit',
  templateUrl: './EditPost.component.html',
  styleUrls: []
})
export class EditPostComponent implements OnInit {

  Post:FormGroup;
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
      this.id = params.PostId;
      });
  	  	
      this.Post = this.formBuilder.group({
         	description :['',Validators.required],
	     	visibility :['',Validators.required],
      });
      
      this.service.getPostById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
     this.form.controls.name.setValue(this.data.description);
     this.form.controls.name.setValue(this.data.visibility);
     this.form.controls.name.setValue(this.data.);
     this.form.controls.name.setValue(this.data.);
     this.form.controls.name.setValue(this.data.);
     this.form.controls.name.setValue(this.data.);
  }

  get f() { return this.Post.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.Post.getRawValue();
    console.log(this.data)
    this.service.editPost(this.data,this.id).subscribe(
      data => {
    });
  }

}