<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
	<form action="data" method="post">
		name:<input type="text" id="aname" name="aname" >
		
		<br>
		 id:<input onkeyup="validate_id()" type="text" id="eid" name="id" >
		 <span id="s1">
		 </span>
		 <br> 
		 <input type="Submit" id="bt">
		 <a href="update"><button onclick="update()">update</button></a>
		 <br>
     </form>
    </body>

<script type="text/javascript">
function validate_id()
{
var id=$("#eid").val();
alert(id);
$.ajax({
url:'validateid',
data:{"code":id},
success:function(restext)
{
if(restext!="")
{
alert("if");
$("#s1").show();
$("#s1").text(restext);
$("#s1").css("color","red");
$("#bt").prop('disabled',true);
$("#eid").prop('disabled',true);
}
}
})
}


</script>
</html>
