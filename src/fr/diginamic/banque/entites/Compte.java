package fr.diginamic.banque.entites;

/**
 * Représente un compte bancaire
 * @author Marjory PRIN
 */
public class Compte {
	private String numeroCompte;
	private double soldeCompte;
	
	/**
	 * Constructeur qui prends en paramètre le numéro de compte et le solde du compte
	 * @param numeroCompte : numéro du compte bancaire
	 * @param soldeCompte : solde du compte bancaire
	 */
	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte + "]";
	}

	/**
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @return the soldeCompte
	 */
	public double getSoldeCompte() {
		return soldeCompte;
	}

	
	
	

}
