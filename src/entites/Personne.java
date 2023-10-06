package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public void afficher() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}
	
	public void modifierNom(String nom) {
		this.nom = nom;
	}
	
	public void modifierPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void modifierAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	public void afficherNom() {
		System.out.println("Nom :" + this.nom);
	}
	
	public void afficherPrenom() {
		System.out.println("Prénom :" + this.prenom);
	}
	
	public void afficherAdresse() {
		this.adresse.afficherAdresse();
	}
}