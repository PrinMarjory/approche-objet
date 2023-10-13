package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.utils.Format;

/**
 * Représente la recherche de la population totale d'une région demandée par l'utilisateur
 * @author Marjory PRIN
 */
public class RecherchePopulationRegion extends MenuService {
	
	/**
	 * Traite la demande de recherche et affiche le résultat
	 * @param recensement : le recensement avec sa liste de ville
	 * @param scanner : le nom de la région à rechercher demandée par l'utilisateur
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Création de la liste des villes de la région recherchée
		ArrayList<Ville> listeVille = new ArrayList<>();
		System.out.println("\n/////////////////////////////////////////\n");
		System.out.println("Saisir ci-dessous le nom du département recherché :");
		String regRecherche = scanner.next();
		
		for (Ville v: recensement.getListVilles()) {
			if (v.getNomRegion().equalsIgnoreCase(regRecherche)) {
				listeVille.add(v);
			}
		}
		if (listeVille.size()>0) {
			int populationTotale = 0;
			for (Ville v: listeVille) {
				populationTotale += v.getPopulation();
			}
			System.out.println("\nPopulation totale de la région " + regRecherche + " : " + Format.bigInt(populationTotale) + " hab.");
		} else {
			System.out.println("\nLe région demandée n'existe pas !\n");
		}
		
	}

}
