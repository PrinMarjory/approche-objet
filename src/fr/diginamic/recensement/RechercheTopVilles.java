package fr.diginamic.recensement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.utils.Format;

/**
 * Représente la recherche des 10 villes les plus peuplées de France
 * @author Marjory PRIN
 */
public class RechercheTopVilles extends MenuService {
	
	/**
	 * Traite la demande de recherche et affiche le résultat
	 * @param recensement : le recensement avec sa liste de ville
	 * @param scanner : non utilisé dans cette méthode
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
			// Tri par ordre de population
			Collections.sort(recensement.getListVilles(), new ComparatorPopulationVille());
			
			// Affichage des 10 villes les plus peuplées
			System.out.println("\n/////////////////////////////////////////\n");
			System.out.println("Les 10 villes les plus peuplées de France sont :");
			System.out.println("-----------------------------------------");
			for (int i = 0; i<10; i++) {
				System.out.println((i+1) + " - " + recensement.getListVilles().get(i));
			}
			
		}

}
