/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelpers.AddQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MVP;

/**
 *
 * @author mmmceniry
 */
@WebServlet(name = "AddSErvlet", urlPatterns = {"/addMVP"})
public class AddServlet extends HttpServlet {

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
            out.println("<title>Servlet AddSErvlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddSErvlet at " + request.getContextPath() + "</h1>");
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
       
        // Pass execution on to doPost
        doPost(request, response);
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
        
        //get the data
        String PLAYER_NAME = request.getParameter("PLAYER_NAME");
        String PLAYER_TEAM = request.getParameter("PLAYER_TEAM");
        String PLAYER_POSITION = request.getParameter("PLAYER_POSITION");
        int AGE_AT_MVP = Integer.parseInt(request.getParameter("AGE_AT_MVP"));
        
        //set up a mvp object
        MVP mvp = new MVP();
        mvp.setPLAYER_NAME(PLAYER_NAME);
        mvp.setPLAYER_TEAM(PLAYER_TEAM);
        mvp.setPLAYER_POSITION(PLAYER_POSITION);
        mvp.setAGE_AT_MVP(AGE_AT_MVP);
        
        //set up an add query object
        AddQuery aq = new AddQuery();
        
        //pass the mvp to addQuery to add to the database
        aq.doAdd(mvp);
        
        //pass execution control to the ReadServlet
        String url ="/read";
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward (request, response);
        
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
