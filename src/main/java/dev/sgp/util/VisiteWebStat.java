package dev.sgp.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dev.sgp.entite.VisiteWeb;

public class VisiteWebStat {

    private String chemin;
    private int nbVisite;
    private int min;
    private int max;
    private int moy;

    public VisiteWebStat() {
    }

    public VisiteWebStat(String chemin, int nbVisite, int min, int max, int moy) {
        this.chemin = chemin;
        this.nbVisite = nbVisite;
        this.min = min;
        this.max = max;
        this.moy = moy;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public int getNbVisite() {
        return nbVisite;
    }

    public void setNbVisite(int nbVisite) {
        this.nbVisite = nbVisite;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMoy() {
        return moy;
    }

    public void setMoy(int moy) {
        this.moy = moy;
    }

    public static List<VisiteWebStat> getStats(List<VisiteWeb> visites) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (VisiteWeb v : visites) {
            if (!map.containsKey(v.getChemin())) {
                map.put(v.getChemin(), new ArrayList<>());
            }
            map.get(v.getChemin()).add((int) v.getTempsExecution());
        }

        List<VisiteWebStat> liste = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> e : map.entrySet()) {
            IntSummaryStatistics stats = e.getValue().stream().mapToInt(i -> i).summaryStatistics();
            liste.add(new VisiteWebStat(e.getKey(), e.getValue().size(), stats.getMin(), stats.getMax(),
                    (int) stats.getAverage()));
        }
        liste = liste.stream().sorted(Comparator.comparing(VisiteWebStat::getChemin)).collect(Collectors.toList());

        return liste;
    }

}
