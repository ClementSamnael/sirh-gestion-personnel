package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import entite.Collaborateur;
import service.CollaborateurService;
import util.Constante;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {
 
    
    // recuperation du service
    private CollaborateurService collabService = Constante.COLLAB_SERVICE;
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().write("Hello Lister Collaborateurs Controller");

//        // recupere la valeur d'un parametre dont le nom est avecPhoto
//        String avecPhotoParam = req.getParameter("avecPhoto");
//
//        // recupere la valeur d'un parametre dont le nom est departement
//        String departementParam = req.getParameter("departement");
//        resp.setContentType("text/html");
//
//        // code HTML ecrit dans le corps de la reponse
//        resp.getWriter().write("<h1>Liste des collaborateurs</h1>" + "<ul>" + "<li>avecPhoto=" + avecPhotoParam
//                + "</li>" + "<li>departement=" + departementParam + "</li>" + "</ul>");

        req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues"));
        req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);

     // utilisation du service
        List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
        
    }
}
