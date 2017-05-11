<%-- 
    Document   : AllCategorias
    Created on : 09-may-2017, 20:07:38
    Author     : 46422520X
--%>

<%@page import="java.util.List"%>
<%@page import="entities.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categorias</title>
    </head>
    <body>
        <h1>Categorias</h1>
        <table>
            <tr>
                <th>IdCategoria</th>
                <th>Nombre</th>             
            </tr>
        <% 
        List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
        for (Categoria categoria : categorias) {
            %>
            <tr>
                
                <td><%= categoria.getIdCategoria() %></td> 
                <td><%= categoria.getNombre() %></td> 
            </tr>
        <% }
        %>
        </table>
    </body>
</html>