package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Formation {
    private String nom;
    private ArrayList<Etudiant> lesEtudiants;
    private ArrayList<Enseignement> lesEnseignements;

    public Formation(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Etudiant> getLesEtudiants() {
        return lesEtudiants;
    }

    public void setLesEtudiants(ArrayList<Etudiant> lesEtudiants) {
        this.lesEtudiants = lesEtudiants;
    }

    public ArrayList<Enseignement> getLesEnseignements() {
        return lesEnseignements;
    }

    public void setLesEnseignements(ArrayList<Enseignement> lesEnseignements) {
        this.lesEnseignements = lesEnseignements;
    }
    public void ajouterEtudiant(Etudiant etu) {
        //if (lesEtudiant == null){
        //lesEtudiants = new ArrayList<>();
        //}
        //lesEtudiants.add(etu);
    }
    public ArrayList<Etudiant> lesAdmis()
    {
        return lesEtudiants;
    }
    public void trierLesEtudiants(){
        //ArrayList<Etudiant> lesEtudiants = getLesEtudiants();

    }

    public static double calculerMoyenneGeneral(){
        //ArrayList<Etudiant> lesEtudiants = getLesEtudiants();
        double expresult = 0;
        return expresult;

    }

}