package com.kavya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		public void doGet(HttpServletResponse res,HttpServletRequest req) 
		throws ServletException,IOException {
			
			ClientDAOImp cd = new ClientDAOImp();
			Class<? extends ClientDAOImp> cl = cd.getClass();
			req.setAttribute("cts", cl);
			req.getRequestDispatcher("result.jsp").forward(req, res);
		}
}
