package fr.diginamic.listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		// Instanciation des villes
		Ville newYork = new Ville("New York", 8468000, Continent.AMERIQUE);
		Ville paris = new Ville("Paris", 2161000, Continent.EUROPE);
		Ville pekin = new Ville("Pékin", 21540000, Continent.ASIE);
		Ville moscou = new Ville("Moscou", 11980000, Continent.EUROPE);
		Ville berlin = new Ville("Berlin", 3645000, Continent.EUROPE);
		Ville sydney = new Ville("Sydney", 5312000, Continent.OCEANIE);
		Ville saoPaulo = new Ville("Sao Paulo", 12330000, Continent.AMERIQUE);
		Ville dakar = new Ville("Dakar", 1146000, Continent.AFRIQUE);
		
		// Création d'une ArrayList
		Ville[] listeVille = {newYork, paris, pekin, moscou, berlin, sydney, saoPaulo, dakar};
		
		// Boucle d'affichage des villes
		for (Ville v: listeVille) {
			System.out.println(v);
		}
	}

}
