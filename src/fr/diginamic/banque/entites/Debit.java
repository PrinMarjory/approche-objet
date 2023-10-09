/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * Représente une opération de débit
 * @author Marjory PRIN
 */
public class Debit extends Operation {

	/**
	 * Constructeur prenant en paramètre la date de l'opération et son montant
	 * @param date : date de l'opération
	 * @param montant : montant de l'opération
	 */
	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	public String getType() {
		return "DEBIT";
	}
	
	public void addOperation(Compte cpt) {
		double solde = cpt.getSoldeCompte();
		cpt.setSoldeCompte(solde - this.getMontant());
	}
}
