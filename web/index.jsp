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
        <!--       <div class="container">
                    <div class="row">
                        <nav class="navbar fixed-top navbar-toggleable-md navbar-light bg-faded">
                            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <a class="navbar-brand" href="#">varRestaurante</a>
        
        
                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav mr-auto">
                                    <li class="nav-item active">
                                        <a class="nav-link" href="index.jsp">Home<span class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">Menús</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">Carta</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">¿Quienes somos?</a>
                                         proba pilla fotos de chefs y cambiar les cares per les nostres caras hermosas y preciosas
                                    </li>
                                </ul>
                                <form class="form-inline my-2 my-lg-0">
                                    <input class="form-control mr-sm-2" type="text" placeholder="Search">
                                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                                </form>
                                <form action="Login" method="POST" class="form-inline my-2 my-lg-0">
                                    <input class="form-control mr-sm-2" type="text" placeholder="mail" name="mail">
                                    <input class="form-control mr-sm-2" type="password" placeholder="pass" name="pass">
                                    <button name="login" value="entrar" class="btn btn-outline-success my-2 my-sm-0" type="submit">Acceder</button>
                                </form>
        
                            </div>
                        </nav>  
                    </div>
                </div>-->
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
        <div class="container">
            <figure class="snip1369 green">
                <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample15.jpg" alt="pr-sample15" />
                <div class="image"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample15.jpg" alt="pr-sample15" /></div>
                <figcaption>
                    <h3>Jason Response</h3>
                    <p>I suppose if we couldn't laugh at things that don't make sense, we couldn't react to a lot of life.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="#"></a>
            </figure>
            <figure class="snip1369 blue"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample18.jpg" alt="pr-sample18" />
                <div class="image"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample18.jpg" alt="pr-sample18" /></div>
                <figcaption>
                    <h3>Carnegie Mondover</h3>
                    <p>You know what we need, Hobbes? We need an attitude. Yeah, you can't be cool if you don't have an attitude.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="#"></a>
            </figure>
            <figure class="snip1369 orange"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" />
                <div class="image"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" /></div>
                <figcaption>
                    <h3>Quiche Hollandaise</h3>
                    <p>The only skills I have patience to learn are those that have no real application in life.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="#"></a>
            </figure>
            <figure class="snip1369 orange"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" />
                <div class="image"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" /></div>
                <figcaption>
                    <h3>Quiche Hollandaise</h3>
                    <p>The only skills I have patience to learn are those that have no real application in life.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="#"></a>
            </figure>
            <figure class="snip1369 orange"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" />
                <div class="image"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" /></div>
                <figcaption>
                    <h3>Quiche Hollandaise</h3>
                    <p>The only skills I have patience to learn are those that have no real application in life.</p>
                </figcaption><span class="read-more">

                   Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="#"></a>
            </figure>
            <figure class="snip1369 orange"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" />
                <div class="image"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/331810/pr-sample16.jpg" alt="pr-sample16" /></div>
                <figcaption>
                    <h3>Quiche Hollandaise</h3>
                    <p>The only skills I have patience to learn are those that have no real application in life.</p>
                </figcaption><span class="read-more">

                    Ver más <i class="ion-android-arrow-forward"></i></span>
                <a href="#"></a>
            </figure>
        </div>
    </div>
</body>
</html>