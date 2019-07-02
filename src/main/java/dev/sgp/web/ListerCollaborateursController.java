package dev.sgp.web;

import java.io.IOException;
import util.Constante;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {
 
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.setAttribute("listeCollaborateurs", Constante.COLLAB_SERVICE.listerCollaborateurs());
        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);

     
        
    }
}
