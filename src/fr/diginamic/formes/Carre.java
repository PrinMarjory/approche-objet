package fr.diginamic.formes;

/**
 * Représente un carré avec sa longueur
 * @author Marjory PRIN
 */
public class Carre extends Rectangle {
	
	/**
	 * Constructeur qui prends en paramètre la longueur
	 * @param longueur : longueur du carré (en mm)
	 */
	public Carre(double longueur) {
		super(longueur, longueur);
	}
	
}
