package fr.diginamic.recensement;
import java.util.ArrayList;

public class Departement {
	
	/** la liste de toutes le villes du département **/
	private ArrayList<Ville> listVilles;
	
	/** le code du département **/
	private int codeDepartement;

	/**
	 * Constructeur de Departement
	 * @param listVilles : liste des villes du département
	 * @param codeDepartement : code du département
	 */
	public Departement(ArrayList<Ville> listVilles, int codeDepartement) {
		super();
		this.listVilles = listVilles;
		this.codeDepartement = codeDepartement;
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
	 * Getter pour la liste des villes du département
	 * @return la liste des villes
	 */
	public ArrayList<Ville> getListVilles() {
		return listVilles;
	}

	/**
	 * Getter pour le code du département
	 * @return le code du département
	 */
	public int getCodeDepartement() {
		return codeDepartement;
	}
	
}
