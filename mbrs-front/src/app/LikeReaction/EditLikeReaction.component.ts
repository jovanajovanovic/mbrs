import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-LikeReaction-edit',
  templateUrl: './EditLikeReaction.component.html',
  styleUrls: []
})
export class EditLikeReactionComponent implements OnInit {

  LikeReaction:FormGroup;
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
      this.id = params.LikeReactionId;
      });
  	  	
      this.LikeReaction = this.formBuilder.group({
      });
      
      this.service.getLikeReactionById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
     this.form.controls.name.setValue(this.data.);
  }

  get f() { return this.LikeReaction.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.LikeReaction.getRawValue();
    console.log(this.data)
    this.service.editLikeReaction(this.data,this.id).subscribe(
      data => {
    });
  }

}