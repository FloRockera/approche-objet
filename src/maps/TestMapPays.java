package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import sets.Pays;

public class TestMapPays {

	public static void main(String[] args) {

		// HashMap de pays
		HashMap<String, Pays> pays = new HashMap<String, Pays>();

		// Le put a deux paramètres : la clé unique et la valeur (ici l'objet
		// Pays)
		pays.put("USA", new Pays("USA", 324_811_000, 55_805.204));
		pays.put("France", new Pays("France", 67_795_000, 41_180.697));
		pays.put("Allemagne", new Pays("Allemagne", 82_800_000, 45_888.423));
		pays.put("UK", new Pays("UK", 65_648_100, 41_158.909));
		pays.put("Italie", new Pays("Italie", 60_589_445, 35_708));
		pays.put("Japon", new Pays("Japon", 126_451_398, 41_300));
		pays.put("Chine", new Pays("Chine", 1_415_140_963, 14_107.431));
		pays.put("Russie", new Pays("Russie", 146_880_400, 24_026));
		pays.put("Inde", new Pays("Inde", 1_281_935_911, 5_855.306));

		// Programme qui demande un nom de pays à un utilisateur, puis qui
		// affiche les info suivantes à l’utilisateur :

		Scanner scan = new Scanner(System.in);

		System.out.println("**** Veuillez entrer un CODE PAYS : ****");
		String choix = scan.next();

		// Si le pays n’existe pas, le programme affiche un message indiquant à
		// l’utilisateur de faire un autre choix
		if (!pays.containsKey(choix)) {

			System.out.println("Ce code pays n'existe pas, veuillez saisir un nouveau code");
			String choix2 = scan.next();
		} else {

			System.out.println(pays.get(choix));
		}
	}

}
