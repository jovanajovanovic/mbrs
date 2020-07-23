import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ProbaComponent } from './proba/proba.component';

import { Add${class.name}Component } from './{class.name}/Add${class.name}.component';
import { Edit${class.name}Component } from './{class.name}/Edit${class.name}.component';
import { Show${class.name}Component } from './{class.name}/Show${class.name}.component';

@NgModule({
  declarations: [
    AppComponent,
    ProbaComponent,
    Add${class.name}Component,
    Edit${class.name}Component,
    Show${class.name}Component
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
