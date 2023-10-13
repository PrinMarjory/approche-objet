package fr.diginamic.recensement;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import fr.diginamic.entites.Cercle;


/**
 * Creation d'une instance de Recensement à partir d'un fichier .csv
 * @author Marjory PRIN
 */
public class RecensementFactory {
	
	public static Recensement createRecensement(Path path) throws IOException {

		// Initialisation variables
		ArrayList<Ville> listeVilles = new ArrayList<>();
		int population = 0;
		String[] lineSplit = new String[0];
		
		// Lecture du fichier
		List<String> lines = Files.readAllLines(path);
		
		// Remplissage de la liste
		for (int i = 1; i<lines.size(); i++) {
			lineSplit = lines.get(i).split(";");
			population = Integer.parseInt(lineSplit[9].trim().replaceAll(" ", ""));
			listeVilles.add(new Ville(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2], 
					Integer.parseInt(lineSplit[5]), lineSplit[6], population));
		}
		return new Recensement(listeVilles);
	}
}
