package fr.diginamic.jdr;

import java.util.Random;
import java.util.Scanner;

/**
 * Représente un combat entre un guerrier et une créature
 * @author Marjory PRIN
 */
public class Combat {
	
	/**
	 * Combattre une créature : loup, gobelin ou troll
	 * @param guerrier : le guerrier 
	 */
	public static void combattre(Guerrier guerrier) {
		
		// Choix de l'option de combat 
		System.out.println("\nChoix de l'adversaire :"
						 + "\n--------------------"
						 + "\n1. Loup"
						 + "\n2. Gobelin"
						 + "\n3. Troll"
						 + "\n4. Aléatoire"
						 + "\n\nVeuillez saisir le numéro de votre choix:");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
		// Boucle de controle 
		while (option<1 || option>4) {
			System.out.println("\nErreur: Ce choix n'est pas possible ! Veuillez saisir un chiffre entre 1 et 4 :");
			option = scanner.nextInt();	
		}
		
		// Génération d'un nombre aléatoire entre 1 et 3 pour l'option 4
		Random rand = new Random();
		if (option == 4) {
			option = rand.nextInt(3)+1;
		}
		
		// Création d'une créature à combattre en fonction de l'option
		Personnage creature = new Loup(0,0);
		String typeCreature = "";
		switch (option) {
			case 1:
				creature = PersonnageFactory.creerLoup();
				typeCreature = "Loup";
				break;
			case 2:
				creature = PersonnageFactory.creerGobelin();
				typeCreature = "Gobelin";
				break;		
			case 3:
				creature = PersonnageFactory.creerTroll();
				typeCreature = "Troll";
				break;		
		}
		
		System.out.println("\nVotre adversaire est :\n" + creature);
		
		// Récupération des points de vie et de force
		int vieGuerrier = guerrier.getPointDeVie();
		int forceGuerrier = guerrier.getForce();
		int vieCreature = creature.getPointDeVie();
		int forceCreature = creature.getForce();
		
		// Initialisation des points d'attaque, de dégat et du nombre de tour
		int attaqueGuerrier = 0;
		int attaqueCreature = 0;
		int degats = 0;
		int nbTour = 0;
		
		// Boucle de combat tant que'aucun des deux combattant n'est mort
		while (vieGuerrier > 0 && vieCreature > 0) {
			
			// Affichage du tour
			nbTour++;
			System.out.println("\n===================================\n"
							 + "\n               TOUR " + nbTour
							 + "\n-----------------------------------");
			
			// Calcul des points d'attaque
			attaqueGuerrier = forceGuerrier + rand.nextInt(10) + 1;
			attaqueCreature = forceCreature + rand.nextInt(10) + 1;
			System.out.println("\nPoints d'attaques du tour:" 
							 + "\nGuerrier: " + attaqueGuerrier 
							 + "\n" + typeCreature + ": " + attaqueCreature);
			
			// Calcul du perdant et des points de dégat
			if (attaqueGuerrier > attaqueCreature) {
				degats = attaqueGuerrier - attaqueCreature;
				vieCreature -= degats;
				System.out.println("\nLe Guerrier inflige " + degats + " point(s) de dégats au " + typeCreature + " !");
			} else if (attaqueGuerrier < attaqueCreature) {
				degats = attaqueCreature - attaqueGuerrier;
				vieGuerrier -= degats;
				System.out.println("\nLe " + typeCreature + " inflige " + degats + " point(s) de dégats au Guerrier !");
			} else {
				System.out.println("Le Guerrier contre l'attaque du " + typeCreature + ", aucun dégats infligés");
			}
			
			// Affichage des points de vie restants
			if (vieGuerrier > 0 && vieCreature > 0) {
				System.out.println("\nPoints de vie restants:" 
						 + "\nGuerrier: " + vieGuerrier 
						 + "\n" + typeCreature + ": " + vieCreature);
			}
		
		}
		
		System.out.println("\n===================================\n");
		// Affichage message de défaite
		if (vieGuerrier < 0) {
			guerrier.setPointDeVie(0);
			System.out.println("Votre guerrier est décédé. Il a obtenu le score de " + guerrier.getScore() + " point(s). "
					+ "\nVeuillez créer un nouveau guerrier");
		} else {
			
			// Calcul du score
			int score = 0;
			switch (option) {
				case 1:
					score += 1;
					break;
				case 2:
					score += 2;
					break;
				case 3:
					score += 5;
					break;
				default:
					System.out.println("Erreur : impossible de calculer le score !");
					break;
			}
			guerrier.setScore(guerrier.getScore() + score);
			
			// Affichage du message de victoire
			System.out.println("Bravo ! Votre guerrier a terrassé le " + typeCreature + " en " + nbTour + " tour(s) !");
		}
	}

}
