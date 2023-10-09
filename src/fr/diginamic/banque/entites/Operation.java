/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * Représente une opération bancaire, crédit ou débit.
 * @author Marjory PRIN
 */
public abstract class Operation {
	private String date;
	private double montant;
	
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}
	
	@Override
	public String toString() {
		return "Date: " + date + " Montant : " + montant + "€ " + getType();
	}
	
	/**
	 * @return la date de l'opération
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return le montant de l'opération
	 */
	public double getMontant() {
		return montant;
	}
	
	public abstract String getType();
	
	public abstract void addOperation(Compte cpt);
}
