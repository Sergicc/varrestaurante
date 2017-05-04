/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entities.Ingredientes;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AltaIngrediente", urlPatterns = {"/AltaIngrediente"})
public class NewIngrediente extends HttpServlet {

    @EJB
    beans.varrestaurante miEjb;

    public static final String STATUS_OK = "Ingrediente introducido con éxito";
    public static final String STATUS_ERROR = "error";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        if ("Registra el ingrediente".equals(request.getParameter("altaIngrediente"))) {
            Integer idIngrediente = 0;
            String nombre = request.getParameter("nombre");
            boolean solidoLiquido = false;
            String sl = request.getParameter("sl");
            if (sl.equals("0")) {
                solidoLiquido = false;
            }
            if (sl.equals("1")) {
                solidoLiquido = true;
            }

            double precio_kg_l = parseDouble(request.getParameter("precioKgL"));

            Ingredientes i = new Ingredientes(idIngrediente, nombre, solidoLiquido, precio_kg_l);

            if (miEjb.insertIngrediente(i)) {
                request.setAttribute("resultado", STATUS_OK);
            } else {
                request.setAttribute("resultado", STATUS_ERROR);
            }
            request.getRequestDispatcher("/index.jsp").forward(request, response);
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
