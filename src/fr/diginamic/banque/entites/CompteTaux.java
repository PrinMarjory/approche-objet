/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * Réprésente un compte rémunéré (ex : PEL, LDD, ...) 
 * @author Marjory PRIN
 */
public class CompteTaux extends Compte {
	private double tauxRemuneration;
	
	public CompteTaux (String numeroCompte, double soldeCompte, double tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + ", Taux de rémunération : " + tauxRemuneration;
	}
	
	
}

