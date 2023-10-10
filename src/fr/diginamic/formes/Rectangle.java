package fr.diginamic.formes;

/**
 * Représente un rectangle avec sa largeur et sa longueur
 * @author Marjory PRIN
 */
public class Rectangle extends Forme {

	/** La largeur du rectangle (en mm) */
	private double largeur;
	
	/** La longueur du rectangle (en mm) */
	private double longueur;
	
	/**
	 * Constructeur sans paramètre
	 */
	public Rectangle() {	
	}
	
	/**
	 * Constructeur qui prends en paramètre la largeur et la longueur
	 * @param largeur : largeur du rectangle (en mm)
	 * @param longueur : longueur du rectangle (en mm)
	 */
	public Rectangle(double largeur, double longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	/**
	 * Calcul de la surface du rectangle
	 * @return la surface arrondie à deux décimales (en mm2)
	 */
	@Override
	public double calculerSurface() {
		return Math.round(longueur*largeur*100.0)/100.0;
	}
	
	/**
	 * Calcul du périmètre du rectangle
	 * @return le périmètre arrondi à deux décimales (en mm)
	 */
	@Override
	public double calculerPerimetre() {
		return Math.round(2*(largeur+longueur)*100.0)/100.0;
	}
	
}
