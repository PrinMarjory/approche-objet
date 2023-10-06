package entites;


/** 
 * Représente une personne 
 * @author Marjory PRIN
 */
public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;
	
	/**
	 * Constructeur
	 * @param nom
	 * @param prenom
	 */
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/**
	 * Constructeur
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	/** Affichage du nom en majuscule et prénom */
	public void print() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}
	
	/**
	 * Setter pour le nom
	 * @param nom : nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Setter pour le prénom
	 * @param prenom : prénom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Setter pour l'adresse
	 * @param adresse
	 */
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * Getter pour le nom
	 * @return le nom de la personne
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Getter pour le prénom
	 * @return le prénom de la personne
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	 * Getter pour l'adresse
	 * @return l'adresse de la personne
	 */
	public AdressePostale getAdresse() {
		return this.adresse;
	}
}