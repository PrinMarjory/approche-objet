package fr.diginamic.maison;

/**
 * Représente un salon
 * @author Marjory PRIN
 */
public class Salon extends Piece {

	public Salon(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	
	/**
	 * Getter pour le type de pièce
	 * @return le type de pièce
	 */
	public String getType() {
		return "Salon";
	}

}
