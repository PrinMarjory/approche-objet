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
		
		MenuService recherche = new RecherchePopulationVille();
		System.out.println(recensementFrance.getListVilles().get(10));
		
		Scanner scanner = new Scanner(System.in);
		
		recherche.traiter(recensementFrance, scanner);
		
	}

}
