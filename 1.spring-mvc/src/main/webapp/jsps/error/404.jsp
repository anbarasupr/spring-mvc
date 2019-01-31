<%@ page import="org.apache.tomcat.util.security.Escape" session="false"
         trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>404 - NOT FOUND</title>
</head>
<body>
	<h1>404 Not found</h1>
   <p>
    The page you tried to access
    (<%=Escape.htmlElementContent((String) request.getAttribute(
            "javax.servlet.error.request_uri"))%>)
    does not exist.
   </p>
	<h3>Session : <%=request.getSession().getId() %></h3>
	<a href="/spring-mvc/index.jsp?logoff=yes"><button class="button">Log In</button></a>
	
</body>
</html>