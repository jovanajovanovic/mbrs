import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-${class.name}-edit',
  templateUrl: './Edit${class.name}.component.html',
  styleUrls: []
})
export class Edit${class.name}Component implements OnInit {

  ${class.name}:FormGroup;
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
      this.id = params.${class.name}Id;
      });
  	  	
      this.${class.name} = this.formBuilder.group({
       <#list properties as property>
         <#if property.type.name == "String" >
         	${property.name} :['',Validators.required],
	     <#elseif property.type.name == "Boolean" >
	     	${property.name} :['',Validators.required],
	     <#elseif property.type.name == "double" || property.type == "Integer">
	     	${property.name} :['',Validators.required],
	     <#elseif property.type.name == "date" >  
	     	${property.name} :['',Validators.required],
	     <#elseif property.type.name == "NotificationType" >
	     	${property.name} :['',Validators.required],
	     <#elseif property.type.name == "Visibility" >  
	     	${property.name} :['',Validators.required],
	     <#elseif property.type.name == "FriendshipRequestStatus" >  
	     	${property.name} :['',Validators.required],
	     <#elseif property.type.name == "ActivityRequestStatus" >  
	     	${property.name} :['',Validators.required],
	     </#if>   
       </#list>
      });
      
      this.service.get${class.name}ById(this.id).subscribe(
      data => {
        this.data = data
        this.setValues();
      }
    );
  }

  setValues(){
   <#list properties as property>
     this.form.controls.name.setValue(this.data.${property.name});
   </#list>    
  }

  get f() { return this.${class.name}.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.${class.name}.getRawValue();
    console.log(this.data)
    this.service.edit${class.name}(this.data,this.id).subscribe(
      data => {
    });
  }

}