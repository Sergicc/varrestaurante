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
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/js.js" type="text/javascript"></script>
    </head>
    <!--http://bootsnipp.com/snippets/featured/navbar-lateral-slide-menu-->
    <body>
        <div class="container">
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
                                <!-- proba pilla fotos de chefs y cambiar les cares per les nostres caras hermosas y preciosas-->
                            </li>
                        </ul>
                        <!--<form class="form-inline my-2 my-lg-0">
                            <input class="form-control mr-sm-2" type="text" placeholder="Search">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                        </form>-->
                        <!--proba sergi 2-->
                        <form action="Login" method="POST" class="form-inline my-2 my-lg-0">
                            <input class="form-control mr-sm-2" type="text" placeholder="mail" name="mail">
                            <input class="form-control mr-sm-2" type="text" placeholder="pass" name="pass">
                            <button name="login" value="entrar" class="btn btn-outline-success my-2 my-sm-0" type="submit">Acceder</button>
                        </form>

                    </div>
                </nav>  
            </div>
            <br/><br/><br/>
            <form action="NewUsuario.jsp" method="POST">
                <div align="right">
                    <input type="submit" value="Registro">
                </div>
            </form>
            <%
                String registro = (String) request.getAttribute("resultado");
                if (registro != null) {
            %>
            <h1><%= registro%></h1>
            <% } %>

            <%
                String login = (String) request.getAttribute("mail");
                if (login != null) {
            %>
            <h1><%= login%></h1>
            <% }%>
        </div>

    </body>
</html>
