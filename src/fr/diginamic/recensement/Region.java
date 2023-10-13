package fr.diginamic.recensement;

/**
 * Représente une région avec son nom et son nombre d'habitants total
 * 
 * @author Marjory PRIN
 */
public class Region {
	
	/** Le nom de la région **/
	private String nomRegion;
	
	/** La population totale de la région **/
	private int population;

	/**
	 * Constructeur pour la région
	 * @param nomRegion : nom de la région
	 * @param population : nombre d'habitant total
	 */
	public Region(String nomRegion, int population) {
		super();
		this.nomRegion = nomRegion;
		this.population = population;
	}
	
	/**
	 * Affichage de la région
	 * @return une chaine de caractère avec le nom de la région et sa population totale
	 */
	@Override
	public String toString() {
		return nomRegion + " (" + population + " hab.)";
	}

	/**
	 * Getter pour le nom de la région
	 * @return le nom de la région
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Getter pour le nombre d'habitants total de la région
	 * @return le nombre d'habitant
	 */
	public int getPopulation() {
		return population;
	}
	
}
