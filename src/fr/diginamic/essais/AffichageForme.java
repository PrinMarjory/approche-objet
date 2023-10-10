package fr.diginamic.essais;
import fr.diginamic.formes.*;

/**
 * Permet l'affichage du périmètre et de la surface d'une forme
 * @author Marjory PRIN
 */
public class AffichageForme {
	/**
	 * Affichage de la surface et du périmètre d'une forme
	 * @param f : l'objet Forme
	 */
	 public static void afficher(Forme f) {
		 System.out.println("Périmètre: " + f.calculerPerimetre() + "mm\nSurface: " + f.calculerSurface() + "mm2");
	 }
}
