package dev.sgp.entite;

public class VisiteWeb {

	private int id = 0;
	private String chemin;
	private long tempsExecution;

	public VisiteWeb(String chemin, long time) {
		this.id = id++;
		this.chemin = chemin;
		this.tempsExecution = time;
	}

	public VisiteWeb() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public long getTempsExecution() {
		return tempsExecution;
	}

	public void setTempsExecution(int tempsExecution) {
		this.tempsExecution = tempsExecution;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VisiteWeb [id=");
		builder.append(id);
		builder.append(", chemin=");
		builder.append(chemin);
		builder.append(", tempsExecution=");
		builder.append(tempsExecution);
		builder.append("]");
		return builder.toString();
	}

}
