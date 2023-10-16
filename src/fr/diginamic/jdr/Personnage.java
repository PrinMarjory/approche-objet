package fr.diginamic.jdr;

/**
 * Représente un personnage du jeu : guerrier, loup, gobelin ou troll
 * @author Marjory PRIN
 */
public abstract class Personnage {
	
	/** la force du personnage **/
	private int force;
	/** les points de vie du personnage **/
	private int pointDeVie;
	
	/**
	 * Constructeur prenant en paramètre la force et les points de vie
	 * @param force : le nombre de point de force du personnage
	 * @param pointDeVie : le nombre de point de vie du personnage
	 */
	public Personnage(int force, int pointDeVie) {
		super();
		this.force = force;
		this.pointDeVie = pointDeVie;
	}

	/**
	 * Getter pour la force
	 * @return le nombre de points de force du personnage
	 */
	public int getForce() {
		return force;
	}

	/**
	 * Getter pour les points de vie
	 * @return le nombre de point de vie du personnage
	 */
	public int getPointDeVie() {
		return pointDeVie;
	}
	
	/**
	 * Setter pour les points de vie
	 * @param pointDeVie : le nombre de point de vie à modifier
	 */
	public void setPointDeVie(int pointDeVie) {
		this.pointDeVie = pointDeVie;
	}

}
