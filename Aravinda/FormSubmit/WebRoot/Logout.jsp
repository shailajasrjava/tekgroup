<html>
    <head>

    </head>
    <body>
        <%
                    session.invalidate();
                    response.sendRedirect("index.jsp");
        %>
    </body>
</html>