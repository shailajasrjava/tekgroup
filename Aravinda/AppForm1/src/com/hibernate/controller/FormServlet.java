package com.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import com.hibernate.dao.Formuserdao;



public class FormServlet extends HttpServlet {
     
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
       
 
        try {
            Formuserdao userDAO = new Formuserdao();
            userDAO.addUserDetails(id,name,address);
            response.sendRedirect("Success");
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
    }


}
