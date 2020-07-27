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
  get${class.name}ById(id): Observable<any>{
    return this.http.get(SERVER_URL + 'api/${class.name}/' +id);
  }

  add${class.name}(data): Observable<any>{
    return this.http.post(SERVER_URL + 'api/${class.name}/',data);
  }
  
  edit${class.name}(data,id): Observable<any>{
    return this.http.put(SERVER_URL + 'api/${class.name}/'+id, data);
  }
  
</#list>

}