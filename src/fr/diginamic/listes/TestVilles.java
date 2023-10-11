package fr.diginamic.listes;
import java.util.ArrayList;
import fr.diginamic.listes.Ville;

public class TestVilles {

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
		
		// Recherche de la ville la plus peuplée
		int maxHabitant = villes.get(0).getNbHabitants();
		int index = 0;
		for (Ville v: villes) {
			if (v.getNbHabitants() > maxHabitant) {
				maxHabitant = v.getNbHabitants();
				index = villes.indexOf(v);
			}
		}
		System.out.println("Ville la plus peuplée: " + villes.get(index));
		
		// Suppression de la ville la moins peuplée
		int minHabitant = villes.get(0).getNbHabitants();
		index = 0;
		for (Ville v: villes) {
			if (v.getNbHabitants() < minHabitant) {
				minHabitant = v.getNbHabitants();
				index = villes.indexOf(v);
			}
		}
		System.out.println("Ville la moins peuplée: " + villes.get(index));
		villes.remove(index);

		// Villes de plus de 100 000 habitans en majuscules
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitants() > 100000) {
				villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
			}
		}
		
		// Affichage liste finale
		System.out.println(villes);
		
	}

}
