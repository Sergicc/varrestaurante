<%-- 
    Document   : NewUsuario
    Created on : 26-abr-2017, 17:46:35
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

        <form action="NewUsuarioChef" method="POST">
            <p>Mail: <input type="text" name="mail"></p>
            <p>Nombre: <input type="text" name="nombre"></p>
        </p>
        <p>Apellidos: <input type="text" name="apellidos"></p>
        <p>Contraseña: <input type="text" name="password"></p>
        <p>Repite Contraseña: <input type="text" name="repitePassword"></p>


        <input type="submit" name="altaChef" value="Registro Chef">
    </form>

</body>
</html>
