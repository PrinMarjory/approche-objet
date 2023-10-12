package fr.diginamic.maps;
import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		//Initialisation
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Affichage des clés contenues dans la map
		System.out.println("Clés: ");
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		while (keysIte.hasNext()) {
			int key = keysIte.next();
			System.out.print(key + " ");
		}
		System.out.println("\n-------------------------------------");
		
		//Affichage des valeurs contenues dans la map
		System.out.println("Valeurs: ");
		Iterator<String> valIte = mapVilles.values().iterator();
		while (valIte.hasNext()) {
			String value = valIte.next();
			System.out.print(value + " ");
		}
		System.out.println("\n-------------------------------------");
		
		//Affichage de la taille de la map
		System.out.println("Taille de la map : " + mapVilles.size());
		
	}

}
