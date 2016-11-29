<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form action="/success" method="post">
<div align="center">
		<table>
				<tr>
					<td>Id</td>
					<td><input type="text" name="Id" /></td>
				</tr>
				
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="Firstname">
				</tr>
				
				<tr>
					<td>lastName</td>
					<td><input type="text" name="Lastname"></td>
				</tr>
					
				<tr>
					<td>Email</td>
					<td><input type="text" name="Email"></td>
				</tr>
				
				<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
				</tr>
		</table>
	</div>
</form>
</body>
</html>
				