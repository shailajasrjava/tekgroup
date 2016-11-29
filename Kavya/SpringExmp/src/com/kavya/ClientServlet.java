package com.kavya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ClientServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException,IOException {
		
		String id  = req.getParameter("Id");
		String Firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String Email = req.getParameter("Email");
        
        try {
        	ClientDAOImp cd = new ClientDAOImp();
        	cd.add("Id", "firstname", "lastname", "email");
        	res.sendRedirect("success");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
