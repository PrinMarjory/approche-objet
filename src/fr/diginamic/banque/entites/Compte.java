package fr.diginamic.banque.entites;

/**
 * Représente un compte de dépot bancaire courant
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
		return "Numéro de compte = " + numeroCompte + ", Solde du compte = " + soldeCompte;
	}

	/**
	 * @return le numéro de compte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @return le solde du compte
	 */
	public double getSoldeCompte() {
		return soldeCompte;
	}

	
	
	

}
