package entites;

public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;
	
	AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public void afficherAdresse() {
		System.out.println("Adresse : " + this.numeroRue + " " + this.libelleRue + " " + this.codePostal + " " + this.ville.toUpperCase());
	}
}
