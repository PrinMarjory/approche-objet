package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		// Instanciation 1
		AdressePostale adr1 = new AdressePostale(29, "rue des Lilas", 44000, "Nantes");
		
		// Instanciation 2
		AdressePostale adr2 = new AdressePostale(12, "rue des Violettes", 35000, "Rennes");
		
		// Test
		
		adr1.print();
		adr2.print();
	}

}
