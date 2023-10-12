package org.example;

import java.util.ArrayList;

public class Prof extends Personne {
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
