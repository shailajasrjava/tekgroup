import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserRegServlet extends HttpServlet {
 
    
   
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
           

            String uname = (String) request.getParameter("uname");
            String pass = (String) request.getParameter("pass");
            String email = (String) request.getParameter("email");
            UserRegManager insert = new UserRegManager();
            insert.userInsert(uname, pass, email);
            request.setAttribute("success", uname+", successfuly register");
            response.sendRedirect("index.jsp");
         
        } finally {
            out.close();
        }
    } 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";

}

}
