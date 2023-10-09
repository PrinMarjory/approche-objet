package fr.diginamic.banque;
import fr.diginamic.banque.entites.*;


public class TestBanque {

	public static void main(String[] args) {
		Compte monCompteCourant = new Compte("de1486ft45", 1200.00);
		CompteTaux monPEL = new CompteTaux("gy3562hk78", 5500.00, 0.05);
		
		Compte[] mesComptes = {monCompteCourant, monPEL};
		
		for (int i = 0; i < mesComptes.length; i++) {
			System.out.println(mesComptes[i]);
		}
		
	}

}
