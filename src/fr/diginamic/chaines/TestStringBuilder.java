package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
	///////////////// METHODE STRINGBUILDER ///////////////////
		
		// Instanciation d'un StringBuilder
		StringBuilder builder = new StringBuilder();
		
		// Début chrono
		long debut = System.currentTimeMillis();
		
		// Ajout desnombre de 1 à 100 000 dans le StringBuilder
		for (int i = 1; i<100000; i++) {
			builder.append(i);
		}
		
		// Fin chrono
		long fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes (avec StringBuilder): " + (fin - debut) + "ms");
		
	///////////////// METHODE AVEC + ///////////////////
		
		// Initialisation de la chaine
		String s = "";
		
		// Début chrono
		debut = System.currentTimeMillis();
		
		// Ajout desnombre de 1 à 100 000 dans le StringBuilder
		for (int i = 1; i<100000; i++) {
			s += i;
		}
		
		// Fin chrono
		fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes (sans StringBuilder): " + (fin - debut) + "ms");
	}

}
