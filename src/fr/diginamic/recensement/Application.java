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
		
//		// Test recherche population d'une ville 
//		recherche = new RecherchePopulationVille();
//		recherche.traiter(recensementFrance, scanner);
//		
//		// Test recherche population d'un département
//		recherche = new RecherchePopulationDepartement();
//		recherche.traiter(recensementFrance, scanner);
//				
//		// Test recherche population d'une région
//		recherche = new RecherchePopulationRegion();
//		recherche.traiter(recensementFrance, scanner);
//		
//		// Test recherche population d'une région
//		recherche = new RechercheTopRegion();
//		recherche.traiter(recensementFrance, scanner);
//		
//		// Test recherche population d'une région
//		recherche = new RechercheTopDepartement();
//		recherche.traiter(recensementFrance, scanner);
//		
//		// Test recherche 10 villes les plus peuplées d'un département
//		recherche = new RechercheTopVillesDepartement();
//		recherche.traiter(recensementFrance, scanner);
//		
//		// Test recherche 10 villes les plus peuplées d'une région
//		recherche = new RechercheTopVillesRegion();
//		recherche.traiter(recensementFrance, scanner);
		
		// Test recherche 10 villes les plus peuplées
		recherche = new RechercheTopVilles();
		recherche.traiter(recensementFrance, scanner);
	}

}
