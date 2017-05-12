<%-- 
    Document   : NewPlatoIngredientes
    Created on : 12-may-2017, 20:17:54
    Author     : usu26
--%>

<%@page import="java.util.List"%>
<%@page import="entities.Ingredientes"%>
<%@page import="entities.Platos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignar ingredientes a platos</title>
    </head>
    <body>
        <form action="NewPlatoIngredientes" method="POST">

            <p>Plato: <select name="platos">
                    <%
                        List<Platos> plato = (List<Platos>) request.getAttribute("platos");
                        for (Platos p : plato) {
                    %>

                    <option value="<%= p.getIdPlato()%>"><%= p.getNombre() %></option>

                    <% }
                    %>
                </select>
                
            <p>Ingrediente: <select name="ingredientes">
                    <%
                        List<Ingredientes> ingrediente = (List<Ingredientes>) request.getAttribute("ingredientes");
                        for (Ingredientes i : ingrediente) {
                    %>

                    <option value="<%= i.getIdIngrediente()%>"><%= i.getNombre() %></option>

                    <% }
                    %>
                </select>

        <!--    <p>Gramos: <input type="text" name="gramos"></p>
            <p>Mililitros: <input type="text" name="mililitros"></p>-->

            <input type="submit" name="asignar" value="Asignar ingrediente al plato">

        </form>

    </body>
</html>
