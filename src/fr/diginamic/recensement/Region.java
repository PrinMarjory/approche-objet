package fr.diginamic.recensement;
import java.util.ArrayList;

public class Region {
	
	/** la liste de toutes le villes de la région **/
	private ArrayList<Ville> listVilles;
	
	/** le nom de la région **/
	private String nomRegion;
	
	/** le code de la région **/
	private int codeRegion;

	/**
	 * Constructeur de Region
	 * @param listVilles : liste des villes de la région
	 * @param nomRegion : nom de la région
	 * @param codeRegion : code de la région
	 */
	public Region(ArrayList<Ville> listVilles, String nomRegion, int codeRegion) {
		super();
		this.listVilles = listVilles;
		this.nomRegion = nomRegion;
		this.codeRegion = codeRegion;
	}
	
	/**
	 * Affichage de la liste de ville
	 * @return la liste des villes
	 */
	@Override
	public String toString() {
		String toString = "";
		for (Ville v : listVilles) {
			toString += v.toString() + "\n";
		}
		return toString;
	}

	/**
	 * Getter pour la liste des villes de la région
	 * @return la liste des villes
	 */
	public ArrayList<Ville> getListVilles() {
		return listVilles;
	}
	
	/**
	 * Getter pour le nom de la région
	 * @return le nom de la région
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Getter pour le code de la région
	 * @return le code de la region
	 */
	public int getCodeRegion() {
		return codeRegion;
	}
	
}
