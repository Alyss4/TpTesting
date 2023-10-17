
import org.example.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestFormation {
    @Test
    public void testAjoutEtudiant(){
        //J'instancie formation
        Formation formation = new Formation("TestAjoutEtudiant");
        //Creer un etudiant
        Etudiant etudiantUn = new Etudiant("Luckas","Jacquemot","01");
        //Inserer l'etudiant avec la méthode
        formation.ajouterEtudiant(etudiantUn);
       // Verifier que etudiantUn ajouter a la liste
        assertEquals(1, formation.getLesEtudiants().size());
    }
    @Test
    public void testCalculerMoyenneGenerale(){
        //Instancier Formation
        Formation formation = new Formation("TestCalculMoyenne");
        // Instancier enseignement
        //Enseignement enseignement = new Enseignement(facultatif, laMatiere, leProf, laFormation);
        Enseignement enseignement =  new Enseignement(false, new Matiere("Mathématiques"),new Prof("Donde","linger","status"),new Formation("BTS1"));
        //Créer 1 etudiant pour ses éval
        Etudiant etudiantUn = new Etudiant("Mael","Lambert","02");

        //Creer matière
        Matiere matiereUn = new Matiere("Maths");
        Matiere matiereDeux = new Matiere("Philo");

        //Creer des evaluations, notes et coeff
        double laNote1 = 5.0;
        int coefficient1 = 1;
        double laNote2 = 5.0;
        int coefficient2 = 1;
        Evaluation evalUn = new Evaluation(laNote1,coefficient1,etudiantUn, matiereUn);
        Evaluation evalDeux = new Evaluation(laNote2,coefficient2,etudiantUn,matiereDeux);

        //Ajouter étudiant à formation
        formation.ajouterEtudiant(etudiantUn);
        // Ajouter les éval dans l'étudiant
        enseignement.ajouterEvaluation(evalUn);
        enseignement.ajouterEvaluation(evalDeux);
        // Appeler la méthode de calcul de la moyenne générale
        double moyenneTotal = formation.calculMoyenneGeneral();
        // Calculer la moyenne attendue
        double moyenneAttendue = (laNote1*coefficient1 + laNote2*coefficient2) / (coefficient1 + coefficient2);
        assertEquals(moyenneAttendue,moyenneTotal, 0.01);

    }
    @Test
    public void testTriEtudiants(){
        //Instancier une Formation
        Formation formation = new Formation("TestTriEtudiant");
        //Creer plusieurs etudiants
        Etudiant etudiantUn = new Etudiant("Paul","Louis","01");
        Etudiant etudiantDeux = new Etudiant("Jean","Paul","02");
        //Ajouter etudiant à formation
        formation.ajouterEtudiant(etudiantUn);
        formation.ajouterEtudiant(etudiantDeux);
        //Appeler methode Tri

        //Recuperer Arraylist des Etudiants trié
        ArrayList<Etudiant> lesEtudiantsTrie = formation.trierLesEtudiants("critère");
        //Verifier que les etudiants sont trie
        assertEquals("critère",lesEtudiantsTrie);

    }
    @Test
    public void testLesAdmis(){
        //Instancier une Formation
        Formation formation = new Formation ("testLesAdmis");
        //Creer plusieurs etudiants
        Etudiant etudiantUn = new Etudiant("Paul","Louis","01");
        Etudiant etudiantDeux = new Etudiant("Jean","Paul","02");
        //Ajouter etudiant à formation
        formation.ajouterEtudiant(etudiantUn);
        formation.ajouterEtudiant(etudiantDeux);
        // Ajouter eval
        Evaluation evalUn = new Evaluation(12, 1,etudiantUn, new Matiere("Mathématiques"));
        Evaluation evalDeux = new Evaluation(8, 1,etudiantUn, new Matiere("Mathématiques"));
        etudiantUn.getEvaluation().add(evalUn);
        etudiantDeux.getEvaluation().add(evalDeux);
        //Appeler methode les Admis//Recuperer ArrayList des Etudiants admis
        ArrayList<Etudiant> etudiantAdmis = formation.lesAdmis();
        // Verifier que les etudiants sont admis
        assertEquals(1,etudiantAdmis.size());
    }
}
