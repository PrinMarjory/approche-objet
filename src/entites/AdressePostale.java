package entites;

/**
 * Représente une adresse postale
 * @author Marjory PRIN
 */
public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;
	
	/**
	 * Constructeur
	 * @param numeroRue : le numéro de rue
	 * @param libelleRue : le libellé de la rue
	 * @param codePostal : le code postale
	 * @param ville : la ville
	 */
	AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	/**
	 * Affichage de l'adresse complète
	 */
	public void print() {
		System.out.println("Adresse : " + this.numeroRue + " " + this.libelleRue + " " + this.codePostal + " " + this.ville.toUpperCase());
	}
}
