package fr.diginamic.salaire;

/**
 * Représente un salarié du journal (avec un contrat CDD ou CDI) 
 * @author Marjory PRIN
 */
public class Salarie extends Intervenant {
	
	/** Salaire mensuel du salarié (en €) */
	private double salaire;
	
	/**
	 * Constructeur qui prends en paramètre le nom, le prénom et le salaire du salarié
	 * @param nom : nom du salarié
	 * @param prenom : prénom du salarié
	 * @param salaire : salaire mensuel du salarié (en €)
	 */
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	/**
	 * Getter pour le salaire du salarié
	 * @return le salaire mensuel en €
	 */
	@Override
	public double getSalaire() {
		return salaire;
	}
	
	/**
	 * Getter pour le type d'intervenant
	 * @return le type Salarié
	 */
	@Override
	public String getType() {
		return "SALARIÉ";
	}

}
