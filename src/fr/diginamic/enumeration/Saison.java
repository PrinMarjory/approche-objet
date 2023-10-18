package fr.diginamic.enumeration;

public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	private String libelle;
	private int ordre;
	
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getOrdre() {
		return ordre;
	}
	
	public static Saison getInstance(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison s: saisons) {
			if (s.libelle == libelle) {
				return s;
			}
		}
		throw new IllegalArgumentException(String.valueOf(libelle));
	}
}
