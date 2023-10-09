package fr.diginamic.banque;
import fr.diginamic.banque.entites.*;

public class TestOperation {

	public static void main(String[] args) {
		Compte monCompte = new Compte("GF159408", 1500.00);
		Credit op1 = new Credit("23/10/2023", 15.00);
		Debit op2 = new Debit("24/10/2023", 3.50);
		Debit op3 = new Debit("24/10/2023", 5.00);
		Credit op4 = new Credit("25/10/2023", 20.00);
		
		Operation[] operations = {op1, op2, op3, op4};
		
		System.out.println("Solde initial du compte " + monCompte.getNumeroCompte() + " : " + monCompte.getSoldeCompte() + "€\n");
		
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
			operations[i].addOperation(monCompte);
			System.out.println("Nouveau solde : " + monCompte.getSoldeCompte() + "€\n");
		}
		
	}

}
