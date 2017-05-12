/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.varrestaurante;
import entities.PlatoIngredientes;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usu26
 */
public class NewPlatoIngredientes extends HttpServlet {

    @EJB
    varrestaurante miEjb;

    public static final String STATUS_OK = "Ingrediente asignado correctamente";
    public static final String STATUS_ERROR = "error";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if ("Asignar ingrediente al plato".equals(request.getParameter("asignar"))) {

                int plato = parseInt(request.getParameter("platos"));
                int ingrediente = parseInt(request.getParameter("ingredientes"));

//                Integer gramos = null;
//                Integer mililitros = null;
//                if (request.getParameterMap().containsKey("gramos")) {
//                    gramos = parseInt(request.getParameter("gramos"));
//                }
//                if (request.getParameterMap().containsKey("mililitros")) {
//                    mililitros = parseInt(request.getParameter("mililitros"));
//                }
                
                PlatoIngredientes pi = new PlatoIngredientes(plato, ingrediente);
                
//                pi.setGramos(gramos);
//                pi.setMililitros(mililitros);

                if (miEjb.insertPlatoIngredientes(pi)) {
                    request.setAttribute("resultado", STATUS_OK);
                } else {
                    request.setAttribute("resultado", STATUS_ERROR);
                }
                request.getRequestDispatcher("/indexChef.jsp").forward(request, response);
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
