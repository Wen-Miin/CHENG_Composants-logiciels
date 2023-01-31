package com.example.exam.model;

import java.util.Date;

public class Movie {
    public String titre, realisateur;
    public Actor acteurPrincipal;
    public String dateSortie;

    public Movie(){

    }

    public Movie(String titre, String realisateur, Actor acteurPrincipal, String dateSortie) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurPrincipal = acteurPrincipal;
        this.dateSortie = dateSortie;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Actor getActeurPrincipal() {
        return acteurPrincipal;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setActeurPrincipal(Actor acteurPrincipal) {
        this.acteurPrincipal = acteurPrincipal;
    }

    @Override
    public String toString() {
        return "movie{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", acteurPrincipal='" + acteurPrincipal + '\'' +
                ", dateSortie=" + dateSortie +
                '}';
    }
}
