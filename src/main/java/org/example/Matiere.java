package org.example;

import java.util.ArrayList;

public class Matiere {
    private String nom;
    private ArrayList<Prof> lesProfsHabilites;

    public Matiere(String nom){
        this.setNom(nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Prof> getLesProfsHabilites() {
        return lesProfsHabilites;
    }

    public void ajouterProfHabilite(Prof prof){
        if (lesProfsHabilites == null){
            lesProfsHabilites = new ArrayList<>();
        }
        lesProfsHabilites.add(prof);
    }
}
