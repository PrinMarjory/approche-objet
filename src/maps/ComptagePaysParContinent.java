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
		comptage.put("Europe", 0);
		comptage.put("Asie", 0);
		comptage.put("Océanie", 0);
		comptage.put("Afrique", 0);
		comptage.put("Amérique", 0);
		for (Pays p : pays) {
			switch (p.getContinent()) {
				case "Europe": 
					comptage.put("Europe", comptage.get("Europe")+1);
					break;
				case "Asie": 
					comptage.put("Asie", comptage.get("Asie")+1);
					break;
				case "Océanie": 
					comptage.put("Océanie", comptage.get("Océanie")+1);
					break;
				case "Afrique": 
					comptage.put("Afrique", comptage.get("Afrique")+1);
					break;
				case "Amérique": 
					comptage.put("Amérique", comptage.get("Amérique")+1);
					break;
				default: 
					System.out.println("Erreur: Continent inexistant !");
					break;
			}
		}
		
		System.out.println(comptage);
	}

}
