<table class="container table mt-3 table-hover" style="text-align:center;">
    <thead class="thead-dark">
        <tr>
            <th scope="col" colspan="5">
                  ${class.name}
            </th>
          </tr>
      <tr>
      
      	<#list properties as property>
	         <#if property.type.name == "String" >
	         	<th scope="col">${property.name}</th>
		     <#elseif property.type.name == "Boolean" >
		     	<th scope="col">${property.name}</th>
		     <#elseif property.type.name == "double" || property.type == "Integer">
		     	<th scope="col">${property.name}</th>
		     <#elseif property.type.name == "date" >  
		     	<th scope="col">${property.name}</th>
		     <#elseif property.type.name == "NotificationType" >
		     	<th scope="col">${property.name}</th>
		     <#elseif property.type.name == "Visibility" >  
		     	<th scope="col">${property.name}</th>
		     <#elseif property.type.name == "FriendshipRequestStatus" >  
		     	<th scope="col">${property.name}</th>
		     <#elseif property.type.name == "ActivityRequestStatus" >  
		     	<th scope="col">${property.name}</th>
		     </#if>   
       </#list>
       <th scope="col">Delete</th>
        
      </tr>
    </thead>
    <tbody>
      <tr *ngFor="let dat of data ; let i = index" id="1">
        <th scope="row">i</th>
        <#list properties as property>
	         <#if property.type.name == "String" >
	         	<th scope="row">{{dat.${property.name}}}</th>
		     <#elseif property.type.name == "Boolean" >
		     	<th scope="row">{{dat.${property.name}}}</th>
		     <#elseif property.type.name == "double" || property.type == "Integer">
		     	<th scope="row">{{dat.${property.name}}}</th>
		     <#elseif property.type.name == "date" >  
		     	<th scope="row">{{dat.${property.name}}}</th>
		     <#elseif property.type.name == "NotificationType" >
		     	<th scope="row">{{dat.${property.name}}}</th>
		     <#elseif property.type.name == "Visibility" >  
		     	<th scope="row">{{dat.${property.name}}}</th>
		     <#elseif property.type.name == "FriendshipRequestStatus" >  
		     	<th scope="row">{{dat.${property.name}}}</th>
		     <#elseif property.type.name == "ActivityRequestStatus" >  
		     	<th scope="row">{{dat.${property.name}}}</th>
		     </#if>   
       </#list>
	    <td>
	        <a (click)="delete${class.name}(dat.id)">delete</a>
	    </td>
      </tr>
    </tbody>
</table>