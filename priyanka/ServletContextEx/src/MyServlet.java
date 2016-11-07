import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n1=request.getParameter("Name");
		String n2=request.getParameter("Pass");
		out.println(n1);
		out.println(n2);
		ServletContext obj=getServletContext();
		String n3=obj.getInitParameter("Name");
		String n4=obj.getInitParameter("Pass");
		out.println(n3);
		out.println(n4);
		/*String pass=obj.getInitParameter("Pass");
		out.println(pass);*/
		
		
		
	}

}
