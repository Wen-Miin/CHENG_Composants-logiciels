package com.example.exam.model;

import java.util.Date;


public class Actor {
    public String nom, prenom;
    public Date dateNaissance;
    public Movie filmographie;

    public Actor(String nom, String prenom, Date dateNaissance, Movie filmographie) {
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

    public Movie getFilmographie() {
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
