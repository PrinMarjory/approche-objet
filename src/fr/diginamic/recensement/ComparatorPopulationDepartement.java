package fr.diginamic.recensement;
import java.util.Comparator;

public class ComparatorPopulationDepartement implements Comparator<Departement> {
	
	public int compare(Departement d1, Departement d2) {
		if (d1.getPopulation() > d2.getPopulation()) {
			return -1;
		}
		else if (d1.getPopulation() < d2.getPopulation()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
