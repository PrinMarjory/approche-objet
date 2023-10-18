package fr.diginamic.listes;

public enum Continent {
	
	EUROPE("Europe"),
	ASIE("Asie"),
	AMERIQUE("Amérique"),
	AFRIQUE("Afrique"),
	OCEANIE("Océanie");
	
	private String libelle;
	
	private Continent (String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
	
}
