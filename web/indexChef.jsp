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
        
         <%
                    String registro = (String) request.getAttribute("resultadoChef");
                    if (registro != null) {
                %>
                <div class="alert alert-warning alert-dismissible fade show" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
                <strong><%= registro%></strong>
                <% }%>
            </div>
            
            
            
        
        <form action="NewCategoria" method="POST">
            <p>Nombre de la categoría: <input type="text" name="nombre"></p>

            <input type="submit" name="altaCategoria" value="Nueva Categoria">
        </form>
        
    </body>
</html>
