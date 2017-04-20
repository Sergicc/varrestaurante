/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.varrestaurante;
import entities.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewUsuario extends HttpServlet {

    @EJB
    varrestaurante miEjb;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewUsuario</title>");
            out.println("</head>");
            out.println("<body>");

// Recogemos los datos del formulario
            if ("NewUsuario".equals(request.getParameter("alta"))) {
                String mail = request.getParameter("mail");
                String nombre = request.getParameter("nombre");

                String apellidos = request.getParameter("apellidos");
                String password = request.getParameter("password");
                boolean rol = false;

                Usuarios u = new Usuarios(mail, nombre, apellidos, password, rol);

                if (miEjb.insertUsuario(u)) {
                    out.println("Pokémon dado de alta.");
                } else {
                    out.println("Ya existe un Usuario con ese nombre.");
                }
                out.println("<p><a href=\"index.html\">Volver al menú principal</a></p>");
            } else {
                out.println("<form method=\"POST\">\n"
                        + "            <p>Mail: <input type=\"text\" name=\"mail\"></p>\n"
                        + "            <p>Nombre: <input type=\"text\" name=\"nombre\"></p>\n"
                        + "            </p>\n"
                        + "            <p>Apellidos: <input type=\"number\" name=\"apellidos\"></p>\n"
                        + "            <p>Contraseña: <input type=\"number\" name=\"password\"></p>\n"
                        + "            <p>Repite Contraseña: <input type=\"number\" name=\"repitePassword\"></p>\n"
                       );

                out.println(" <input type=\"submit\" name=\"alta\" value=\"Registro\">      \n"
                        + "        </form>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
