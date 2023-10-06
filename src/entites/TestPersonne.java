package entites;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale(29, "rue des Lilas", 44000, "Nantes");
		AdressePostale adr2 = new AdressePostale(12, "rue des Violettes", 35000, "Rennes");
		Personne pers1 = new Personne("Prin", "Marjory", adr1);
		Personne pers2 = new Personne("Dupont", "François", adr1);
		Personne pers3 = new Personne("Leblanc", "Sophie");
		
		pers1.afficher();
		pers3.modifierAdresse(adr2);
		pers3.afficherAdresse();
	}

}
