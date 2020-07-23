import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProbaComponent } from './proba/proba.component';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    component: ProbaComponent
  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
