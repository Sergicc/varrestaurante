<%-- 
    Document   : indexChef
    Created on : 10-may-2017, 16:29:01
    Author     : 53868459K
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-reboot.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/js.js" type="text/javascript"></script>
    </head>
    <body>
        
        <h1>Hello! </h1> <%
            String loginChef = (String) session.getAttribute("mailChef");
            if (loginChef != null) {
        %>
        <%= loginChef%>
        <% }%>
        
    </body>
</html>
