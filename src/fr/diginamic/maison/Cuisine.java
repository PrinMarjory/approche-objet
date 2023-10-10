package fr.diginamic.maison;

/**
 * Représente une cuisine
 * @author Marjory PRIN
 */
public class Cuisine extends Piece {

	public Cuisine(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	
	/**
	 * Getter pour le type de pièce
	 * @return le type de pièce
	 */
	public String getType() {
		return "Cuisine";
	}

}
