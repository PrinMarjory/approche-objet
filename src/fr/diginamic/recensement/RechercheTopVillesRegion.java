package fr.diginamic.recensement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fr.diginamic.utils.Format;

/**
 * Représente la recherche des 10 villes les plus peuplées d'une région demandée par l'utilisateur
 * @author Marjory PRIN
 */
public class RechercheTopVillesRegion extends MenuService {
	
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
		System.out.println("Saisir ci-dessous le nom de la région recherchée :");
		String regRecherche = scanner.next();
		for (Ville v: recensement.getListVilles()) {
			if (v.getNomRegion().equalsIgnoreCase(regRecherche)) {
				listeVille.add(v);
			}
		}
		if (listeVille.size()>0) {
			// Tri par ordre de population
			Collections.sort(listeVille, new ComparatorPopulationVille());
			
			// Affichage des 10 villes les plus peuplées de la région
			System.out.println("\nLes 10 villes les plus peuplées de la région " + regRecherche + " sont :");
			System.out.println("-----------------------------------------");
			for (int i = 0; i<10; i++) {
				System.out.println((i+1) + " - " + listeVille.get(i));
			}
			
		} else {
			System.out.println("\nLa région demandée n'existe pas !");
		}

		
	}

}
