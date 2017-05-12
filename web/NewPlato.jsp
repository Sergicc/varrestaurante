<%-- 
    Document   : NewCarta
    Created on : 03-may-2017, 17:50:35
    Author     : 46422520x
--%>

<%@page import="java.util.List"%>
<%@page import="entities.Categoria"%>
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
            
             <p>Categoria: <select name="categorias">
            <% 
        List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
        for (Categoria categoria : categorias) {
            %>
            
            <option value="<%= categoria.getIdCategoria() %>"><%= categoria.getNombre() %></option>

        <% }
        %>
        </select>
        
            <p>Tipo: <select name="tipo">
                    <option value="1">Primer plato</option> 
                    <option value="2">Segundo plato</option> 
                    <option value="3">Postres</option>                 
                </select>


                <input type="submit" name="alta" value="Nuevo Plato">
        </form>

    </body>
</html>
