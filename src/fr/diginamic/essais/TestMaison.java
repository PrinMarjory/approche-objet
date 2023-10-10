package fr.diginamic.essais;
import fr.diginamic.maison.*;

/**
 * Tests des classes et sous-classe de Maison et Piece 
 * @author Marjory PRIN
 */
public class TestMaison {

	public static void main(String[] args) {
		
		//Initialisation pièces
		Piece salon1 = new Salon(50.0, 0);
		Piece wc1 = new WC(5.5, 0);
		Piece cuisine1 = new Cuisine(15.0, 0);
		Piece chambre1 = new Chambre(9.0, 0);
		Piece chambre2 = new Chambre(12.0, 1);
		Piece salleDeBain1 = new SalleDeBain(10.0, 1);
		Piece wc2 = new WC(4.5, 1);
		
		// Initialisation maison
		Maison maMaison = new Maison();
		maMaison.ajouterPiece(salon1);
		maMaison.ajouterPiece(wc1);
		maMaison.ajouterPiece(cuisine1);
		maMaison.ajouterPiece(chambre1);
		maMaison.ajouterPiece(chambre2);
		maMaison.ajouterPiece(salleDeBain1);
		maMaison.ajouterPiece(wc2);
		
		// Controle des erreurs
		System.out.println("--------------- GESTION DES ERREURS ----------------");
		maMaison.ajouterPiece(null);
		Piece wc3 = new WC(-2, 2);
		maMaison.ajouterPiece(wc3);

		// Affichage des superficies
		System.out.println("\n------------------- SUPERFICIES --------------------");
		System.out.println("Superficie totale de la maison (en m2) : " + maMaison.superficieTotale() + "m2");
		System.out.println("Superficie totale du RDC (en m2) : " + maMaison.superficieEtage(0) + "m2");
		System.out.println("Superficie totale du 1er étage (en m2) : " + maMaison.superficieEtage(1) + "m2");
		System.out.println("Superficie totale des chambres (en m2) : " + maMaison.superficiePiece("Chambre") + "m2");
		System.out.println("Nombre total de chambre : " + maMaison.nbPieces("Chambre"));
	}

}
