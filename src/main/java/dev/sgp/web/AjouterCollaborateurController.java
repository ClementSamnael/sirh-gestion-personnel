package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constante;

public class AjouterCollaborateurController extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private CollaborateurService collabService = Constante.COLLAB_SERVICE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("inputNom");
        String prenom = req.getParameter("inputPrenom");
        String dateNaiss = req.getParameter("inputDate");
        String adresse = req.getParameter("inputAdresse");
        String secuSocial = req.getParameter("inputSecu");
        List<String> erreur = new ArrayList<String>();

        if ((nom == null || nom.equals("")) || (prenom == null || prenom.equals("")) || (dateNaiss == null
                || dateNaiss.equals("")) || (adresse == null || adresse.equals(""))) {

            if ((secuSocial == null
                    || secuSocial.equals("")) && secuSocial.length() == 15) {
                LocalDate dateNaissanceP = LocalDate.parse(dateNaiss, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                LocalDateTime dateAjout = LocalDateTime.now();
                String matricule = "M".concat(String.valueOf(Collaborateur.nbCollab));
                String emailPro = prenom + "." + nom + "@societe.com";

                Collaborateur c = new Collaborateur(matricule, nom, prenom, dateNaissanceP, adresse, secuSocial,
                        emailPro, "armorknight.jpg", dateAjout.atZone(ZoneId.of("Europe/Paris")), true);

                collabService.sauvegarderCollaborateur(c);
                collabService.listerCollaborateurs();

                resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");

            } else {
                resp.setStatus(400);
                erreur.add("inputSecu");
                req.setAttribute("Erreurs", erreur);
                req.setAttribute("inputNom", nom);
                req.setAttribute("inputPrenom", prenom);
                req.setAttribute("inputDate", dateNaiss);
                req.setAttribute("inputAdresse", adresse);
                req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);
            }

        } else {
            resp.setStatus(400);
            if (nom == null || nom.equals("")) {
                erreur.add("inputNom");
            } else {
                req.setAttribute("inputNom", nom);
            }
            if (prenom == null || prenom.equals("")) {
                erreur.add("inputPrenom");
            } else {
                req.setAttribute("inputPrenom", prenom);
            }
            if (dateNaiss == null || dateNaiss.equals("")) {
                erreur.add("inputDate");
            } else {
                req.setAttribute("inputDate", dateNaiss);
            }
            if (adresse == null || adresse.equals("")) {
                erreur.add("inputAdresse");
            } else {
                req.setAttribute("inputAdresse", adresse);
            }
            if (secuSocial == null || secuSocial.equals("")) {
                erreur.add("inputSecu");
            } else if (secuSocial.length() == 15) {
                req.setAttribute("inputSecu", secuSocial);
            } else {
                erreur.add("inputSecu");
            }
            req.setAttribute("Erreurs", erreur);
            req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);
        }
    }
}
