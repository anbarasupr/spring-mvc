<%@ page session="false" trimDirectiveWhitespaces="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Web Security login Example (Authentication for Protected Pages)</h2>
	<br>
	<br>
	<h3>Session : <%=request.getSession().getId() %></h3>
	
	<form action="j_security_check" method="post">
		Enter username :<input type="text" name="j_username"> <br><br>
		Enter password :<input type="password" name="j_password"><br><br>
		<input type="submit" value="Login">
	</form>

</body>
</html>