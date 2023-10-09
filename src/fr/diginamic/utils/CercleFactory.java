package fr.diginamic.utils;
import fr.diginamic.entites.Cercle;

/**
 * Creation d'un Cercle à partir d'un rayon
 * @author Marjory PRIN
 */
public class CercleFactory {
	
	public static Cercle createCercle(double rayon) {
		return new Cercle(rayon);
	}
}
