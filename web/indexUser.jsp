<%-- 
    Document   : index
    Created on : 26-abr-2017, 17:45:17
    Author     : usu26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-reboot.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/js.js" type="text/javascript"></script>
    </head>
    <!--http://bootsnipp.com/snippets/featured/navbar-lateral-slide-menu-->
    <body>
        <div class="snip1537">
            <h1>var</h1>
            <h6>Restaurant</h6><br/>
            <h5>Est. 1992</h5><br/><i class="ion-star"></i>
        </div>
        <ul class="snip1555">
            <li class="current"><a href="indexUser.jsp" data-hover="Inicio">Inicio</a></li>
            <li><a href="#" data-hover="Menus">Menús</a></li>
            <li><a href="AllCarta.jsp" data-hover="Carta">Carta</a></li>
            <li><a href="#" data-hover="¿Quienes somos?">¿Quienes somos?</a></li>


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
            <% }%>

        </ul>


        <%
            String registro = (String) request.getAttribute("resultado");
            if (registro != null) {
        %>
        <div class="alert alert-warning alert-dismissible fade show" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">×</span>
            </button>
            <strong><%= registro%></strong>
            <% }%>
        </div>

        <form action="NewReserva.jsp" method="POST">
            <div align="right">
                <input type="submit" value="Haz tu reserva">
            </div>
        </form> 
    </div>

</body>
</html>
