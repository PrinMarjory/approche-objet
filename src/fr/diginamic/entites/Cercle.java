/**
 * 
 */
package fr.diginamic.entites;

/**
 * Représente un cercle avec son rayon
 * @author Marjory PRIN
 */
public class Cercle {
	
	/** Le rayon du cercle (en mm) */
	private double rayon;
	
	/**
	 * Constructeur qui prends en paramètre le rayon du cercle
	 * @param rayon : rayon du cercle
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * Getter pour le rayon du cercle
	 * @return le rayon du cercle
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * Setter pour le rayon du cercle
	 * @param rayon : le rayon du cercle que l'on veut modifier
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	/**
	 * Calcul du périmètre du cercle
	 * @return le périmètre arrondi à deux décimales 
	 */
	public double getPerimetre() {
		return Math.round(2*Math.PI*rayon*100.0)/100.0;
	}
	
	/**
	 * Calcul de la surface du cercle
	 * @return la surface arrondi à deux décimales 
	 */
	public double getSurface() {
		return Math.round(Math.PI*rayon*rayon*100.0)/100.0;
	}
	
	
}
