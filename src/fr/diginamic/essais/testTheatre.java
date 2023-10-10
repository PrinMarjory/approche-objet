package fr.diginamic.essais;
import fr.diginamic.entites.Theatre;

/**
 * Test de la classe Theatre
 * @author Marjory PRIN
 */
public class testTheatre {

	public static void main(String[] args) {
		
		//Initialisation
		Theatre th1 = new Theatre("Théatre 100 noms", 250);
		System.out.println(th1);
		System.out.println("------------------------------------------------\n");
		
		//Inscriptions
		th1.inscrire(25, 7.50);
		th1.inscrire(70, 5.50);
		th1.inscrire(50, 6);
		th1.inscrire(65, 8.25);
		th1.inscrire(50, 10);
		System.out.println("------------------------------------------------\n");
		
		//Affichage final
		System.out.println(th1);
	}

}
