/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 53868459K
 */
public class LoginChef extends HttpServlet {

    @EJB
    beans.varrestaurante miEjb;
    
    String emailChef, password, result;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("entrarChef".equals(request.getParameter("loginChef"))) {
            emailChef = request.getParameter("mailChef");
            password = request.getParameter("pass");

            // Verificamos si los datos son correctos con la bbdd
            if (miEjb.loginChef(emailChef, password)) {
                // Si lo son guardamos el user en variable de sesion
                request.getSession(true).setAttribute("mailChef", emailChef);
                response.sendRedirect(request.getContextPath() + "/indexChef.jsp");
            } else {
                request.setAttribute("resultado", "Usuario o contraseña incorrecta.");
                request.getRequestDispatcher("/mynameischef.jsp").forward(request, response);
            }

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
