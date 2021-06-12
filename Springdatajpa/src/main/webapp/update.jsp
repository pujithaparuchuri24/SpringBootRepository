<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>update</h1>
${employee}
${student}
<form action="/update" method="post"  >
		name:<input type="text" name="aname" value=${employee.aname}><br> id:<input
			type="text" name="id"  value=${employee.id}><br> 
			<input type="submit" value="update" ><br>
				</form>

</body>
</html>