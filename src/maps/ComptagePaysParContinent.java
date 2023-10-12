package maps;
import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		
		// Initialisation
		ArrayList<Pays> pays = new ArrayList<>();
		pays.add(new Pays("France", 65, "Europe"));
		pays.add(new Pays("Allemagne", 80, "Europe"));
		pays.add(new Pays("Belgique", 10, "Europe"));
		pays.add(new Pays("Russie", 150, "Asie"));
		pays.add(new Pays("Chine", 1400, "Asie"));
		pays.add(new Pays("Indonésie", 220, "Asie"));
		pays.add(new Pays("Australie", 20, "Océanie"));
		
		// Comptage des pays
		HashMap<String, Integer> comptage = new HashMap<>();
		for (Pays p: pays) {
			Integer compteur = comptage.getOrDefault(p.getContinent(), 0);
			compteur++;
			comptage.put(p.getContinent(), compteur);
		}
		
		System.out.println(comptage);
	}

}
