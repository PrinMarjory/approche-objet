package fr.diginamic.essais;
import fr.diginamic.operations.Operations;

/**
 * Tests de la classe Operations
 * @author Marjory PRIN
 */
public class TestOperations {
	
	public static void main(String[] args) {
		double a = 5.0;
		double b = 2.0;
		
		// Test addition
		System.out.println("Addition: " + a + " + " + b + " = " + Operations.calculer(a, b, '+'));
		
		// Test soustraction
		System.out.println("Soustraction: " + a + " - " + b + " = " + Operations.calculer(a, b, '-'));
		
		// Test multiplication
		System.out.println("Multiplication: " + a + " * " + b + " = " + Operations.calculer(a, b, '*'));
		
		// Test division
		System.out.println("Division: " + a + " / " + b + " = " + Operations.calculer(a, b, '/'));
	}
}
