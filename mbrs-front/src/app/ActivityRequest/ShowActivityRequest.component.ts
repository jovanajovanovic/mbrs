import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-ActivityRequest-edit',
  templateUrl: './ShowActivityRequest.component.html',
  styleUrls: []
})
export class ShowActivityRequestComponent implements OnInit {

  submitted = false;
  data: any;
  id:number;
  

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      
      this.service.getActivityRequestAll().subscribe(
      data => {
        this.data = data
      }
    );
    
  }
  
  deleteDestination(id:number){
    this.service.deleteActivityRequestById(id).subscribe(
	  data => {
      }
    );
  }

}