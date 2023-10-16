package fr.diginamic.jdr;

/**
 * Représente un gobelin avec sa force et ses points de vie 
 * @author Marjory PRIN
 */
public class Gobelin extends Personnage {
	
	/**
	 * Constructeur de Gobelin
	 * @param force : force du gobelin
	 * @param pointDeVie : point de vie du gobelin
	 */
	public Gobelin(int force, int pointDeVie) {
		super(force, pointDeVie);
	}
	
	/**
	 * Affichage d'un gobelin avec sa force et ses points de vie
	 */
	@Override
	public String toString() {
		return "\nGOBELIN: "
				+ "\n-----------------"
				+ "\nForce: " + this.getForce()
				+ "\nPoints de vie: " + this.getPointDeVie();
	}
}
