<%-- 
    Document   : AltaIngrediente
    Created on : 03-may-2017, 17:37:11
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

        <form action="AltaIngrediente" method="POST">
            <p>Nombre: <input type="text" name="nombre"></p>

            <p>Sólido <input type="radio" name="sl" value=0 onclick="sol()"> 
                Líquido <input type="radio" name="sl" value=1 onclick="liq()"></p>



            <p>Precio por Kg / L: <input type="text" name="precioKgL"></p>

            
            <div id="soliq"></div>
            
            <script>
                function sol(){
                    var s = document.getElementById("soliq");
                        s.innerHTML="Cantidad Total Gramos <input type='text' name='gramosTotal'>";
                }
                function liq(){
                    var s = document.getElementById("soliq");
                        s.innerHTML="Cantidad Total Mililitros <input type='text' name='mililitrosTotal'>";
                }
            </script>

            <input type="submit" name="altaIngrediente" value="Registra el ingrediente">
        </form>

    </body>
</html>