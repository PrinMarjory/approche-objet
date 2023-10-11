package fr.diginamic.listes;
import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		
		// Initialisation de la liste
		ArrayList<Integer> liste = new ArrayList<>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		// Affichage de la liste et de sa taille
		System.out.println("Liste : " + liste);
		System.out.println("Taille de la liste : " + liste.size());
		
		// Recherche de la valeur max
		int max = liste.get(0);
		for (int val: liste) {
			if (val>max) {
				max = val;
			}
		}
		System.out.println("Valeur max : " + max);
		
		// Suppression de la valeur min
		int min = liste.get(0);
		int index = 0;
		for (int val: liste) {
			if (val<min) {
				min = val;
				index = liste.indexOf(val);
			}
		}
		liste.remove(index);
		System.out.println("Nouvelle liste après supression de la valeur min : " + liste);

		// Modification des valeurs négatives
		for (int val: liste) {
			if (val<0) {
				liste.set(liste.indexOf(val), val*(-1));
			}
		}
		System.out.println("Nouvelle liste après smodification des valeurs négatives : " + liste);
		
	}

}
