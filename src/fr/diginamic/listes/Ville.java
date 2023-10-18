package fr.diginamic.listes;

import java.util.Comparator;
import java.util.Objects;

import fr.diginamic.utils.Format;

public class Ville {
	
	private String nom;
	private int nbHabitants;
	private Continent continent;
	
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	public Ville(String nom, int nbHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}
	
	@Override
	public String toString() {
		return nom + " (" + Format.bigInt(nbHabitants) + " hab.) " + continent.getLibelle().toUpperCase();
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
	
	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) object;
		return Objects.equals(nom, other.getNom()) && nbHabitants == other.nbHabitants;
	}

	
}
