package fr.diginamic.entites;

/**
 * Répresente une salle de théatre
 * @author Marjory PRIN
 */
public class Theatre {
	
	/** le nom du théatre */
	private String nom;
	/** la capacité max du théatre en nb de personnes */
	private int capaciteMax;
	/** le nombre total de clients inscrits */
	private int nbClientsTotal;
	/** la recette totale du théatre en € */
	private double recetteTotale;
	
	/**
	 * Constructeur qui prends en paramètre le nom et la capacité max du théatre
	 * @param nom : nom du théatre
	 * @param capaciteMax : capacité max du théatre
	 */
	public Theatre(String nom, int capaciteMax) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
	}
	
	/**
	 * Modification de la méthode toString pour l'affichage de l'instance de théatre
	 */
	@Override
	public String toString() {
		return "Nom du théatre: " + nom 
				+ "\nCapacité max: " + capaciteMax 
				+ "\nNombre de clients total: " + nbClientsTotal
				+ "\nRecette totale: " + recetteTotale + "€\n";
	}

	/**
	 * Getter pour le nom
	 * @return le nom du théatre
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour le nom du théatre
	 * @param nom : le nom à modifié
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour la capacité max du théatre
	 * @return la capacité max en nombre de personne
	 */
	public int getCapaciteMax() {
		return capaciteMax;
	}

	/**
	 * Setter pour la capacité max du théatre
	 * @param capaciteMax : la capacité max en nombre de personne
	 */
	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	/**
	 * Getter pour le nombre de clients total
	 * @return le nombre de clients total
	 */
	public int getNbClients() {
		return nbClientsTotal;
	}

	/**
	 * Getter pour la recette totale du théatre
	 * @return la recette totale en €
	 */
	public double getRecetteTotale() {
		return recetteTotale;
	}
	
	/**
	 * Méthode pour ajouter un nombre de clients donné au nombre total de clients 
	 * et recalculer la recette totale du théatre en fonction du prix de la place
	 * @param nbClients : nombre de client à inscrire
	 * @param prixPlace : prix de la place de théatre (en €)
	 */
	public void inscrire(int nbClients, double prixPlace) {
		if (nbClients + nbClientsTotal > capaciteMax) {
			System.out.println("Le nombre de clients à inscrire dépasse la capacité max du théatre, opération annulée.\n");
		} else {
			nbClientsTotal += nbClients;
			recetteTotale += prixPlace*nbClients;
			System.out.println("Vous avez inscrit " + nbClients + " pour des places à " + prixPlace + "€, recette de l'opération : " 
					+ prixPlace*nbClients + "€\n");
		}
	}
}
