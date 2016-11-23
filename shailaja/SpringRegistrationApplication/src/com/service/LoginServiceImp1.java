package com.service;
import com.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class LoginServiceImp1 implements LoginService
{
@Autowired
private LoginDAO loginDAO;
public void setLoginDAO(LoginDAO loginDAO)
{
	this.loginDAO=loginDAO;
}
	public boolean checkLogin(String name, String password)
	{
		System.out.println("In Service class..... Check Login");
		return loginDAO.checkLogin(name, password);
	}
}
