package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constante;

public class ListerCollaborateursController extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private CollaborateurService collabService = Constante.COLLAB_SERVICE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        collabService.listerCollaborateurs();
        
        req.setAttribute("listeCollaborateurs", collabService.listerCollaborateurs());
        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
    }
}
