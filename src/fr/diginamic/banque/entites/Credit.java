/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * Représente une opération de crédit
 * @author Marjory PRIN
 */
public class Credit extends Operation {

	/**
	 * Constructeur prenant en paramètre la date de l'opération et son montant
	 * @param date : date de l'opération
	 * @param montant : montant de l'opération
	 */
	public Credit(String date, double montant) {
		super(date, montant);
	}
	
	public String getType() {
		return "CREDIT";
	}
	
	public void addOperation(Compte cpt) {
		double solde = cpt.getSoldeCompte();
		cpt.setSoldeCompte(solde + this.getMontant());
	}
}
