import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProbaComponent } from './proba/proba.component';
import { Routes, RouterModule } from '@angular/router';

<#list classes as class>
	import { Add${class.name}Component } from './${class.name}/Add${class.name}.component';
	import { Edit${class.name}Component } from './${class.name}/Edit${class.name}.component';
	import { Show${class.name}Component } from './${class.name}/Show${class.name}.component';
</#list>

const routes: Routes = [
<#list classes as class>
  {
    path: '${class.name}/add',
    component: Add${class.name}Component
  },
  {
    path: '${class.name}/edit/:${class.name}Id',
    component: Edit${class.name}Component
  },
  {
    path: '${class.name}/show',
    component: Show${class.name}Component
  },
  
</#list>
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }