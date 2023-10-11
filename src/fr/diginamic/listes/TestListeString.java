package fr.diginamic.listes;
import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		
		// Initialisation
		ArrayList<String> liste = new ArrayList<>();
		liste.add("Nice");
		liste.add("Carcassone");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		// Recherche de la ville avec le plus grand nombre de lettres
		int max = liste.get(0).length();
		String villeLongue = liste.get(0);
		for (String s: liste) {
			if (s.length()>max) {
				max = s.length();
				villeLongue = s;
			}
		}
		System.out.println("Ville avec le plus grand nombre de lettre : " + villeLongue + "(" + max + " lettres)");
		
		// Noms de villes en majuscule
		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		System.out.println("En majuscule : " + liste);
		
		// Suppression des villes commancant par N
		Iterator<String> iterator = liste.iterator();
		while (iterator.hasNext()) {
			String ville = iterator.next();
			if (ville.substring(0, 1).equals("N")) {
				iterator.remove();
			}
		}
		System.out.println("Sans les villes commançant par N : " + liste);
	}

}
