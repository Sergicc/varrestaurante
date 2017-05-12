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
     <div class="container">

            <figure class="snip1369 green">
                <img src="media/pizzapepperoni_100108178.jpg" alt="pr-sample15" />
                <div class="image"><img src="media/pizzapepperoni_100108178.jpg" alt="pr-sample15" /></div>
                <figcaption>
                    <h3>Pizzas italianas</h3>
                    <p>Hemos introducido una nueva variedad de pizzas hechas al estilo italiano con las que podrás viajar solo con su sabor.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="AllCarta.jsp"></a>
            </figure>

            <figure class="snip1369 blue"><img src="media/10500581_857235250999847_3707550043305373492_n-e1427418362648.jpg" alt="pr-sample18" />
                <div class="image"><img src="media/10500581_857235250999847_3707550043305373492_n-e1427418362648.jpg" alt="pr-sample18" /></div>
                <figcaption>
                    <h3>Conoce nuestro nuevo Chef</h3>
                    <p>Os presentamos a nuestro nuevo chef Whisky. Tiene un estilo de cocina alto standing.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="AllCarta.jsp"></a>
            </figure>

            <figure class="snip1369 orange"><img src="media/0cb4c30e96d171a40e06ca00e3dae559.jpg" alt="pr-sample16" />
                <div class="image"><img src="media/0cb4c30e96d171a40e06ca00e3dae559.jpg" alt="pr-sample16" /></div>
                <figcaption>
                    <h3>Menus exóticos</h3>
                    <p>Nos complace enunciar nuestros nuevos menús de rincones de mundos desconocidos.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="AllCarta.jsp"></a>
            </figure>

            <figure class="snip1369 orange"><img src="media/1296774001_850215_0000000000_sumario_normal.jpg" alt="pr-sample16" />
                <div class="image"><img src="media/1296774001_850215_0000000000_sumario_normal.jpg" alt="pr-sample16" /></div>
                <figcaption>
                    <h3>Sistema de reserva</h3>
                    <p>Se ha introducido un nuevo sistema de reserva online para nuestros clientes que quieran ahorrar tiempo.</p>
                </figcaption><span class="read-more">

                    Registrate <i class="ion-android-arrow-forward"></i></span>
                <a href="NewUsuario.jsp"></a>
            </figure>

            <figure class="snip1369 orange"><img src="media/asdsaasd.jpg" alt="pr-sample16" />
                <div class="image"><img src="media/asdsaasd.jpg" alt="pr-sample16" /></div>
                <figcaption>
                    <h3>Quiche Hollandaise</h3>
                    <p>Nueva Quiche Holandesa con tres quesos diferentes para excitar tu paladar.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="AllCarta.jsp"></a>
            </figure>

            <figure class="snip1369 orange"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" />
                <div class="image"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" /></div>
                <figcaption>
                    <h3>Quiche Hollandaise</h3>
                    <p>The only skills I have patience to learn are those that have no real application in life.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="AllCarta.jsp"></a>
            </figure>

        </div>

</body>
</html>
