package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		
		// Initialisation
		Path path = Paths.get("C:/Users/marjo/OneDrive/Documents/Diginamic/Java/approche-objet/recensement.csv");
		Recensement recensementFrance = RecensementFactory.createRecensement(path);
		Scanner scanner = new Scanner(System.in);
		MenuService recherche = new RecherchePopulationVille();
		int option = 0;
		
		// Boucle de retour au menu
		while (option != 9) {
			
			// Affichage du menu
			System.out.println("\n/////////////////////////////////////////\n\n"
					+ "                   MENU\n"
					+ "-----------------------------------------\n"
					+ "1. Population d’une ville donnée\n"
					+ "2. Population d’un département donné\n"
					+ "3. Population d’une région donnée\n"
					+ "4. Afficher les 10 régions les plus peuplées\n"
					+ "5. Afficher les 10 départements les plus peuplés\n"
					+ "6. Afficher les 10 villes les plus peuplées d’un département\n"
					+ "7. Afficher les 10 villes les plus peuplées d’une région\n"
					+ "8. Afficher les 10 villes les plus peuplées de France\n"
					+ "9. Sortir\n\n"
					+ "Saisir le numéro de l'option voulue :");
			
			// Choix de l'utilisateur
			option = scanner.nextInt();	
			switch (option) {
				case 1:
					recherche = new RecherchePopulationVille();
					recherche.traiter(recensementFrance, scanner);
					break;
				case 2:
					recherche = new RecherchePopulationDepartement();
					recherche.traiter(recensementFrance, scanner);
					break;
				case 3:
					recherche = new RecherchePopulationRegion();
					recherche.traiter(recensementFrance, scanner);
					break;
				case 4:
					recherche = new RechercheTopRegion();
					recherche.traiter(recensementFrance, scanner);
					break;
				case 5:
					recherche = new RechercheTopDepartement();
					recherche.traiter(recensementFrance, scanner);
					break;
				case 6:
					recherche = new RechercheTopVillesDepartement();
					recherche.traiter(recensementFrance, scanner);
					break;
				case 7:
					recherche = new RechercheTopVillesRegion();
					recherche.traiter(recensementFrance, scanner);
					break;
				case 8:
					recherche = new RechercheTopVilles();
					recherche.traiter(recensementFrance, scanner);
					break;
				case 9:
					System.out.println("\n/////////////////////////////////////////\n\n"
							+ "                   FIN\n\n/////////////////////////////////////////");
					break;
				default:
					while (option > 9 || option < 1) {
						System.out.println("\nLe numéro saisi ne correspond pas à une option du menu, veuillez saisir un nombre entre 1 et 9 :");
						option = scanner.nextInt();
					}
					break;
			}
		}
	}
}
