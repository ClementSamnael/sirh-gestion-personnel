package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

    public static int nbCollab = 0;
    private String matricule;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresse;
    private String secuSocial;
    private String email;
    private String photo;
    private ZonedDateTime dateCreation;
    private boolean actif = true;

    public Collaborateur(String matricule, String nom, String prenom, LocalDate dateNaissance, String adresse,
            String secuSocial, String email, String photo, ZonedDateTime dateCreation, boolean actif) {
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

    public void setDateNaissance(LocalDate dateNaiss) {
        this.dateNaissance = dateNaiss;
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

    public ZonedDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(ZonedDateTime zonedDateTime) {
        this.dateCreation = zonedDateTime;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public ZonedDateTime getCreationDateTime() {
        return dateCreation;
    }

    public void setCreationDateTime(ZonedDateTime dateCreation) {
        this.dateCreation = dateCreation;
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
