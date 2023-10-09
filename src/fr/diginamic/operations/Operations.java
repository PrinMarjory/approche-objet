package fr.diginamic.operations;

/**
 * Calculer le résultat d'une operation entre deux nombre en fonction de l'opérateur donné en paramètre
 * @author marjo
 *
 */
public class Operations {

	public static double calculer(double a, double b, char operateur) {
		switch (operateur) {
			case '+':
				return a+b;
			case '-': 
				return a-b;
			case '*':
				return a*b;
			case'/':
				return a/b;
			default:
				System.out.println("Opérateur non conforme ! (+, -, *, /)");
				return 0.0;
		}
	}
}
