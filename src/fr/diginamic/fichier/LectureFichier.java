package fr.diginamic.fichier;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		// Initialisation variables
		ArrayList<Ville> listeVilles = new ArrayList<>();
		int population = 0;
		
		// Lecture du fichier
		Path path = Paths.get("C:/Users/marjo/OneDrive/Documents/Diginamic/Java/approche-objet/recensement.csv");
		List<String> lines = Files.readAllLines(path);
		
		// Récupération des en-tête
		String[] lineSplit = lines.get(0).split(";");
		String firstLine = lineSplit[6] + ";" + lineSplit[2] + ";" + lineSplit[1] + ";" + lineSplit[9];
		
		// Remplissage de la liste
		for (int i = 1; i<lines.size(); i++) {
			lineSplit = lines.get(i).split(";");
			population = Integer.parseInt(lineSplit[9].trim().replaceAll(" ", ""));
			listeVilles.add(new Ville(lineSplit[6], lineSplit[2], lineSplit[1], population));
		}
		
		// Suppresion des villes de 25 000 habitants et moins
		Iterator<Ville> iterator = listeVilles.iterator();
		while (iterator.hasNext()) {
			Ville ville = iterator.next();
			if (ville.getPopulation()<= 25000) {
				iterator.remove();
			}
		}
		
		// Création du fichier de sortie
		File file = new File("C:/Users/marjo/OneDrive/Documents/Diginamic/Java/approche-objet/recensement25000.csv");
		file.createNewFile();
		Path pathDestination = Paths.get("C:/Users/marjo/OneDrive/Documents/Diginamic/Java/approche-objet/recensement25000.csv");
		
		List<String> linesOut = new ArrayList<>();
		linesOut.add(firstLine);
		for (Ville v: listeVilles) {
			linesOut.add(v.getNomVille() + ";" + v.getCodeDep() + ";" + v.getNomRegion() + ";" + v.getPopulation());
		}
		Files.write(pathDestination, linesOut);
		
	}

}
