<%-- 
    Document   : NewReserva
    Created on : 11-may-2017, 21:38:50
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
        <form action="NewReserva" method="POST">

           <!-- <p>Correo electrónico: <input type="email" name="mail"></p>-->
            <p>Fecha <input type="date" name="fecha"></p>
            <p>Turno <select name="turno">
                    <option value="1">Mediodía</option> 
                    <option value="2">Noche</option> 
                </select>
            <p>Número de Personas <input type="number" name="comensales"></p>
            <i>Aviso: La reserva no se realizará si se excede el aforo máximo. </i>
            
            <!--Contar todos los comensales y mostrarlo (max:20) si supera max no debe dejar reservar-->
            
            <p>Algo que comentar (niños pequeños, alergias, intolerancias, etc): </p>
            <p><textarea name="comentario"></textarea></p>

            <input type="submit" name="altaReserva" value="Alta Reserva">
        </form>
    </body>
</html>
