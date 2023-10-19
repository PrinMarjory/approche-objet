package fr.diginamic.sets;

import fr.diginamic.annotations.ToString;
import fr.diginamic.utils.StringUtils;

public class Pays {
	
	@ToString(separateur = ": ", upperCase = true)
	private String nom;
	
	@ToString(separateur = " hab.", upperCase = false)
	private int nbHabitant;
	
	private double pib; //par habitant
	
	public Pays(String nom, int nbHabitant, double pib) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pib = pib;
	}

//	toString sans annotation
//	@Override
//	public String toString() {
//		return nom + "(" + nbHabitant + " hab, PIB: " + pib + " USD/hab)";
//	}
	
	@Override
	public String toString() {
		return StringUtils.generateToString(this);
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
