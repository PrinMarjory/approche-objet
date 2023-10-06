package entites;
import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		//Instanciation adresse
		AdressePostale adr = new AdressePostale();
		adr.numeroRue = 29;
		adr.libelleRue = "rue des Lilas";
		adr.codePostal = 44000;
		adr.ville = "Nantes";
		
		//Instanciation personne 1
		Personne pers1 = new Personne();
		pers1.nom = "PRIN";
		pers1.prenom = "Marjory";
		pers1.adresse = adr;
		
		//Instanciation personne 1
		Personne pers2 = new Personne();
		pers2.nom = "DUPONT";
		pers2.prenom = "François";
		pers2.adresse = adr;

	}

}
