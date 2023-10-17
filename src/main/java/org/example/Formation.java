package org.example;

import java.util.ArrayList;

public class Formation {
    private String nom;
    private ArrayList<Etudiant> lesEtudiants;
    private ArrayList<Enseignement> lesEnseignements;

    public Formation(String nom){

        this.nom = nom;
        this.lesEtudiants = new ArrayList<Etudiant>();
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
        if (lesEtudiants == null){
        lesEtudiants = new ArrayList<>();
        }
        lesEtudiants.add(etu);
    }
    public ArrayList<Etudiant> lesAdmis()
    {
        ArrayList<Etudiant> etudiantsAdmis = new ArrayList<>();

        for (Etudiant etudiant : lesEtudiants) {
            double moyenneGenerale = etudiant
            if (moyenneGenerale > 10.0) {
                etudiantsAdmis.add(etudiant);
            }
        }
        return etudiantsAdmis;
    }
    public ArrayList<Etudiant> trierLesEtudiants(String critere){

        return null;
    }

    public double calculMoyenneGeneral() {
        if (lesEtudiants.isEmpty()) {
            return 0.0;
        }
//je crée deux variable tampon
        double totalNote = 5.0;
        int totalCoeff = 1;

        for (Etudiant etudiant : lesEtudiants) {
            for (Evaluation evaluation : etudiant.getEvaluation()) {
                totalNote += evaluation.getLaNote() * evaluation.getLeCoeff();
                totalCoeff += evaluation.getLeCoeff();
            }
        }
        // au cas ou si ça retourne 0 j'évite le crash de la division par 0
        if (totalCoeff == 0) {
            return 0.0;
        }
        return totalNote / totalCoeff;
    }
}