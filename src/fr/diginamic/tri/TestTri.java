package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

import fr.diginamic.listes.Ville;

public class TestTri {

	public static void main(String[] args) {
		
		//Initialisation
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassone", 47800));
		villes.add(new Ville("Narbonne", 53400));
		villes.add(new Ville("Lyon", 484000));
		villes.add(new Ville("Foix", 9700));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850700));
		villes.add(new Ville("Tarbes", 40600));
		
		// Tri 1
		System.out.println("COMPRAISON PAR HABITANTS\n");
		Collections.sort(villes, new ComparatorHabitant());
		for (Ville v: villes) {
			System.out.println(v);
		}
		
		System.out.println("\n------------------------------------------\n");
		
		// Tri 2
		System.out.println("COMPRAISON PAR NOM\n");
		Collections.sort(villes, new ComparatorNom());
		for (Ville v: villes) {
			System.out.println(v);
		}
		

	}

}
