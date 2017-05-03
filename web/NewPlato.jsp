<%-- 
    Document   : NewCarta
    Created on : 03-may-2017, 17:50:35
    Author     : 46422520x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Plato</title>
    </head>
    <body>

        <form action="NewPlato" method="POST">

            <p>Nombre: <input type="text" name="nombre"></p>
            <p>Precio: <input type="number" name="precio"></p>
            <p>Categoria: <select name="categoria">
                    <option value="1">Mediterraneo</option> 
                    <option value="2">Americano</option> 
                    <option value="3">Asiatico</option>
                    <option value="4">Oriente Medio</option> 
                </select>
            <p>Tipo: <select name="tipo">
                    <option value="1">Primer plato</option> 
                    <option value="2">Segundo plato</option> 
                    <option value="3">Postres</option>                 
                </select>


                <input type="submit" name="alta" value="AltaPlato">
        </form>

    </body>
</html>
