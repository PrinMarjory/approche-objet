package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;


public class TestBanque {

	public static void main(String[] args) {
		Compte monCompte = new Compte(12345678, 1256.78);
		
		System.out.println(monCompte);
	}

}
