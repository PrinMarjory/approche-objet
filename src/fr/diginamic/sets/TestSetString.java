package fr.diginamic.sets;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		
		// Initialisation
		HashSet<String> pays = new HashSet<>();
		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");
		
		// Recherche de la ville avec le plus grand nombre de lettres
		int max = 0;
		String paysLong = "";
		for (String s: pays) {
			if (s.length()>max) {
				max = s.length();
				paysLong = s;
			}
		}
		System.out.println("Pays avec le plus grand nombre de lettre : " + paysLong + "(" + max + " lettres)");
		
		// Suppression et affichage set modifié
		pays.remove(paysLong);
		System.out.println(pays);
		
	}

}
