package entite;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Collaborateur {

    private String matricule;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresse;
    private String secuSocial;
    private String email;
    private String photo;
    private LocalDateTime dateCreation;
    private boolean actif = true;

    public Collaborateur(String matricule, String nom, String prenom, LocalDate dateNaissance, String adresse,
            String secuSocial, String email, String photo, LocalDateTime dateCreation, boolean actif) {
        super();
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.secuSocial = secuSocial;
        this.email = email;
        this.photo = photo;
        this.dateCreation = dateCreation;
        this.actif = actif;
    }

    public Collaborateur() {
        super();
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSecuSocial() {
        return secuSocial;
    }

    public void setSecuSocial(String secuSocial) {
        this.secuSocial = secuSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Collaborateur [matricule=");
        builder.append(matricule);
        builder.append(", nom=");
        builder.append(nom);
        builder.append(", prenom=");
        builder.append(prenom);
        builder.append(", dateNaissance=");
        builder.append(dateNaissance);
        builder.append(", adresse=");
        builder.append(adresse);
        builder.append(", secuSocial=");
        builder.append(secuSocial);
        builder.append(", email=");
        builder.append(email);
        builder.append(", photo=");
        builder.append(photo);
        builder.append(", dateCreation=");
        builder.append(dateCreation);
        builder.append(", actif=");
        builder.append(actif);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (actif ? 1231 : 1237);
        result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
        result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
        result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((matricule == null) ? 0 : matricule.hashCode());
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((photo == null) ? 0 : photo.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        result = prime * result + ((secuSocial == null) ? 0 : secuSocial.hashCode());
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
        Collaborateur other = (Collaborateur) obj;
        if (actif != other.actif)
            return false;
        if (adresse == null) {
            if (other.adresse != null)
                return false;
        } else if (!adresse.equals(other.adresse))
            return false;
        if (dateCreation == null) {
            if (other.dateCreation != null)
                return false;
        } else if (!dateCreation.equals(other.dateCreation))
            return false;
        if (dateNaissance == null) {
            if (other.dateNaissance != null)
                return false;
        } else if (!dateNaissance.equals(other.dateNaissance))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (matricule == null) {
            if (other.matricule != null)
                return false;
        } else if (!matricule.equals(other.matricule))
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (photo == null) {
            if (other.photo != null)
                return false;
        } else if (!photo.equals(other.photo))
            return false;
        if (prenom == null) {
            if (other.prenom != null)
                return false;
        } else if (!prenom.equals(other.prenom))
            return false;
        if (secuSocial == null) {
            if (other.secuSocial != null)
                return false;
        } else if (!secuSocial.equals(other.secuSocial))
            return false;
        return true;
    }
    
    
    
}
