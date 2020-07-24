import { Injectable } from '@angular/core';
import { SERVER_URL} from '../app.constant';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Service {

  constructor(private http:HttpClient){

  }
  
  
<#list classes as class>
  add${class.name}(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/${class.name}',data);
  }
</#list>

}