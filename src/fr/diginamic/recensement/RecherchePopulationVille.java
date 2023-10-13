package fr.diginamic.recensement;
import java.util.Scanner;

/**
 * Représente la recherche de la population totale d'une ville demandée par l'utilisateur
 * @author Marjory PRIN
 */
public class RecherchePopulationVille extends MenuService {
	
	/**
	 * Traite la demande de recherche et affiche le résultat
	 * @param recensement : le recensement avec sa liste de ville
	 * @param scanner : la ville à rechercher demandée par l'utilisateur
	 */
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		boolean isVilleTrouvee = false;
		System.out.println("Boucle de recherche");
		String villeRecherchee = scanner.next();
		for (Ville v: recensement.getListVilles()) {
			if (v.getNomCommune().equalsIgnoreCase(villeRecherchee)) {
				System.out.println(v);
				isVilleTrouvee = true;
			} 
		}
		if (isVilleTrouvee == false) {
			System.out.println("La ville demandée n'existe pas !");
		}
	}

}
