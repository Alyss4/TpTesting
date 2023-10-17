package org.example;

import java.util.ArrayList;

public class Etudiant extends Personne {
    private String code;
    private Formation laFormationSuivie;

    private ArrayList<Evaluation> evaluation = new ArrayList<>();


    public Etudiant(String nom, String prenom, String code) {
        super(nom,prenom);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Formation getLaFormationSuivie() {
        return laFormationSuivie;
    }

    public void setLaFormationSuivie(Formation laFormationSuivie) {
        this.laFormationSuivie = laFormationSuivie;
    }
    public ArrayList<Evaluation> getEvaluation() {
        return evaluation;
    }

    public double calculMoyenneEtudiant() {
        if (evaluation.isEmpty()) {
            return 0.0;
        }
        double totalNote = 0.0;
        int totalCoeff = 0;
        for (Evaluation eval : evaluation) {
            totalNote += eval.getLaNote() * eval.getLeCoeff();
            totalCoeff += eval.getLeCoeff();
        }
        if (totalCoeff == 0) {
            return 0.0;
        }
        return totalNote / totalCoeff;
    }

}

