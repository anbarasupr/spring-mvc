package com.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JdbcTest {
	public static void main(String args[]) throws NamingException, SQLException {
		JdbcTest test = new JdbcTest();
		test.testJndiJDBC();
	}

	public List<String> testJDBC() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomcat_realm", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT u.user_name,u.password,r.role_name FROM tomcat_users_roles r inner join tomcat_users u on r.user_name=u.user_name");
			List<String> list = new ArrayList<String>();
			while (rs.next()) {
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
				list.add(rs.getString(1) + " , " + rs.getString(2)+ " , " + rs.getString(3));
			}
			con.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<String> testJndiJDBC() throws NamingException, SQLException {
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/authority");
		Connection con = ds.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT u.user_name,u.user_pass,r.role_name FROM user_roles r inner join users u on r.user_name=u.user_name");
		List<String> list = new ArrayList<String>();
		while (rs.next()) {
			System.out.println(rs.getString(1) + "  " + rs.getString(2));
			list.add(rs.getString(1) + " , " + rs.getString(2)+ " , " + rs.getString(3));
		}
		con.close();
		return list;
	}
}
