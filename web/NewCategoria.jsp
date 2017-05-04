<%-- 
    Document   : NewCategoria
    Created on : 04-may-2017, 21:32:33
    Author     : usu26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AltaCategoria" method="POST">
            <p>Nombre de la categoría: <input type="text" name="nombre"></p>

            <input type="submit" name="altaCategoria" value="Crea la categoría">
        </form>
    </body>
</html>
