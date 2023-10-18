package fr.diginamic.enumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Saison[] saisons = Saison.values();
		
		System.out.println("LES SAISONS :");
		for (Saison s: saisons) {
			System.out.println(s.getLibelle());
		}
		
		String nom = "ETE";
		Saison s = Saison.valueOf(nom);
		System.out.println("\nLibellé de ETE : " + s.getLibelle());
		
		String libelle = "Hiver";
		s = Saison.getInstance(libelle);
		System.out.println("\nInstance de Hiver : " + s);
	}

}
