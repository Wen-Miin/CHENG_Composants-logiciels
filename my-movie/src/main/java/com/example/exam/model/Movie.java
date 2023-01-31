package com.example.exam.model;

import java.util.Date;

public class Movie {
    public String titre, realisateur;
    public Actor acteurPrincipal;
    public Date dateSortie;

    public Movie(String titre, String realisateur, Actor acteurPrincipal, Date dateSortie) {
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

    public Date getDateSortie() {
        return dateSortie;
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
