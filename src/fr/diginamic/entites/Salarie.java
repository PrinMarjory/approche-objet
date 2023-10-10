/**
 * 
 */
package fr.diginamic.entites;

/**
 * Représente un salarié avec son nom, son prénom et son salaire
 * @author Marjory PRIN
 */
public class Salarie {
	
	/** Le nom du salarié */
	private String nom;
	/** Le prénom du salarié */
	private String prenom;
	/** Le salaire du salarié (en €) */
	private double salaire;
	
	/**
	 * Constructeur qui prends en paramètre le nom, prénom et salaire (en €) du salarié
	 * @param nom : nom du salarié
	 * @param prenom : prénom du salarié
	 * @param salaire : salaire du salarié (en €)
	 */
	public Salarie(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	
	/**
	 * Affichage du nom, prenom et salaire du salarié
	 */
	@Override
	public String toString() {
		return "Salarié: " + nom.toUpperCase() + " " + prenom + "\nSalaire: " + salaire + "€";
	}
}

