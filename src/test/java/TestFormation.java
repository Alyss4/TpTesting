
import org.example.Etudiant;
import org.example.Formation;
import org.junit.Test;
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
        Formation formation = new Formation("TestTriEtudiant");
        // Creation de mes etudiant
        Etudiant etudiantUn = new Etudiant("Luckas","Jacquemot","01");
        Etudiant etudiantDeux = new Etudiant("Paul","Jacques","02");
        Etudiant etudiantTrois = new Etudiant("Pierre","Bredouille","03");
        //Ajouter étudiant à formation
        formation.ajouterEtudiant(etudiantUn);
        //Créer des évaluations différentes notes
        //Ajouter evaluation a formation
        //Appeler méthode pour calculer moyenne generale



    }
}
