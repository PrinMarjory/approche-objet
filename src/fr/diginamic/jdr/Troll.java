package fr.diginamic.jdr;

/**
 * Représente un troll avec sa force et ses points de vie 
 * @author Marjory PRIN
 */
public class Troll extends Personnage {
	
	/**
	 * Constructeur de Troll
	 * @param force : force du troll
	 * @param pointDeVie : point de vie du troll
	 */
	public Troll(int force, int pointDeVie) {
		super(force, pointDeVie);
	}
	
	/**
	 * Affichage d'un troll avec sa force et ses points de vie
	 */
	@Override
	public String toString() {
		return "\nTROLL: "
				+ "\n-----------------"
				+ "\nForce: " + this.getForce()
				+ "\nPoints de vie: " + this.getPointDeVie();
	}
}
