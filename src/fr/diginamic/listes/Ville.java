package fr.diginamic.listes;

import java.util.Comparator;

public class Ville {
	
	private String nom;
	private int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	@Override
	public String toString() {
		return nom + " (" + nbHabitants + " hab.)";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	
}
