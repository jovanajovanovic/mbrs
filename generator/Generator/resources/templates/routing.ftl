import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProbaComponent } from './proba/proba.component';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: '${class.name}/add',
    component: Add${class.name}Component
  },
  {
    path: '${class.name}/edit',
    component: Edit${class.name}Component
  },
  {
    path: '${class.name}/show',
    component: Show${class.name}Component
  },
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }