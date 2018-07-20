package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		//Instancier une ArrayList d’entiers
		List<Integer> maListe = new ArrayList<Integer>();
		int ani1 = -1;
		//On peut aussi éviter de passer par une variable intermédiaire maListe.add(-1);
		maListe.add(ani1); 
		int ani2 = 5;
		maListe.add(ani2);
		int ani3 = 7;
		maListe.add(ani3);
		int ani4 = 3;
		maListe.add(ani4);
		int ani5 = -2;
		maListe.add(ani5);
		int ani6 = 4;
		maListe.add(ani6);
		int ani7 = 8;
		maListe.add(ani7);
		int ani8 = 5;
		maListe.add(ani8);
		
		
		
		//Afficher tous les élements de la liste
		System.out.println(maListe.get());
		
		
	}

}
