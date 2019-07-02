package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entite.Collaborateur;
import util.Constante;

public class AjouterCollaborateurController extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("dateCreation", LocalDate.now());
        req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("inputNom");
        String prenom = req.getParameter("inputPrenom");
        String dateNaiss = req.getParameter("inputDate");
        String adresse = req.getParameter("inputAdresse");
        String secuSocial = req.getParameter("inputSecu");

        if (nom == null || "".equals(nom) || prenom == null || "".equals(prenom) || dateNaiss == null
                || "".equals(dateNaiss) || adresse == null || "".equals(adresse) || secuSocial == null
                || "".equals(secuSocial)) {

            resp.setStatus(400);
            req.getRequestDispatcher("/WEB-INF/views/collab/newCollab.jsp").forward(req, resp);
        } else {
            Collaborateur c = new Collaborateur();
            c.setNom(nom);
            c.setPrenom(prenom);
            c.setAdresse(adresse);
            c.setDateNaissance(dateNaiss);
            c.setDateCreation(ZonedDateTime.now());
            Constante.COLLAB_SERVICE.sauvegarderCollaborateur(c);

            resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");

        }

    }
}
