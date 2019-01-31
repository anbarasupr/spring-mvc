<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<sql:query var="rs" dataSource="jdbc/authority">
select user_name,user_pass from users
</sql:query>

<html>
  <head>
    <title>DB Test</title>
    
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
  </head>
  <body>

  <h2>Results</h2>

<c:forEach var="row" items="${rs.rows}">
    User ${row.user_name}<br/>
    Pwd ${row.user_pass}<br/>
</c:forEach>

	<h2>TESTDB PAGE</h2>
	<h3>Session : <%=request.getSession().getId() %></h3>
	<a href="/spring-mvc/index.jsp?logoff=yes"><button class="button">Log Off</button></a>
  </body>
</html>