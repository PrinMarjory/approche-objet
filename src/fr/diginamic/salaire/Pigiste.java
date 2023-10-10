package fr.diginamic.salaire;

/**
 * Représente un pigiste du journal, indépendant intervenant pour de courte durées
 * @author Marjory PRIN
 */
public class Pigiste extends Intervenant {

	/** Nombre de jours travaillés dans le mois */
	private int nbJours;
	
	/** Le montant de la rémunération journalière en € */
	private double montantJour;
	
	/**
	 * Constructeur qui prends en paramètre le nom, le prénom, le  nb de jours travaillés et le montant de la rémunération journalière
	 * @param nom : nom du pigiste
	 * @param prenom : prénom du pigiste
	 * @param nbJours : nb de jours travaillés
	 * @param montantJour : montant de la rémunération journalière (en €)
	 */
	public Pigiste(String nom, String prenom, int nbJours, double montantJour) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.montantJour = montantJour;
	}

	/**
	 * Getter pour le salaire du pigiste
	 * @return le salaire mensuel en €
	 */
	@Override
	public double getSalaire() {
		return nbJours*montantJour;
	}
	
	/**
	 * Getter pour le type d'intervenant
	 * @return le type Pigiste
	 */
	@Override
	public String getType() {
		return "PIGISTE";
	}


}
