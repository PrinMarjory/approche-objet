package fr.diginamic.fichier;

public class Ville {
	
	private String nomVille;
	private String codeDep;
	private String nomRegion;
	private int population;
	
	public Ville(String nomVille, String codeDep, String nomRegion, int population) {
		super();
		this.nomVille = nomVille;
		this.codeDep = codeDep;
		this.nomRegion = nomRegion;
		this.population = population;
	}

	@Override
	public String toString() {
		return nomVille + " (" + codeDep + ": " + nomRegion.toUpperCase() + ") " + population + " hab.";
	}

	public String getNomVille() {
		return nomVille;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public int getPopulation() {
		return population;
	}
	
}
