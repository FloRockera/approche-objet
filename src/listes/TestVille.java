package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

	public static void main(String[] args) {

		// Instancier une ArrayList de String
		List <Ville> maListe3 = new ArrayList <Ville>();
		Ville v1 = new Ville ("Nice",343000);
		maListe3.add(v1);
		Ville v2 = new Ville ("Carcassonne",47800);
		maListe3.add(v2);
		Ville v3 = new Ville ("Narbonne",53400);
		maListe3.add(v3);
		Ville v4 = new Ville ("Lyon",484000);
		maListe3.add(v4);
		Ville v5 = new Ville ("Foix",9700);
		maListe3.add(v5);
		Ville v6 = new Ville ("Pau",77200);
		maListe3.add(v6);
		Ville v7 = new Ville ("Marseille",850700);
		maListe3.add(v7);
		Ville v8 = new Ville ("Tarbes",40600);
		maListe3.add(v8);

		// Afficher tous les élements de la liste
		System.out.println(maListe3);


		// Rechercher la plus grande ville
		int max =  Integer.MIN_VALUE;
		String maxVille = null;
		for (int i = 0; i < maListe3.size(); i++) {
			Ville ville =  maListe3.get(i);
			// Utiliser la noatation pointée pour comparer le max à la variable nbHab
			if (max < ville.getnbHab()){
				max = ville.getnbHab();
				maxVille = ville.getNom();
			}
		}
		System.out.println(maxVille);


		// Rechercher la plus petite ville
		int min =  Integer.MAX_VALUE;
		String minVille = null;
		for (int i = 0; i < maListe3.size(); i++) {
			Ville ville =  maListe3.get(i);
			// Utiliser la noatation pointée pour comparer le max à la variable nbHab
			if (min > ville.getnbHab()){
				min = ville.getnbHab();
				minVille = ville.getNom();
			}
		}
		System.out.println(minVille);


		// Mettez en majuscules le nom des villes de plus de 100000 habitants
		for (int i = 0; i < maListe3.size(); i++) {
			Ville ville =  maListe3.get(i);
			if (ville.getnbHab() > 100000){
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
			
		// Méthode toString avec "sources Generate toString" pour faire un syso dans la classe de la variable (ici "Ville")
		System.out.println(maListe3);
		
	}
}