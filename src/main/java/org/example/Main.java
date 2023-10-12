package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Maj+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }

    public static class Enseignement {
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
            //lesEvaluations.add(eval);

        }
    }

    public static class Prof extends Personne {
        private String status;
        private ArrayList<Enseignement> lesEnseignements;

        public Prof(String nom, String prenom, String stat){
            super(nom,prenom);
            this.setStatus(stat);

        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public void ajouterEnseignements(Enseignement unEnseignement){


        }

    }
}