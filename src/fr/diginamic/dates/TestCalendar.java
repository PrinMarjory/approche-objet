package fr.diginamic.dates;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		
		// Création de la date
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		
		// Formatage et affichage de la date
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date : " + formateur.format(date));
		
		// Récupération date du jour
		cal = Calendar.getInstance();
		Date dateJour = cal.getTime();
		formateur = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		System.out.println("Date du jour : " + formateur.format(dateJour));
		
		// Affichage en français
		formateur = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
		System.out.println("Date du jour en français : " + formateur.format(dateJour));
		
		// Affichage en russe
		Locale russie = new Locale("ru", "RU");
		formateur = new SimpleDateFormat("EEEEE dd MMMMM yyyy", russie);
		System.out.println("Date du jour en russe : " + formateur.format(dateJour));
		
		// Affichage en chinois
		formateur = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINA);
		System.out.println("Date du jour en chinois : " + formateur.format(dateJour));
	}

}
