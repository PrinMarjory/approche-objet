package fr.diginamic.jdr;

import java.util.Scanner;

public class JeuDeRole {

	public static void main(String[] args) {

		// Initialisation
		Guerrier guerrier = new Guerrier(0, -1, 0);
		int option = 0;
		Scanner scanner = new Scanner(System.in);
		
		// Boucle de retour au menu
		while (option != 4) {
			
			// Affichage du menu
			System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n\n"
					+ "                   MENU\n"
					+ "-----------------------------------------\n"
					+ "1. Créer un guerrier\n"
					+ "2. Combattre une créature\n"
					+ "3. Afficher le score\n"
					+ "4. Sortir\n"
					+ "\nSaisir le numéro de l'option voulue :");
			
			// Choix de l'utilisateur
			option = scanner.nextInt();	
			
			switch (option) {
				case 1:
					guerrier = PersonnageFactory.creerGuerrier();
					System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n");
					System.out.println("CREATION D'UN NOUVEAU GUERRIER:\n" + guerrier);
					break;
				case 2:
					if (guerrier.getPointDeVie() == -1) {
						System.out.println("\nVous n'avez pas encore créer de guerrier, vous ne pouvez pas combattre !");
						break;
					} else if (guerrier.getPointDeVie() == 0) {
						System.out.println("Votre guerrier est décédé. Veuillez créer un nouveau guerrier");
						break;
					} else {
						System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n");
						System.out.println("DEBUT DU COMBAT");
						Combat.combattre(guerrier);
						break;
					}
				case 3:
					if (guerrier.getPointDeVie() == -1) {
						System.out.println("\nVous n'avez pas encore créer de guerrier, veuillez créer un nouveau guerrier !");
						break;
					} else {
						System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n");
						System.out.println("SCORE DU GUERRIER: " + guerrier.getScore());
						break;
					}
				case 4:
					System.out.println("\n|||||||||||||||||||||||||||||||||||||||||\n\n"
							+ "                   FIN\n\n|||||||||||||||||||||||||||||||||||||||||");
					break;
				default:
					while (option < 1 || option > 4) {
						System.out.println("\nLe numéro saisi ne correspond pas à une option du menu, veuillez saisir un nombre entre 1 et 4 :");
						option = scanner.nextInt();
					}
					break;
			}
		}
	}

}
