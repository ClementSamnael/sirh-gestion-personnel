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
}
