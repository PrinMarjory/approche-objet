/**
 * 
 */
package fr.diginamic.chaines;
import fr.diginamic.entites.Salarie;

/**
 * Exercices de manipulation de chaines de caractères
 * @author Marjory PRIN
 */
public class ManipulationChaine {

	public static void main(String[] args) {
		
		//Initialisation
		String chaine = "Durand;Marcel;2 523.5";
		System.out.println("Chaine exemple: " + chaine + "\n-----------------------------------------");
		
		//Affichage du 1er caractère
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		//Affichage de la la longueur de la chaine
		int longueurChaine = chaine.length();
		System.out.println("Longueur de la chaine: " + longueurChaine);
		
		//Affichage de l'index du premier ";" contenu dans la chaine
		int indexPremierSeparateur = chaine.indexOf(';');
		System.out.println("Index du premier \";\": " + indexPremierSeparateur);

		//Affichage du nom de famille
		String nomDeFamille = chaine.substring(0, chaine.indexOf(';'));
		System.out.println("Nom de famille: " + nomDeFamille);
		
		//Affichage du nom de famille en majuscules
		String nomDeFamilleMajuscule = nomDeFamille.toUpperCase();
		System.out.println("En majuscules: " + nomDeFamilleMajuscule);
		
		//Affichage du nom de famille en majuscules
		String nomDeFamilleMinuscule = nomDeFamille.toLowerCase();
		System.out.println("En minuscules: " + nomDeFamilleMinuscule);
		
		//Affichage d'un tableau contenant les morceaux de la chaine de carctères
		String[] tableauChaine = chaine.split(";");
		System.out.print("Tableau des morceaux de la chaine: | ");	
		for (int i = 0; i<tableauChaine.length; i++) {
			System.out.print(tableauChaine[i] + " | ");
		}
		
		//Création d'une instance de Salarie
		double salaire = Double.parseDouble(tableauChaine[2].replaceAll(" ", ""));
		Salarie s1 = new Salarie(tableauChaine[0], tableauChaine[1], salaire);
		System.out.println("\n-----------------------------------------\n" + s1);
	}

}
