/**
 * 
 */
package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/**
 * Tests de la classe Cercle
 * @author Marjory PRIN
 */
public class TestCercle {
	
	public static void main(String[] args) {
		Cercle c1 = CercleFactory.createCercle(5);
		Cercle c2 = CercleFactory.createCercle(10);
		
		
		System.out.println("CERCLE 1 :\nRayon : " + c1.getRayon() + "mm\nPérimètre : " + c1.getPerimetre() + "mm\nSurface: " + c1.getSurface() + "mm");
		System.out.println("\n--------------------------------------\n");
		System.out.println("CERCLE 2 :\nRayon : " + c2.getRayon() + "mm\nPérimètre : " + c2.getPerimetre() + "mm\nSurface: " + c2.getSurface() + "mm");
	

	}
}
