<html>

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

.button2 {
	background-color: #008CBA;
} /* Blue */
.button3 {
	background-color: #f44336;
} /* Red */
.button4 {
	background-color: #e7e7e7;
	color: black;
} /* Gray */
.button5 {
	background-color: #555555;
} /* Black */
</style>
</head>
<body>
	<%
	  if (request.getParameter("logoff") != null) {
	    session.invalidate();
	    response.sendRedirect("index.jsp");
	    return;
	  }
	%>

	<h2>INDEX PAGE</h2>
	<h3>Session : <%=request.getSession().getId() %></h3>


	<a href="jsps/admin/admin.jsp"><button class="button">Admin</button></a>
	<a href="jsps/employee/emp.jsp"><button class="button button2">Employee</button></a>
	<a href="jsps/manager/manager.jsp"><button class="button button3">Manager</button></a>
	<a href="jsps/partner/partner.jsp"><button class="button button4">Partner</button></a>
	<a href="jsps/student/stud.jsp"><button class="button button5">Student</button></a>
	<a href="page/admin"><button class="button button3">Page Admin</button></a>
	<a href="page/stud"><button class="button button3">Page Stud</button></a>
	<a href="page/emp"><button class="button button3">Page Emp</button></a>
	<a href="jsps/test/sample.jsp"><button class="button button4">Sample</button></a>
	<a href="jsps/test/test.jsp"><button class="button button4">Test</button></a>
	
	<a href="jsps/client/client.jsp"><button class="button button2">Client</button></a>
	<a href="jsps/staff/staff.jsp"><button class="button button2">Staff</button></a>
	<a href="jsps/protected/protected.jsp"><button class="button button2">Protected</button></a>
	<a href="jsps/protected/protected.xhtml"><button class="button button2">Protected HTML</button></a>
	
</html>
