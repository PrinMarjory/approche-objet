/**
 * 
 */
package fr.diginamic.formes;

/**
 * Represente une forme géométrique
 * @author Marjory PRIN
 */
public abstract class Forme {
	
	/**
	 * Calcul de la surface de la forme
	 * @return la surface de la forme (en mm2)
	 */
	public abstract double calculerSurface();
	
	/**
	 * Calcul du périmètre de la forme
	 * @return le périmètre de la forme (en mm)
	 */
	public abstract double calculerPerimetre();
}
