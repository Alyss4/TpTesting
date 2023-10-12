package org.example;

import java.util.ArrayList;

public class Enseignement {
    private boolean facultatif;
    private Matiere laMatiere;
    private Prof leProf;
    private ArrayList<Etudiant> lesEtudiants;
    private Formation laFormation;
    private ArrayList<Evaluation> lesEvaluations = new ArrayList<Evaluation>();

    public Enseignement(boolean facultatif, Matiere laMatiere, Prof leProf, Formation laFormation) {
        this.facultatif = facultatif;
        this.laMatiere = laMatiere;
        this.leProf = leProf;
        this.laFormation = laFormation;
    }

    public void Enseignement() {
    }

    public boolean getFacultatif() {
        return facultatif;
    }

    public void setFacultatif(boolean facultatif) {
        this.facultatif = facultatif;
    }

    public ArrayList<Etudiant> getLesEtudiants() {
        return lesEtudiants;
    }

    public void setLesEtudiants(ArrayList<Etudiant> lesEtudiants) {
        this.lesEtudiants = lesEtudiants;
    }
    public ArrayList<Evaluation> getLesEvaluations(){ return lesEvaluations; }

    public void setLesEvaluations(ArrayList<Evaluation> lesEvaluations) {
        this.lesEvaluations = lesEvaluations;
    }

    public Matiere getLaMatiere() {
        return laMatiere;
    }

    public void setLaMatiere(Matiere laMatiere) {
        this.laMatiere = laMatiere;
    }

    public Prof getLeProf() {
        return leProf;
    }

    public void setLeProf(Prof leProf) {
        this.leProf = leProf;
    }

    public Formation getLaFormation() {
        return laFormation;
    }

    public void setLaFormation(Formation laFormation) {
        this.laFormation = laFormation;
    }

    public void ajouterEvaluation(Evaluation eval){
        lesEvaluations.add(eval);

    }
}