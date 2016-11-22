<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	

  </head>
  
  <body>
 <h1><center><font color="RED" >User Registration </font></center></h1>
       
        <form method="POST" action="${pageContext.request.contextPath}/UserRegServlet">

            <table border="0" align="center">
                <tbody>
                
                    <tr>
                        <td>User Name :</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email : </td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Sign Up" /></td>
                    </tr>
                </tbody>
            </table>
        </form>
  </body>
</html>
