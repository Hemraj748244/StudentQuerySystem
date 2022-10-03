<%-- 
    Document   : signout
    Created on : 30 Apr, 2017, 10:22:40 AM
    Author     : sameer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          </head>
    
    <body>
        
       <%
           session.removeAttribute("name");
           session.removeAttribute("email");
           response.sendRedirect("index.html");
           %>
    </body>
</html>
