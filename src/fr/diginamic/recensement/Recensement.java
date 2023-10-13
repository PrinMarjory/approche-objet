package fr.diginamic.recensement;
import java.util.ArrayList;

public class Recensement {
	
	/** la liste de toutes le villes du recensement **/
	private ArrayList<Ville> listVilles;

	/**
	 * Constructeur de recensement
	 */
	public Recensement(ArrayList<Ville> listVilles) {
		super();
		this.listVilles = listVilles;
	}

	/**
	 * Getter pour la liste de ville
	 * @return la liste de ville
	 */
	public ArrayList<Ville> getListVilles() {
		return listVilles;
	}
	
	
	
	
	
}
