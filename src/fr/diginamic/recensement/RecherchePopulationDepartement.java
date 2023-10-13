package fr.diginamic.recensement;
import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.utils.Format;

/**
 * Représente la recherche de la population totale d'un département demandé par l'utilisateur
 * @author Marjory PRIN
 */
public class RecherchePopulationDepartement extends MenuService {
	
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
			int populationTotale = 0;
			for (Ville v: listeVille) {
				populationTotale += v.getPopulation();
			}
			System.out.println("\nPopulation totale du département " + depRecherche + " : " + Format.bigInt(populationTotale) + " hab.");
		} else {
			System.out.println("\nLe département demandé n'existe pas !\n");
		}

		
	}

}
