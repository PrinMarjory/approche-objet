package fr.diginamic.formes;

/**
 * Représente un carré avec sa longueur
 * @author Marjory PRIN
 */
public class Carre extends Rectangle {
	
	/** La longueur du carré (en mm) */
	private double longueur;
	
	/**
	 * Constructeur qui prends en paramètre la longueur
	 * @param longueur : longueur du carré (en mm)
	 */
	public Carre(double longueur) {
		super();
		this.longueur = longueur;
	}
	
	/**
	 * Calcul de la surface du carré
	 * @return la surface arrondie à deux décimales (en mm2)
	 */
	@Override
	public double calculerSurface() {
		return Math.round(longueur*2*100.0)/100.0;
	}
	
	/**
	 * Calcul du périmètre du carré
	 * @return le périmètre arrondi à deux décimales (en mm)
	 */
	@Override
	public double calculerPerimetre() {
		return Math.round(4*longueur*100.0)/100.0;
	}
	
}
