package fr.diginamic.recensement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * Représente la recherche des 10 villes les plus peuplées d'un département demandé par l'utilisateur
 * @author Marjory PRIN
 */
public class RechercheTopVillesDepartement extends MenuService {
	
	/**
	 * Traite la demande de recherche et affiche le résultat
	 * @param recensement : le recensement avec sa liste de ville
	 * @param scanner : le code du département à rechercher demandée par l'utilisateur
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création de la liste des villes du département recherché
		ArrayList<Ville> listeVille = new ArrayList<>();
		System.out.println("\n/////////////////////////////////////////\n");
		System.out.println("Saisir ci-dessous le code du département recherché :");
		String depRecherche = scanner.next();
		for (Ville v: recensement.getListVilles()) {
			if (v.getCodeDepartement().equalsIgnoreCase(depRecherche)) {
				listeVille.add(v);
			}
		}
		if (listeVille.size()>0) {
			// Tri par ordre de population
			Collections.sort(listeVille, new ComparatorPopulationVille());
			
			// Affichage des 10 villes les plus peuplées du département
			System.out.println("\nLes 10 villes les plus peuplées du département " + depRecherche + " sont :");
			System.out.println("-----------------------------------------");
			for (int i = 0; i<10; i++) {
				System.out.println((i+1) + " - " + listeVille.get(i));
			}
			
		} else {
			System.out.println("\nLe département demandé n'existe pas !");
		}

		
	}

}
