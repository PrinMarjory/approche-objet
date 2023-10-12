package fr.diginamic.fichier;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathOrigine = Paths.get("C:/Users/marjo/OneDrive/Documents/Diginamic/Java/approche-objet/recensement.csv");
		File file = new File("C:/Users/marjo/OneDrive/Documents/Diginamic/Java/approche-objet/recensementOut.csv");
		file.createNewFile();
		Path pathDestination = Paths.get("C:/Users/marjo/OneDrive/Documents/Diginamic/Java/approche-objet/recensementOut.csv");
		
		List<String> lines = Files.readAllLines(pathOrigine);
		List<String> linesOut = new ArrayList<>();
		
		for (int i = 0; i<100; i++) {
			linesOut.add(lines.get(i));
		}
		Files.write(pathDestination, linesOut);
	}

}
