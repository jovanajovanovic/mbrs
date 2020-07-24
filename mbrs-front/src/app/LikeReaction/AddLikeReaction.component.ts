import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-LikeReaction-add',
  templateUrl: './AddLikeReaction.component.html',
  styleUrls: []
})
export class AddLikeReactionComponent implements OnInit {

  LikeReaction:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      this.LikeReaction = this.formBuilder.group({
      });
  }

  get f() { return this.LikeReaction.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.LikeReaction.getRawValue();
    console.log(this.data)
    this.service.addLikeReaction(this.data).subscribe(
      data => {
    });
  }

}