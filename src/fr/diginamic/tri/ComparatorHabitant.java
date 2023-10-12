package fr.diginamic.tri;
import java.util.Comparator;
import fr.diginamic.listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {
	
	public int compare(Ville v1, Ville v2) {
		if (v1.getNbHabitants() > v2.getNbHabitants()) {
			return 1;
		}
		else if (v1.getNbHabitants() < v2.getNbHabitants()) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
}
