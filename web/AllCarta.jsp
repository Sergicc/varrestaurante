<%-- 
    Document   : AllCarta
    Created on : 12-may-2017, 17:27:16
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
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/js.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="snip1537">
            <h1>var</h1>
            <h6>Restaurant</h6><br/>
            <h5>Est. 1992</h5><br/><i class="ion-star"></i>
        </div>
        <ul class="snip1555">
            <li class="current"><a href="index.jsp" data-hover="Inicio">Inicio</a></li>
            <li><a href="#" data-hover="Menus">Menús</a></li>
            <li><a href="AllCarta.jsp" data-hover="Carta">Carta</a></li>
            <li><a href="#" data-hover="¿Quienes somos?">¿Quienes somos?</a></li>
            <li>
                <form action="Login" method="POST" class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="text" placeholder="mail" name="mail">
                    <input class="form-control mr-sm-2" type="password" placeholder="pass" name="pass">
                    <button name="login" value="entrar" class="btn btn-outline-success my-2 my-sm-0" type="submit">Acceder</button>
                </form>
            </li>
            <li>
                <form action="NewUsuario.jsp" method="POST">
                    <div align="right">
                        <button value="Registro" class="btn btn-outline-success my-2 my-sm-0" type="submit">Registrate</button>
                    </div>
                </form>
            </li>
        </ul>
        <div class="container">
            
        </div>
    </body>
</html>
