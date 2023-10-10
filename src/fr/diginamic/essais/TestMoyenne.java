package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;

/**
 * Tests de la classe CalculMoyenne
 * @author Marjory PRIN
 */
public class TestMoyenne {
	
	public static void main(String[] args) {
		
		double result = 0.0;
		
		// Test 1
		CalculMoyenne.clear();
		CalculMoyenne.ajout(15.0);
		CalculMoyenne.ajout(2.0);	
		result = CalculMoyenne.calcul();
		System.out.println("1er test : " + result);
		
		// Test 2
		CalculMoyenne.clear();
		CalculMoyenne.ajout(5.0);
		CalculMoyenne.ajout(10.0);	
		CalculMoyenne.ajout(0.0);
		result = CalculMoyenne.calcul();
		System.out.println("2ème test : " + result);
		}
}
