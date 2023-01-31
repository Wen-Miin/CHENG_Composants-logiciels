package com.example.exam.model;

import java.util.Date;

public class movie {
    public String titre, realisateur, acteurPrincipal;
    public Date dateSortie;

    public movie(String titre, String realisateur, String acteurPrincipal, Date dateSortie) {
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

    public String getActeurPrincipal() {
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
