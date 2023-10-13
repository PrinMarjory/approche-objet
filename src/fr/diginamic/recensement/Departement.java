package fr.diginamic.recensement;

/**
 * Représente un département avec son code et son nombre d'habitants total
 * 
 * @author Marjory PRIN
 */
public class Departement {
	
	/** Le code du département **/
	private String codeDep;
	
	/** La population totale du département **/
	private int population;

	/**
	 * Constructeur pour le département
	 * @param codeDep : code du département
	 * @param population : nombre d'habitant total
	 */
	public Departement(String codeDep, int population) {
		super();
		this.codeDep = codeDep;
		this.population = population;
	}
	
	/**
	 * Affichage du département
	 * @return une chaine de caractère avec le code du département et sa population totale
	 */
	@Override
	public String toString() {
		return codeDep + " (" + population + " hab.)";
	}

	/**
	 * Getter pour le code du département
	 * @return le code du département
	 */
	public String getCodeDep() {
		return codeDep;
	}

	/**
	 * Getter pour le nombre d'habitants total du département
	 * @return le nombre d'habitant
	 */
	public int getPopulation() {
		return population;
	}
	
}
