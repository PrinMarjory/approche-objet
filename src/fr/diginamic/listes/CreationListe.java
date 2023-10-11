package fr.diginamic.listes;
import java.util.ArrayList;

public class CreationListe {
	
	public static void main(String[] args) {
		
		//Création d'une liste de 1 à 100
		ArrayList<Integer> liste = new ArrayList<>();
		for (int i = 1; i<=100; i++) {
			liste.add(i);
		}
		System.out.println("Taille de la liste : " + liste.size());
		
	}
}
