 
    <div class="container" style="color:green"> 
     	<h1 style="margin-bottom: 30px">${class.name}</h1> 
    </div> 
    
	<div class="container">
	    <form action="" [formGroup]="${class.name}" (ngSubmit)="onSubmit($event)">
	      <#list properties as property>
	      	 <#if property.type.name == "String" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" formControlName="${property.name}" type="text" id="${property.name}"> 
		        </div>
		     <#elseif property.type.name == "Boolean" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" formControlName="${property.name}" type="checkbox" id="${property.name}"> 
		        </div>
		     <#elseif property.type.name == "double" || property.type.name == "Integer">  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" formControlName="${property.name}" type="number" id="${property.name}"> 
		        </div>
		     <#elseif property.type.name  == "date" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" formControlName="${property.name}" type="date" id="${property.name}"> 
		        </div>
		     <#elseif property.type.name == "NotificationType" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <select class="form-control" formControlName="${property.name}" id="${property.name}">
					  <option value="1">FRIENDSHIP_REQUEST</option>
					  <option value="2">APPROVED_FRIENDSHIP</option>
					  <option value="3">DECLINED_FRIENDSHIP</option>
					  <option value="4">COMMENT_ON_POST</option>
					  <option value="5">LIKE_ON_POST</option>
					  <option value="6">ACTIVITY_REQUEST</option>
					  <option value="7">APPROVED_ACTIVITY_REQUEST</option>
					  <option value="8">REJECTED_ACTIVITY_REQUEST</option>
					  <option value="9">CANCELED_ACTIVITY_REQUEST</option>
					</select>
		        </div>
		     <#elseif property.type.name == "Visibility" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <select class="form-control" formControlName="${property.name}" id="${property.name}">
					  <option value="1">PUBLIC</option>
					  <option value="2">FRIENDS</option>
					  <option value="3">PRIVATE</option>
					</select>
		        </div>
		     <#elseif property.type.name == "FriendshipRequestStatus" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <select class="form-control" formControlName="${property.name}" id="${property.name}">
					  <option value="1">PENDING</option>
					  <option value="2">APPROVED</option>
					  <option value="3">DECLINED</option>
					</select>
		        </div>
		     <#elseif property.type.name == "ActivityRequestStatus" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <select class="form-control" formControlName="${property.name}" id="${property.name}">
					  <option value="1">PENDING</option>
					  <option value="2">ACCEPTED</option>
					  <option value="3">DECLINED</option>
					</select>
		        </div>
		     </#if>   
		  </#list> 
		          
	        <div class="container"> 
	            <button type="submit" class="btn btn-success" style="margin-left: -13px;margin-top: 20px">Edit</button>  
	        </div> 
	    </form> 
	</div> 