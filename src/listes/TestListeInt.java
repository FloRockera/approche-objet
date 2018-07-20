package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestListeInt {

	public static void main(String[] args) {

		// Instancier une ArrayList d’entiers
		List<Integer> maListe = new ArrayList<Integer>();
		int ani1 = -1;
		// On peut aussi éviter de passer par une variable intermédiaire
		// maListe.add(-1);
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

		// Afficher tous les élements de la liste
		System.out.println(maListe);

		// Rechercher le plus petit et le plus grand élément de la liste
		int maxVal = Integer.MIN_VALUE; // Faire partir de la plus petite valeur
		int minVal = Integer.MAX_VALUE; // Faire partir de la plus haute valeur
		for (int i = 0; i < maListe.size(); i++) {
			if (maListe.get(i) < minVal) {
				minVal = maListe.get(i);
			}
			if (maListe.get(i) > maxVal) {
				maxVal = maListe.get(i);
			}
		}
		System.out.println("La plus grande valeur de la liste est : " + maxVal);
		System.out.println("La plus petite valeur de la liste est : " + minVal);

		// Rechercher les éléments négatifs et les modifier en entiers positifs

		for (int i = 0; i < maListe.size(); i++) {
			int nb = maListe.get(i);
			if (nb < 0) {
				nb = -nb / 1;
			}
			System.out.println(nb);
		}
		
	}
}
