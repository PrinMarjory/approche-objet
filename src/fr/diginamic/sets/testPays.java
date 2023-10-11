package fr.diginamic.sets;

import java.util.HashSet;

import fr.diginamic.listes.Ville;

public class testPays {

	public static void main(String[] args) {
		 
		// Initialisation
		HashSet<Pays> pays = new HashSet<>();
		pays.add(new Pays("USA", 331_900_000, 70_248.63));
		pays.add(new Pays("France", 68_042_591, 43_658.98));
		pays.add(new Pays("Allemagne", 83_200_000, 51_203.55));
		pays.add(new Pays("UK", 66_022_000, 46_510.28));
		pays.add(new Pays("Italie", 59_110_000, 35_657.50));
		pays.add(new Pays("Japon", 125_700_000, 39_312.66));
		pays.add(new Pays("Chine", 1_410_000_000, 12_556.33));
		pays.add(new Pays("Russie", 146_160_000, 12_194.78));
		pays.add(new Pays("Inde", 1_408_000_000, 2_256.59));
		
		// Recherche du pays avec le PIB par habitant le plus important
		double max = 0;
		Pays paysMax = null;
		for (Pays p: pays) {
			if (p.getPib() > max) {
				max = p.getPib();
				paysMax = p;
			}
		}
		System.out.println("Pays avec le plus grand PIB/hab :\n" + paysMax);
		System.out.println("---------------------------------------------------------------");
		
		// Recherche du pays avec le PIB total le plus important
		max = 0;
		paysMax = null;
		for (Pays p: pays) {
			if (p.getPib()*p.getNbHabitant() > max) {
				max = p.getPib()*p.getNbHabitant();
				paysMax = p;
			}
		}
		System.out.println("Pays avec le plus grand PIB total:\n" + paysMax + "\nPIB total: " + max + " USD");
		System.out.println("---------------------------------------------------------------");

		// Mettre en majuscule le pays avec le PIB total le plus petit
		double min = max;
		Pays paysMin = null;
		for (Pays p: pays) {
			if (p.getPib()*p.getNbHabitant() < min) {
				min = p.getPib()*p.getNbHabitant();
				paysMin = p;
			}
		}
		paysMin.setNom(paysMin.getNom().toUpperCase());
		System.out.println("Pays avec le plus petit PIB total:\n" + paysMin + "\nPIB total: " + min + " USD");
		System.out.println("---------------------------------------------------------------");
		
		// Supression du pays au PIB total le plus petit
		pays.remove(paysMin);
		
		// Affichage de tous les pays avec leur PIB total
		for (Pays p: pays) {
			System.out.println(p.getNom() + "(" + p.getNbHabitant()+ " hab, PIB total: " + p.getNbHabitant()*p.getPib() + " USD)");
		}
		
		
	}

}
