package filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.jdbc.*;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("MyServlet is invoked");

		out.println("<br>welcome to servlet<br>");
		JdbcTest test = new JdbcTest();
		out.println("<br>Authority<br>");

		try {
			List<String> list = test.testJndiJDBC();
			for (String str : list) {
				out.println(str);
				out.println("<br>");
			}
			out.println("<br>");
			out.println("<br>Tomcat_realms<br>");
			list = test.testJDBC();
			for (String str : list) {
				out.println(str);
				out.println("<br>");
			}
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}