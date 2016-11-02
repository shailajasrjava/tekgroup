import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex1 extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
			{
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection obj=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shailaja");
			Statement stmt=obj.createStatement();
			stmt.executeUpdate("create table table2(id number(10),name varchar(20))");
			out.println("table is created");
			obj.close();
		}
		catch(Exception e)	
		{
			out.println(e);
			
		}
		
		
	}
	}
