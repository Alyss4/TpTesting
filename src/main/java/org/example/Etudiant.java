package org.example;

public class Etudiant extends Personne {
    private String code;
    private Formation laFormationSuivie;

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
}
