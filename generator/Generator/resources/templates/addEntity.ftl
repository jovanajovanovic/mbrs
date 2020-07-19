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
     	<h1></h1> 
    </div> 
    
	<div class="container"> 
	    <form action="">
	      <#list properties as property>
	      	 <#if property.type == "String" >  
		        <div class="form-group"> 
		            <label for="${property.name}">${property.name}</label> 
		            <input class="form-control" type="text" id="${property.name}"> 
		        </div>
		      
		     </#if>   
		  </#list> 
		        
	         
	        <div class="container"> 
	            <button type="button" class="btn btn-success">Add</button>  
	        </div> 
	    </form> 
	</div> 
  
</body> 
</html> 