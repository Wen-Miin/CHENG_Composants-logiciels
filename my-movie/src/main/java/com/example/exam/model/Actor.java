package com.example.exam.model;

import java.util.Date;
import java.util.List;


public class Actor {
    public String nom, prenom, dateNaissance;
    public List<Movie> filmographie;

    public Actor(){

    }

    public Actor(String nom, String prenom, String dateNaissance, List<Movie> filmographie) {
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public List<Movie> getFilmographie() {
        return filmographie;
    }

    public void setFilmographie(List<Movie> filmographie) {
        this.filmographie = filmographie;
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
