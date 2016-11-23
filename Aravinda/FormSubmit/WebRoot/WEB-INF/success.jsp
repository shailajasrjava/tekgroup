<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html">
        <title>welcome Page</title>
        <%String uname = (String) request.getParameter("uname");
                    if (uname == null) {
                        response.sendRedirect("index.jsp");
                    }
        %>
        user name :<%=uname%>|
    <a href="logout.jsp"> Logout </a>

    </head>
    <body>

        <h1>Hello World success !</h1>
    </body>
</html>
