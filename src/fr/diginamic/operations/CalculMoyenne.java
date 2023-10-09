package fr.diginamic.operations;

/**
 * Permet de calculer une moyenne à partir d'un tableau de valeurs
 * @author Marjory PRIN
 */
public class CalculMoyenne {
	/**
	 * Tableau contenant les valeurs 
	 */
	private static double[] valeurs;
	
	
	public static void clear() {
		valeurs = new double[0];
	}
	
	public static void ajout(double a) {
		double[] temp = new double [valeurs.length + 1];
		for (int i = 0; i < valeurs.length; i++) {
			temp[i] = valeurs [i];
		}
		temp[valeurs.length] = a;
		valeurs = temp;
	}
	
	public static double calcul() {
		double moyenne = valeurs[0];
		
		for (int i = 1; i<valeurs.length; i++) {
			moyenne = moyenne + valeurs[i];
		} 

		return moyenne/valeurs.length;
	}
	
}
