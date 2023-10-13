package fr.diginamic.recensement;
import java.util.Scanner;

/**
 * Représente une recherche du menu de service et l'affichage de son résultat
 * @author Marjory PRIN
 */
public abstract class MenuService {
	
	/**
	 * Traite la demande de recherche et affiche le résultat
	 * @param recensement : le recensement avec sa liste de ville
	 * @param scanner : la demande de l'utilisateur
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner);
}
