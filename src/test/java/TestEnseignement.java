import org.example.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestEnseignement {
    @Test
    public void testAjoutEvaluation(){
        //Instancier un Enseignement
        Enseignement enseignement = new Enseignement(false,new Matiere("Mathématiques"),new Prof("Donde","linger","status"),new Formation("BTS1"));
        //Creer une Evaluation
        Evaluation evalUn = new Evaluation(10,1,new Etudiant("Mael","Lambert","01"), new Matiere("Mathematiques"));
        Evaluation evalDeux = new Evaluation(10,1,new Etudiant("Luckas","Jacquement","01"), new Matiere("Mathematiques"));
        //Appeler methode ajouterEvaluation
        enseignement.ajouterEvaluation(evalUn);
        enseignement.ajouterEvaluation(evalDeux);
        //Recuperer Arraylist enseignement
        ArrayList<Evaluation> EvaluationAjouter = enseignement.getLesEvaluations();
        //Verifier que evaluation ajouter à enseignement
        assertEquals(2,EvaluationAjouter);
    }
}
