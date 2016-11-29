<%@ page language="java" import="java.util.*, com.kavya.*"contentType="text/html; charset=ISO-8859-1"%>
<%
List<Client> cl = (List<Client>)req.getAttribute("cts");
%>

<table border="1"/>
<th>Id</th>
<th>Firstname</th>
<th>Lastname</th>
<th>Email</th>
<% for(List t : cl) { %>
<tr>
<td><%=t.getId() %></td><td><%=t.getFirstname() %></td><td><%=t.getLastname() %></td><td><%=t.getEmail() %></td>
</tr>
<% } %>

</table>
</html>
