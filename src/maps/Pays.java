package maps;

/**
 * Représente un pays avec son nom, son nombre d'habitant et sont continent
 * @author Marjory PRIN
 */
public class Pays {
	
	private String nom;
	private int nbHabitant; // en millions d'habitants
	private String continent;
	
	/**
	 * Constructeur
	 * @param nom
	 * @param nbHabitant
	 * @param continent
	 */
	public Pays(String nom, int nbHabitant, String continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}
	
	/**
	 * Getter du nom
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Getter du nombre d'habitants
	 * @return le nombre d'habitants
	 */
	public int getNbHabitant() {
		return nbHabitant;
	}
	
	/**
	 * Getter du continent
	 * @return le continent
	 */
	public String getContinent() {
		return continent;
	}
	
	
	
	

}
