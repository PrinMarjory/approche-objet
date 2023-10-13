package fr.diginamic.recensement;

/**
 * Représente une ville 
 * @author Marjory PRIN
 */
public class Ville {
	
	/** le code de la région où se trouve la ville **/
	private int codeRegion;
	
	/** le nom de la région **/
	private String nomRegion;
	
	/** le code du département où se trouve la ville **/
	private String codeDepartement;
	
	/** le code de la commune où se trouve la ville **/
	private int codeCommune;
	
	/** le nom de la ville/commune **/
	private String nomCommune;
	
	/** la population totale **/
	private int population;

	/**
	 * Constructeur de Ville
	 * @param codeRegion : code de la région
	 * @param nomRegion : nom de la région
	 * @param codeDepartement : code du département
	 * @param codeCommune : code de la commune
	 * @param nomCommune : nom de la ville/commune
	 * @param population : population totale de la ville
	 */
	public Ville(int codeRegion, String nomRegion, String codeDepartement,
			int codeCommune, String nomCommune, int population) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.population = population;
	}
	
	/**
	 * Affichage d'une ville et de ses données
	 * @return le nom de la ville, son code département, son nom de région et sa population 
	 */
	@Override
	public String toString() {
		return nomCommune + " (" + codeDepartement + ") " + nomRegion.toUpperCase() + " : " + population + " hab.";
	}

	/**
	 * Getter pour le code de région
	 * @return le code de la région
	 */
	public int getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Getter pour le nom de la région
	 * @return le nom de la région
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Getter pour le code du département
	 * @return le nom du département
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * Getter pour le code de la commune
	 * @return le code de la commune
	 */
	public int getCodeCommune() {
		return codeCommune;
	}

	/**
	 * Getter pour le nom de la ville/commune
	 * @return le nom de la ville/commune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * Getter pour le nombre d'habitants total
	 * @return le nombre d'habitants
	 */
	public int getPopulation() {
		return population;
	}
	
	
}
