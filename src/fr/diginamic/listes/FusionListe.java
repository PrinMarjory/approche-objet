package fr.diginamic.listes;
import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		
		//LISTE 1
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		//LISTE 2
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		//LISTE 3 (fusion des deux premières listes)
		List<String> liste3 = new ArrayList<>();
		for (int i = 0; i<liste1.size(); i++) {
			liste3.add(liste1.get(i));
		}
		for (int i = 0; i<liste2.size(); i++) {
			liste3.add(liste2.get(i));
		}
		
		System.out.println("Liste3 : " + liste3);

	}

}
