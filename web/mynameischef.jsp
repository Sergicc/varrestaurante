<%-- 
    Document   : chef
    Created on : 26-abr-2017, 18:25:24
    Author     : usu26
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
        <form action="LoginChef" method="POST" class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="mail" name="mailChef">
            <input class="form-control mr-sm-2" type="password" placeholder="pass" name="pass">
            <button name="loginChef" value="entrarChef" class="btn btn-outline-success my-2 my-sm-0" type="submit">Acceder</button>
        </form>
        <form action="NewChef.jsp" method="POST">

            <button value="Registro" class="btn btn-outline-success my-2 my-sm-0" type="submit">Registrate</button>

        </form>
    </body>
</html>
