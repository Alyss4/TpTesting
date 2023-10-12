
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
        // la liste d’étudiant et faire une verif taille == 1
        ArrayList<Etudiant> lesEtudiants = formation.getLesEtudiants();
        assertEquals(1, lesEtudiants.size());
        //Vérifier avec une assertion que l’objet récupéré en position 1 de la collection est le même que celui ajouté avec la méthode
        Etudiant etudiantRecupere = lesEtudiants.get(0);
        assertEquals(etudiantUn, etudiantRecupere);
        // test deuxieme etudiant
        Etudiant etudiantDeux = new Etudiant("Dupont","Mael","02");
        // Inserer deuxieme etudiant
        formation.ajouterEtudiant(etudiantDeux);
        // Recupere liste et taille == 2
        lesEtudiants = formation.getLesEtudiants();
        assertEquals(2,lesEtudiants.size());
        // Verifier que etudiant est dans la liste
        Etudiant etudiantRecupereDeux = lesEtudiants.get(1);
        assertEquals(etudiantDeux, etudiantRecupereDeux);
    }
    @Test
    public void testCalculerMoyenneGenerale(){
        //Instancier Formation
        Formation formation = new Formation("TestCalculMoyenne");
        //Creer plusieurs enseignements
        Enseignement enseignementUn = new Enseignement(false, new Matiere("Mathématiques"),new Prof("Donde","linger","status"),new Formation("BTS1"));
        Enseignement enseignementDeux = new Enseignement(false, new Matiere("Philo"),new Prof("Gau","Thier","status"),new Formation("BTS2"));
        //Creer plusieurs etudiant
        Etudiant etudiantUn = new Etudiant("Mael","Lambert","02");
        Etudiant etudiantDeux = new Etudiant("Ethan","Wiktor","02");
        //Creer matière
        Matiere matiereUn = new Matiere("Maths");
        Matiere matiereDeux = new Matiere("Philo");
        //Creer des evaluations
        Evaluation evalUn = new Evaluation(10,1,etudiantUn, matiereUn);
        Evaluation evalDeux = new Evaluation(10,1,etudiantDeux,matiereDeux);
        //Ajouter Etudiant à enseignement
        enseignementUn.getLesEtudiants().add(etudiantUn);
        enseignementDeux.getLesEtudiants().add(etudiantDeux);
        //Ajouter les enseignements à la formation
        formation.getLesEnseignements().add(enseignementUn);
        formation.getLesEnseignements().add(enseignementDeux);
        //Ajouter matière à enseignement
        enseignementUn.setLaMatiere(matiereUn);
        enseignementDeux.setLaMatiere(matiereDeux);
        //Ajouter evaluation a enseignement
        enseignementUn.ajouterEvaluation(evalUn);
        enseignementDeux.ajouterEvaluation(evalDeux);
        // Appeler méthode pour calcul moyenne G
        double moyenneGenerale = formation.calculerMoyenneGeneral();
        //Verifier resultat AssertEquals
        assertEquals(10,moyenneGenerale);
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
        ArrayList<Etudiant> lesEtudiantsTrie = formation.trierLesEtudiants("classement");
        //Verifier que les etudiants sont trie
        assertEquals("classement",lesEtudiantsTrie);

    }
    @Test
    public void testLesAdmis(){
        //Instancier une Formation
        Formation formation = new Formation ("testLesAdmis");
        //Creer plusieurs etudiants
        Etudiant etudiantUn = new Etudiant("Paul","Louis","01");
        Etudiant etudiantDeux = new Etudiant("Jean","Paul","02");
        //Ajouter etudiant à formation
        formation.getLesEtudiants().add(etudiantUn);
        formation.getLesEtudiants().add(etudiantDeux);
        //Appeler methode les Admis//Recuperer ArrayList des Etudiants admis
        ArrayList<Etudiant> etudiantAdmis = formation.lesAdmis();
        // Verifier que les etudiants sont admis
        assertEquals(2,etudiantAdmis);
    }
}
