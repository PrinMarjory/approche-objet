package fr.diginamic.sets;

public class Pays {
	private String nom;
	private int nbHabitant;
	private double pib; //par habitant
	
	public Pays(String nom, int nbHabitant, double pib) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pib = pib;
	}

	@Override
	public String toString() {
		return nom + "(" + nbHabitant + " hab, PIB: " + pib + " USD/hab)";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}
	
	
}
