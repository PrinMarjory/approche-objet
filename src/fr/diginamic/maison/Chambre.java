package fr.diginamic.maison;

/**
 * Représente une chambre 
 * @author Marjory PRIN
 */
public class Chambre extends Piece {

	public Chambre(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	
	/**
	 * Getter pour le type de pièce
	 * @return le type de pièce
	 */
	public String getType() {
		return "Chambre";
	}
	

}
