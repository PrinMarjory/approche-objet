/**
 * 
 */
package fr.diginamic.formes;

/**
 * Représente un cercle avec son diamètre
 * @author Marjory PRIN
 */
public class Cercle extends Forme {
	
	/** Le rayon du cercle (en mm) */
	private double rayon;
	
	/**
	 * Constructeur qui prends en paramètre le rayon du cercle
	 * @param rayon : rayon du cercle (en mm)
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	/**
	 * Calcul de la surface du cercle
	 * @return la surface arrondie à deux décimales (en mm2)
	 */
	@Override
	public double calculerSurface() {
		return Math.round(Math.PI*rayon*rayon*100.0)/100.0;
	}
	
	/**
	 * Calcul du périmètre du cercle
	 * @return le périmètre arrondi à deux décimales (en mm)
	 */
	@Override
	public double calculerPerimetre() {
		return Math.round(2*Math.PI*rayon*100.0)/100.0;
	}

}
