package fr.diginamic.essais;
import fr.diginamic.formes.*;

/**
 * Test des classes et sous-classe de Forme
 * 
 * @author Marjory PRIN
 */
public class TestForme {
	
	public static void main(String[] args) {
		
		//Initialisation
		Cercle cercle1 = new Cercle(5);
		Rectangle rectangle1 = new Rectangle(10,25);
		Carre carre1 = new Carre(3);
		
		//Affichage
		System.out.println("CERCLE DE RAYON 5mm : ");
		AffichageForme.afficher(cercle1);
		
		System.out.println("---------------------------------");
		System.out.println("RECTANGLE DE LARGEUR 10mm ET LONGUEUR 25mm : ");
		AffichageForme.afficher(rectangle1);
		
		System.out.println("---------------------------------");
		System.out.println("CARRE DE LONGUEUR 3mm : ");
		AffichageForme.afficher(carre1);
	}
}
