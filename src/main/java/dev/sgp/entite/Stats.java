package dev.sgp.entite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class Stats {

	private String url;
	private int nbVisite;
	private long min;
	private long max;
	private long moyenne;

	public Stats(String url, int nbVisite, long min, long max, long moyenne) {
		this.url = url;
		this.nbVisite = nbVisite;
		this.min = min;
		this.max = max;
		this.moyenne = moyenne;
	}

	public static List<Stats> getStats(List<VisiteWeb> visite) {
		Map<String, List<Long>> visites = new HashMap<String, List<Long>>();

		visite.stream().forEach(v -> {
			if (!visites.containsKey(v.getChemin())) {
				visites.put(v.getChemin(), new ArrayList<Long>());
			}
			visites.get(v.getChemin()).add((long) v.getTempsExecution());
		});

		List<Stats> liste = new ArrayList<>();
		for (Map.Entry<String, List<Long>> vs : visites.entrySet()) {
			LongSummaryStatistics stats = vs.getValue().stream().mapToLong(i -> i).summaryStatistics();
			liste.add(new Stats(vs.getKey(), vs.getValue().size(), stats.getMin(), stats.getMax(),
					(long) stats.getAverage()));
		}

		liste = liste.stream().sorted(Comparator.comparing(Stats::getUrl)).collect(Collectors.toList());
		return liste;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNbVisite() {
		return nbVisite;
	}

	public void setNbVisite(int nbVisite) {
		this.nbVisite = nbVisite;
	}

	public long getMin() {
		return min;
	}

	public void setMin(long min) {
		this.min = min;
	}

	public long getMax() {
		return max;
	}

	public void setMax(long max) {
		this.max = max;
	}

	public long getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(long moyenne) {
		this.moyenne = moyenne;
	}

	@Override
	public String toString() {
		return "Stats [url=" + url + ", nbVisite=" + nbVisite + ", min=" + min + ", max=" + max + ", moyenne=" + moyenne
				+ "]";
	}

}
