package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.VisiteWeb;

public class VisiteWebService {

	List<VisiteWeb> visiteWebList = new ArrayList<>();

    public List<VisiteWeb> listerVisiteWeb(){ return this.visiteWebList ;}

    public void sauvegarderVisiteWeb(VisiteWeb visiteWeb) {
        visiteWebList.add(visiteWeb);
    }
}
