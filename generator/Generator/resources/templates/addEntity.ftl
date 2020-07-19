<html lang="en"> 
<head> 
  <title>Create Form</title> 
  <meta charset="utf-8"> 
  <meta name="viewport" content="width=device-width, initial-scale=1"> 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
</head> 
<body> 
    <div class="container" style="color:green"> 
     	<h1 style="margin-bottom: 30px">${class.name}</h1> 
    </div> 
    
	<div class="container"> 
	    <form action="">
	      <#list properties as property>
	      	 <#if property.type == "String" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" type="text" id="${property.name}"> 
		        </div>
		     <#elseif property.type == "Boolean" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" type="checkbox" id="${property.name}"> 
		        </div>
		     <#elseif property.type == "double" || property.type == "Integer">  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" type="number" id="${property.name}"> 
		        </div>
		     <#elseif property.type == "date" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" type="date" id="${property.name}"> 
		        </div>
		     <#elseif property.type == "NotificationType" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <select class="form-control" id="${property.name}">
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
		     <#elseif property.type == "Visibility" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <select class="form-control" id="${property.name}">
					  <option value="1">PUBLIC</option>
					  <option value="2">FRIENDS</option>
					  <option value="3">PRIVATE</option>
					</select>
		        </div>
		     <#elseif property.type == "FriendshipRequestStatus" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <select class="form-control" id="${property.name}">
					  <option value="1">PENDING</option>
					  <option value="2">APPROVED</option>
					  <option value="3">DECLINED</option>
					</select>
		        </div>
		     <#elseif property.type == "ActivityRequestStatus" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <select class="form-control" id="${property.name}">
					  <option value="1">PENDING</option>
					  <option value="2">ACCEPTED</option>
					  <option value="3">DECLINED</option>
					</select>
		        </div>
		     </#if>   
		  </#list> 
		          
	        <div class="container"> 
	            <button type="button" class="btn btn-success" style="margin-left: -13px;margin-top: 20px">Add</button>  
	        </div> 
	    </form> 
	</div> 
  
</body> 
</html> 