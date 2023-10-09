package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;


public class TestBanque {

	public static void main(String[] args) {
		Compte monCompte = new Compte("de1486ft45", 1200.00);
		
		System.out.println(monCompte);
	}

}
