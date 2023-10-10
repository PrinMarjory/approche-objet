package fr.diginamic.maison;

/**
 * Représente une salle de bain
 * @author Marjory PRIN
 */
public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	
	/**
	 * Getter pour le type de pièce
	 * @return le type de pièce
	 */
	public String getType() {
		return "SalleDeBain";
	}

}
