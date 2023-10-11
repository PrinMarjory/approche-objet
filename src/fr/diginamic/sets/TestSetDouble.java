package fr.diginamic.sets;
import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		
		// Initialisation
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		System.out.println("Set: " + set);
		
		// Afficher valeur max
		Double max = Collections.max(set);
		System.out.println("Valeur max: " + max);
			
		// Supprimer valeur min
		Double min = Collections.min(set);
		set.remove(min);
		System.out.println("Set modifié: " + set);
	}

}
