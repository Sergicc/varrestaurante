<%-- 
    Document   : AllMenu
    Created on : 12-may-2017, 18:59:26
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
    <div class="snip1537">
            <h1>var</h1>
            <h6>Restaurant</h6><br/>
            <h5>Est. 1992</h5><br/><i class="ion-star"></i>
        </div>
        <ul class="snip1555">
            <li class="current"><a href="index.jsp" data-hover="Inicio">Inicio</a></li>
            <li><a href="AllMenu.jsp" data-hover="Menus">Menús</a></li>
            <li><a href="AllCarta" data-hover="Carta">Carta</a></li>
            <li><a href="QuienesSomos.jsp" data-hover="¿Quienes somos?">¿Quienes somos?</a></li>
                <%
                    String login = (String) session.getAttribute("mail");
                    if (login != null) {
                %>
            <div class="logued">
                Hola, 
                <b>
                    <%= login%>
                </b>
            </div>
            <div class="cerrar">
                <form action="CerrarSesion" method="POST" class="form-inline my-2 my-lg-0">
                    <button name="cerrar" value="salir" class="btn btn-outline-success my-2 my-sm-0" type="submit">Cerrar Sesión</button>
                </form>
            </div>
            <% } else { %>
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
            <% } %>

        </ul>
</html>
