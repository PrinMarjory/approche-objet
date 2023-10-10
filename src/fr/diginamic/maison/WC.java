package fr.diginamic.maison;

/**
 * Représente un WC
 * @author Marjory PRIN
 */
public class WC extends Piece {

	public WC(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	
	/**
	 * Getter pour le type de pièce
	 * @return le type de pièce
	 */
	public String getType() {
		return "WC";
	}

}
