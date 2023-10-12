
import org.example.Enseignement;
import org.example.Etudiant;
import org.example.Evaluation;
import org.example.Formation;
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
        // la liste d’étudiant et faire une assertion sur sa taille == 1
        ArrayList<Etudiant> lesEtudiants = formation.getLesEtudiants();
        assertEquals(1, lesEtudiants.size());
        //Vérifier avec une assertion que l’objet récupéré en position 1 de la collection est le même que celui ajouté avec la méthode
        Etudiant etudiantRecupere = lesEtudiants.get(0);
        assertEquals(etudiantUn, etudiantRecupere);
        // test deuxieme etudiant
        Etudiant etudiantDeux = new Etudiant("Dupont","Mael","02");
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
        Enseignement enseignementUn = new Enseignement(false, "Mathématique","ElProfessor","BTS");
        //Creer plusieurs etudiant
        Etudiant etudiantUn = new Etudiant("Mael","Feur","02");
        //Ajouter Etudiant à enseignement
        enseignementUn.getLesEtudiants().add(etudiantUn);
        //Ajouter les enseignements à la formation
        formation.getLesEnseignements().add(enseignementUn);
        //Creer des evaluations
        Evaluation evalUn = new Evaluation(10,1,Etudiant)
        //Ajouter evaluation a enseignement
        enseignementUn.ajouterEvaluation(evalUn);
        // Appeler méthode pour calcul moyenne G
        double moyenneGenerale = Formation.calculerMoyenneGeneral();
        //Verifier resultat AssertEquals
        assertEquals();
    }
    @Test
    public void testTriEtudiants(){
        //Instancier une Formation
        //Creer plusieurs etudiants
        //Ajouter etudiant à formation
        //Appeler methode Tri
        //Recuperer Arraylist des Etudiants trié
        //Verifier que les etudiants sont trie

    }
    @Test
    public void testLesAdmis(){
        //Instancier une Formation
        //Creer plusieurs etudiants
        //Ajouter etudiant à formation
        //Appeler methode les Admis
        //Recuperer ArrayList des Etudiants admis
        // Verifier que les etudiants sont admis
    }
}
