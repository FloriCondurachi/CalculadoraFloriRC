/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import es.albarregas.beans.calculador;
import es.albarregas.exceptions.DivisionPorCeroException;
import es.albarregas.models.Divisor;
import es.albarregas.models.Multiplicador;
import es.albarregas.models.Restador;
import es.albarregas.models.Sumador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Flori
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

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
        request.getRequestDispatcher("JSP/error.jsp");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
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
        boolean error = false;
        String url;
        calculador calculador=new calculador();
        processRequest(request, response);
        try{
            int operando1=Integer.parseInt(request.getParameter("operando1"));
            int operando2=Integer.parseInt(request.getParameter("operando2"));
            String operacion=request.getParameter("operacion");
            
            error=true;
            switch(operacion){
                case "sumar":
                    Sumador sumador=new Sumador();
                    calculador.setResultado(sumador.sumar(operando1,operando2));
                    break;
                case "restar":
                    Restador restador=new Restador();
                    calculador.setResultado(restador.restar(operando1,operando2));
                    break;
                case "dividir":
                    Divisor divisor=new Divisor();
                    calculador.setResultado(divisor.dividir(operando1,operando2));
                    break;
                case "multiplicar":
                    Multiplicador multiplicador=new Multiplicador();
                    calculador.setResultado(multiplicador.multiplicar(operando1,operando2));
                    break;
            }
        } catch (DivisionPorCeroException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(error==true){
            request.setAttribute("ERROR", "Se está intentando dividir por 0.");
        url="JSP/errpr.jsp";
        }
        
    }catch(NumberFormatException e) {
    request.setAttribute("error","Alguno de los números no es válido");
    String url="JSP/errpr.jsp";
    }
   
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
