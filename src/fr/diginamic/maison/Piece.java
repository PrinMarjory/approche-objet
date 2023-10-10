package fr.diginamic.maison;

/**
 * Représente une pièce de la maison avec sa superficie et le numéro d'étage
 * @author Marjory PRIN
 */
public abstract class Piece {
	
	/** La superficie de la pièce en m2 */
	private double superficie;
	
	/** Le numéro d'étage, 0 correspondant au RDC, 1 au 1er étage, etc. */
	private int numEtage;
	
	/**
	 * Constructeur prenant en paramètre la superficie de la pièce et son numéro d'étage
	 * @param superficie : superficie de la piece en m2
	 * @param numEtage : numéro d'étage
	 */
	public Piece(double superficie, int numEtage) {
			this.superficie = superficie;
			this.numEtage = numEtage;
	}

	/**
	 * Getter pour la superficie de la pièce
	 * @return la superficie en m2
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * Getter pour le numéro d'étage
	 * @return le numéro d'étage
	 */
	public int getNumEtage() {
		return numEtage;
	}
	
	/**
	 * Getter pour le type de pièce
	 * @return le type de pièce
	 */
	public abstract String getType();
	
	
}
