package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String matricule;
    private String titre;
    private String nom;
    private String prenom;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String matricule = req.getParameter("matricule");

        resp.setContentType("text/html");

        if (matricule == null) {
            resp.setStatus(400);
            resp.getWriter().write("<p>Un matricule est attednu</p>");
        }else
            resp.setStatus(200);
            resp.getWriter().write("<h1>Edition de collaborateurs</h1> <br />" + "Matricule : " + matricule);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        matricule = req.getParameter("matricule");
        titre = req.getParameter("titre");
        nom = req.getParameter("nom");
        prenom = req.getParameter("prenom");

        if (matricule != null || matricule.equals("")
                || titre != null || titre.equals("")
                || nom != null || nom.equals("")
                || prenom != null || prenom.equals("")) {
            resp.setStatus(201);
            resp.getWriter().write("<p>matricule = " + matricule + ", titre = " + titre + ", nom = " + nom
                    + ", prénom = " + prenom + "</p>");
        } else {
            resp.setStatus(400);
            resp.getWriter().write("<p>Les paramètres suivants sont incorrects : </p>");

            if (matricule == null || "".equals(matricule)) {
                resp.getWriter().write("<li>matricule</li>");
            } else if (titre != null || "".equals(titre)) {
                resp.getWriter().write("<li>titre</li>");
            } else if (nom == null || "".equals(nom)) {
                resp.getWriter().write("<li>nom</li>");
            } else if (prenom == null || "".equals(prenom)) {
                resp.getWriter().write("<li>prenom</li>");
            }
        }

    }

}
