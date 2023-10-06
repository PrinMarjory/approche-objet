package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		// Instanciation 1
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 29;
		adr1.libelleRue = "rue des Lilas";
		adr1.codePostal = 44000;
		adr1.ville = "Nantes";
		
		// Instanciation 2
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 12;
		adr2.libelleRue = "rue des Violettes";
		adr2.codePostal = 35000;
		adr2.ville = "Rennes";
	}

}
