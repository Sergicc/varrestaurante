/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.varrestaurante;
import entities.Usuarios;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class NewUsuarioChef extends HttpServlet {

    @EJB
    varrestaurante miEjb;

    public static final String STATUS_OK = "USUARIO REGITRADO K FIPAS";
    public static final String STATUS_ERROR = "error";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        if ("Registro Chef".equals(request.getParameter("altaChef"))) {
            String mail = request.getParameter("mail");
            String nombre = request.getParameter("nombre");

            String apellidos = request.getParameter("apellidos");
            String password = request.getParameter("password");
            boolean rol = true;

            Usuarios u = new Usuarios(mail, nombre, apellidos, password, rol);

            if (miEjb.insertUsuario(u)) {
               request.setAttribute("resultado", STATUS_OK);
            } else {
                request.setAttribute("resultado", STATUS_ERROR);
            }
             request.getRequestDispatcher("/mynameischef.jsp").forward(request, response);
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
