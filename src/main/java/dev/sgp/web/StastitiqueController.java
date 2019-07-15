package dev.sgp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Stats;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constante;

public class StastitiqueController extends HttpServlet{

	 private VisiteWebService visiteWebService = Constante.VISITE_WEB_SERVICE;
	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	        List<Stats> mesStats  = Stats.getStats(visiteWebService.listerVisiteWeb());
	        req.setAttribute("stats",mesStats);
	        req.getRequestDispatcher("/WEB-INF/views/collab/statistiques.jsp")
	                .forward(req, resp);
	    }
    
}
