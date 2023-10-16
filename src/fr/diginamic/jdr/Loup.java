package fr.diginamic.jdr;

/**
 * Représente un loup avec sa force et ses points de vie 
 * @author Marjory PRIN
 */
public class Loup extends Personnage {
	
	/**
	 * Constructeur de Loup
	 * @param force : force du loup
	 * @param pointDeVie : point de vie du loup
	 */
	public Loup(int force, int pointDeVie) {
		super(force, pointDeVie);
	}
	
	/**
	 * Affichage d'un loup avec sa force et ses points de vie
	 */
	@Override
	public String toString() {
		return "\nLOUP: "
				+ "\n-----------------"
				+ "\nForce: " + this.getForce()
				+ "\nPoints de vie: " + this.getPointDeVie();
	}
}
