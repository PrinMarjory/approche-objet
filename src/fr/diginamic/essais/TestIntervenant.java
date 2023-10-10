package fr.diginamic.essais;
import fr.diginamic.salaire.*;

/**
 * Test des classes et sous-classe de Intervenant
 * @author Marjory PRIN
 */
public class TestIntervenant {

	public static void main(String[] args) {
		
		//Initialisation
		Salarie s1 = new Salarie("Dupont", "Thomas", 2300.00);
		Pigiste p1 = new Pigiste("Laforêt", "Céline", 13, 95.5);
		
		//Affichage des données
		s1.afficherDonnees();
		p1.afficherDonnees();
	}

}
