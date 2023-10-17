import org.example.Enseignement;
import org.example.Formation;
import org.example.Matiere;
import org.example.Prof;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestProf {
    @Test
    public void testAjoutEnseignement(){
        //Instancier un Prof
        Prof unProfesseur = new Prof("Don","delinger","sio");
        //Instancier Enseignement
        Enseignement unEnseignement = new Enseignement(true,new Matiere("Francais"),unProfesseur,new Formation("Philosophe"));
        //Appeler méthode ajouter enseignement sur le prof créer
        unProfesseur.ajouterEnseignements(unEnseignement);
        //Vérifier que enseignement est ajouté à professeur
        assertEquals(1, unProfesseur.getLesEnseignements().size());


    }
}
