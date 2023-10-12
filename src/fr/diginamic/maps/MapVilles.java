package fr.diginamic.maps;
import java.util.HashMap;
import java.util.Iterator;
import fr.diginamic.listes.Ville;


public class MapVilles {

	public static void main(String[] args) {
		
		// Instanciation Villes
		Ville nice = new Ville("Nice", 343000);
		Ville carcassone = new Ville("Carcassone", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 40600);

		// Création de la map
		HashMap<String, Ville> map = new HashMap<String, Ville>();
		map.put("Nice", nice);
		map.put("Carcassone", carcassone);
		map.put("Narbonne", narbonne);
		map.put("Lyon", lyon);
		map.put("Foix", foix);
		map.put("Pau", pau);
		map.put("Marseille", marseille);
		map.put("Tarbes", tarbes);
		
		// Supression de la ville avec le moins d'habitant
		Iterator<String> keyIte = map.keySet().iterator();
		int minHab = Integer.MAX_VALUE;
		String villeMin = "";
		while (keyIte.hasNext()) {
			String key = keyIte.next();
			if (map.get(key).getNbHabitants() < minHab) {
				minHab = map.get(key).getNbHabitants();
				villeMin = key;
			}
		}
		map.remove(villeMin);
		System.out.println(map);
		
	}

}
