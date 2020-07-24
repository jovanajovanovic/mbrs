import { Component, OnInit } from '@angular/core';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Service } from 'src/app/service/service';

@Component({
  selector: 'app-${class.name}-add',
  templateUrl: './Add${class.name}.component.html',
  styleUrls: []
})
export class Add${class.name}Component implements OnInit {

  ${class.name}:FormGroup;
  submitted = false;
  data: any;

  constructor(
    private service : Service,
    private formBuilder : FormBuilder,
    private router : Router,
    private activatedRoute : ActivatedRoute) { }

  ngOnInit() {
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
  }

  get f() { return this.${class.name}.controls; }

  onSubmit(event:any) {
    this.submitted = true;
    this.data = this.${class.name}.getRawValue();
    console.log(this.data)
    this.service.add${class.name}(this.data).subscribe(
      data => {
    });
  }

}