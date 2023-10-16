package fr.diginamic.jdr;

import java.util.Random;

/**
 * Création des différents personnages
 * @author Marjory PRIN
 */
public class PersonnageFactory {
	
	/**
	 * Créer une instance de Guerrier
	 * @return une instance de Guerrier
	 */
	public static Guerrier creerGuerrier () {
		
		// Initialisation d'un nombre random
		Random rand = new Random();
		
		// Initialisation du score à 0
		int score = 0;
		
		// Génération des points de force en aléatoire (entre 12 et 18)
		int min = 12;
		int max = 18;
		int force = rand.nextInt(max-min+1) + min;
		
		// Génération des points de vie en aléatoire (entre 20 et 50)
		min = 20;
		max = 50;
		int pointDeVie = rand.nextInt(max-min+1) + min;
		
		return new Guerrier(force, pointDeVie, score);
	}
	
	/**
	 * Créer une instance de Loup
	 * @return une instance de Loup
	 */
	public static Loup creerLoup() {
		
		// Initialisation d'un nombre random
		Random rand = new Random();
		
		// Génération des points de force en aléatoire (entre 3 et 8)
		int min = 3;
		int max = 8;
		int force = rand.nextInt(max-min+1) + min;
		
		// Génération des points de vie en aléatoire (entre 5 et 10)
		min = 5;
		max = 10;
		int pointDeVie = rand.nextInt(max-min+1) + min;
		
		return new Loup(force, pointDeVie);
	}
	
	/**
	 * Créer une instance de Gobelin
	 * @return une instance de Gobelin
	 */
	public static Gobelin creerGobelin() {
		
		// Initialisation d'un nombre random
		Random rand = new Random();
		
		// Génération des points de force en aléatoire (entre 5 et 10)
		int min = 5;
		int max = 10;
		int force = rand.nextInt(max-min+1) + min;
		
		// Génération des points de vie en aléatoire (entre 10 et 15)
		min = 10;
		max = 15;
		int pointDeVie = rand.nextInt(max-min+1) + min;
		
		return new Gobelin(force, pointDeVie);
	}
	
	/**
	 * Créer une instance de Troll
	 * @return une instance de Troll
	 */
	public static Troll creerTroll() {
		
		// Initialisation d'un nombre random
		Random rand = new Random();
		
		// Génération des points de force en aléatoire (entre 10 et 15)
		int min = 10;
		int max = 15;
		int force = rand.nextInt(max-min+1) + min;
		
		// Génération des points de vie en aléatoire (entre 20 et 30)
		min = 20;
		max = 30;
		int pointDeVie = rand.nextInt(max-min+1) + min;
		
		return new Troll(force, pointDeVie);
	}
}
