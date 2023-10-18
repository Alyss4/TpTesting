import org.example.Matiere;
import org.example.Prof;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMatière {
    @Test
    public void testAjoutProfHabilite(){
        Matiere uneMatiere = new Matiere("Mathématiques");
        //Prof unProf = new Prof("Don","delinger","SIO1");
        uneMatiere.ajouterProfHabilite(new Prof("Don","linger","sio1"));
        assertEquals(1, uneMatiere.getLesProfsHabilites().size());
    }
}
