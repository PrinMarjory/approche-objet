package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		// Date du jour
		Date d1 = new Date(123, 9, 17);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date du jour : " + formateur.format(d1));
		
		// Date du 19/05/2016 à 23:59:30
		Date d2 = new Date(116, 4, 19, 23, 59, 30);
		formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Nouvelle date : " + formateur.format(d2));
		
		// Date et heure système
		Date d3 = new Date();
		System.out.println("Date système : " + formateur.format(d3));
	}

}
