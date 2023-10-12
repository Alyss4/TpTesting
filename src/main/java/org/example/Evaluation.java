package org.example;

public class Evaluation {
    private double laNote;
    private int leCoeff;
    private Etudiant lEtudiant;
    private Matiere laMatiere;

    private Evaluation(double laNote, int leCoeff, Etudiant lEtudiant, Matiere laMatiere){
        this.laNote = laNote;
        this.leCoeff = leCoeff;
        this.lEtudiant = lEtudiant;
        this.laMatiere = laMatiere;
    }

    public double getLaNote() {
        return laNote;
    }

    public void setLaNote(double laNote) {
        this.laNote = laNote;
    }

    public int getLeCoeff() {
        return leCoeff;
    }

    public void setLeCoeff(int leCoeff) {
        this.leCoeff = leCoeff;
    }

    public Etudiant getlEtudiant() {
        return lEtudiant;
    }

    public void setlEtudiant(Etudiant lEtudiant) {
        this.lEtudiant = lEtudiant;
    }

    public Matiere getLaMatiere() {
        return laMatiere;
    }

    public void setLaMatiere(Matiere laMatiere) {
        this.laMatiere = laMatiere;
    }
}