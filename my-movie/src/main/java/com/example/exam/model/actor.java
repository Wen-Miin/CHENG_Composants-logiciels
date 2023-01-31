package com.example.exam.model;

import java.util.Date;
import java.util.List;

public class actor {
    public String nom, prenom;
    public Date dateNaissance;
    public String filmographie;

    public actor(String nom, String prenom, Date dateNaissance, String filmographie) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filmographie = filmographie;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getFilmographie() {
        return filmographie;
    }

    @Override
    public String toString() {
        return "actor{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", filmographie='" + filmographie + '\'' +
                '}';
    }
}
