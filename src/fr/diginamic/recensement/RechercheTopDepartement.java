package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import fr.diginamic.utils.Format;

/**
 * Représente la recherche des 10 départements les plus peuplées
 * @author Marjory PRIN
 */
public class RechercheTopDepartement extends MenuService {
	
	/**
	 * Traite la demande de recherche et affiche le résultat
	 * @param recensement : le recensement avec sa liste de ville
	 * @param scanner : non utilisé pour cette méthode
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Constitution d'une Hashmap avec en clé les codes de département et en valeur la population totale
		HashMap<String, Integer> comptage = new HashMap<>();
		for (Ville v: recensement.getListVilles()) {
			Integer compteur = comptage.getOrDefault(v.getCodeDepartement(), 0);
			compteur += v.getPopulation();
			comptage.put(v.getCodeDepartement(), compteur);
		}
		
		// Création d'une liste de département
		ArrayList<Departement> listeDep = new ArrayList<>();
		for (Entry<String, Integer> m: comptage.entrySet()) {
			listeDep.add(new Departement(m.getKey(), m.getValue()));
		}
		
		// Tri de la liste de région
		Collections.sort(listeDep, new ComparatorPopulationDepartement());
		
		// Affichage des 10 régions les plus peuplées
		System.out.println("\n/////////////////////////////////////////\n");
		System.out.println("Les 10 départements les plus peuplées sont :");
		System.out.println("-----------------------------------------");
		for (int i = 0; i<10; i++) {
			System.out.println((i+1) + " - " + listeDep.get(i));
		}
		
	}

}
