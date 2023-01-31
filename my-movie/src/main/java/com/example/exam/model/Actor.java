package com.example.exam.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;


public class Actor {
    @ApiModelProperty(notes = "Nom de l'acteur",name = "nom", required = true, value = "test nom")
    private String nom;

    @ApiModelProperty(notes = "Prénom de l'acteur",name = "prenom", required = true, value = "test prenom")

    private String prenom;

    @ApiModelProperty(notes = "Date de naissance de l'acteur",name = "dateDeNaissance", required = true, value = "test date de naissance")
    private String dateNaissance;

    @ApiModelProperty(notes = "Listes des films",name = "listeFilms", required = true, value = "test listes films")
    private Movie filmographie;

    public Actor(){

    }

    public Actor(String nom, String prenom, String dateNaissance, Movie filmographie) {
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

    public Movie getFilmographie() {
        return filmographie;
    }

    public void setFilmographie(Movie filmographie) {
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
