package entite;

public class VisiteWeb {

    private int id;
    private String chemin;
    private int tempsExecution;

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

    public int getTempsExecution() {
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((chemin == null) ? 0 : chemin.hashCode());
        result = prime * result + id;
        result = prime * result + tempsExecution;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        VisiteWeb other = (VisiteWeb) obj;
        if (chemin == null) {
            if (other.chemin != null)
                return false;
        } else if (!chemin.equals(other.chemin))
            return false;
        if (id != other.id)
            return false;
        if (tempsExecution != other.tempsExecution)
            return false;
        return true;
    }

}
