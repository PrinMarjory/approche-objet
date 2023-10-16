package fr.diginamic.jdr;

/**
 * Représente un guerrier avec sa force, ses points de vie et son score
 * @author Marjory PRIN
 */
public class Guerrier extends Personnage {
	
	/** le score du personnage **/
	private int score;
	
	/**
	 * Constructeur de Guerrier
	 * @param force : force du guerrier
	 * @param pointDeVie : point de vie du guerrier
	 * @param score : le score du guerrier
	 */
	public Guerrier(int force, int pointDeVie, int score) {
		super(force, pointDeVie);
		this.score = score;
	}
	
	/**
	 * Affichage d'un guerrier avec sa force, ses points de vie et son score
	 */
	@Override
	public String toString() {
		return "\nGUERRIER: "
				+ "\n-----------------"
				+ "\nForce: " + this.getForce()
				+ "\nPoints de vie: " + this.getPointDeVie()
				+ "\nSCORE: " + score;
	}

	/**
	 * Getter pour le score du guerrier
	 * @return le score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Setter pour le score
	 * @param score : le score à modifier
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
}
