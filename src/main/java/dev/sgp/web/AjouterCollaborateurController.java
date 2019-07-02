package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjouterCollaborateurController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("dateCreation", LocalDate.now());
        req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        
        String lastName = req.getParameter("last-name");
        String firstName = req.getParameter("first-name");
        LocalDate birthDate = LocalDate.parse(req.getParameter("birth-date"));
        String address = req.getParameter("address");
        String socialNumber = req.getParameter("socialNumber");
    }
}
