package fr.diginamic.salaire;

/**
 * Représente une personne travaillant pour la société "La Voix de Saint-Herblain"
 * @author Marjory PRIN
 */
public abstract class Intervenant {
	
	/** Nom de l'intervenant */
	private String nom;
	
	/** Prénom de l'intervenant */
	private String prenom;
	
	/**
	 * Constructeur qui prends en paramètre le nom et le prénom
	 * @param nom : nom de l'intervenant
	 * @param prenom : prénom de l'intervenant
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public void afficherDonnees() {
		System.out.println(getNom() + " " + getPrenom() + " " + getType() + ": " + getSalaire() + "€");
	}
	
	/**
	 * Getter pour le nom
	 * @return le nom en majuscule
	 */
	public String getNom() {
		return nom.toUpperCase();
	}
	
	/**
	 * Getter pour le prénom
	 * @return le prénom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Getter pour le salaire
	 * @return le salaire en €
	 */
	public abstract double getSalaire();
	
	/**
	 * Getter pour le type d'intervenant
	 * @return le type d'intervenant
	 */
	public abstract String getType();
}
