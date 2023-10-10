package fr.diginamic.maison;
import java.util.Arrays;

/**
 * Représente une maison avec des pièces 
 * @author Marjory PRIN
 */
public class Maison {
	
	/* Tableau contenant les pièces de la maison */
	private Piece[] tableauPieces = new Piece[0];
	
	/**
	 * Ajoute une pièce dans la maison
	 * @param piece : une pièce de la maison
	 */
	public void ajouterPiece(Piece piece) {
		if (piece == null) {
			System.out.println("Erreur: L'ajout d'une pièce \"null\" n'est pas autorisé !");
		} 
		// Je laisse la possibilité d'avoir un étage négatif pour les sous-sols
		// Sinon il aurait fallu mettre : if (piece.getSuperficie() <= 0 || piece.numEtage() < 0)
		else if (piece.getSuperficie() <= 0) {
			System.out.println("Erreur: Une pièce ne peut pas avoir une superficie inférieure ou égale à 0 !");
		} else {
			Piece[] temp = new Piece[tableauPieces.length+1];
			for (int i = 0; i<tableauPieces.length; i++) {
				temp[i] = tableauPieces[i];
			}
			temp[tableauPieces.length] = piece;
			tableauPieces = temp;
		}
	}
	
	/**
	 * Calcul de la superficie totale de la maison
	 * @return la superficie en m2
	 */
	public double superficieTotale() {
		double superficie = 0.0;
		for(Piece p : tableauPieces) {
			superficie += p.getSuperficie();
		}
		return superficie;
	}
	
	/**
	 * Calcul de la superficie totale d'un étage
	 * @param etage: numéro d'étage
	 * @return la superficie en m2 de l'étage passé en paramètre
	 */
	public double superficieEtage(int etage) {
		double superficie = 0.0;
		for(Piece p : tableauPieces) {
			if(p.getNumEtage() == etage) {
				superficie += p.getSuperficie();
			}
		}
		return superficie;
	}
	
	/**
	 * Calcul de la superficie totale d'un type de pièce
	 * @param type: type de pièce
	 * @return la superficie en m2 du type de pièce passé en paramètre
	 */
	public double superficiePiece(String type) {
		double superficie = 0.0;
		for(Piece p : tableauPieces) {
			if(p.getType() == type) {
				superficie += p.getSuperficie();
			} 
		}
		return superficie;
	}
	
	/**
	 * Calcul du nombre total d'un type de pièce
	 * @param type: type de pièce
	 * @return le nombre de type d'une pièce donnée
	 */
	public int nbPieces(String type) {
		int nb = 0;
		for(Piece p : tableauPieces) {
			if(p.getType() == type) {
				nb += 1;
			} 
		}
		return nb;
	}
}
