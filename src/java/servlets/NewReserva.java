/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entities.Reservas;
import entities.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Calendar;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.xml.bind.DatatypeConverter.parseDate;

/**
 *
 * @author usu26
 */
public class NewReserva extends HttpServlet {
 @EJB
    beans.varrestaurante miEjb;

    public static final String STATUS_OK = "Reserva realizada con éxito. ";
    public static final String STATUS_ERROR = "error";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       if ("Alta Reserva".equals(request.getParameter("altaReserva"))) {
            Integer idReserva = 0;
            String mail = (String) request.getSession().getAttribute("mail");

//            Usuarios u = miEjb.existUsuarioByMailString(mail);

            Calendar fechaCal = parseDate(request.getParameter("fecha"));
            Date fecha = fechaCal.getTime();

            boolean turno = false;
            String turnostr = request.getParameter("turno");
            if (turnostr.equals("0")) {
                turno = false;
            }
            if (turnostr.equals("1")) {
                turno = true;
            }

            Integer comensales = parseInt(request.getParameter("comensales"));
            String comentario = request.getParameter("comentario");
            
            Usuarios u = new Usuarios(mail);
            
            Reservas r = new Reservas(idReserva, u, fecha, turno, comensales, comentario);

            if (miEjb.insertReserva(r)) {
                request.setAttribute("resultado", STATUS_OK);
            } else {
                request.setAttribute("resultado", STATUS_ERROR);
            }
            request.getRequestDispatcher("/indexUser.jsp").forward(request, response);
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
