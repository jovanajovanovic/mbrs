import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-${class.name}-edit',
  templateUrl: './Show${class.name}.component.html',
  styleUrls: []
})
export class Show${class.name}Component implements OnInit {

  submitted = false;
  data: any;
  id:number;
  

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
      
      this.service.get${class.name}All().subscribe(
      data => {
        this.data = data
      }
    );
    
  }
  
  deleteDestination(id:number){
    this.service.delete${class.name}ById(id).subscribe(
	  data => {
      }
    );
  }

}