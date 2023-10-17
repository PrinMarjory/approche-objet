package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {
		
		// Instanciation de deux villes
		Ville v1 = new Ville("Rennes", 27000);
		Ville v2 = new Ville("Rennes", 27000);
		
		// Test sans changer les attributs
		System.out.println("Méthode equals : " + v1.equals(v2));
		System.out.println("Méthode == : " + (v1 == v2));
		
		// Test avec changement de la population
		v2.setNbHabitants(23000);
		System.out.println("Méthode equals (après changement) : " + v1.equals(v2));

	}

}
