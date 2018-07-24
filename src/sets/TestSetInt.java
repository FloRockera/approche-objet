package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetInt {

	public static void main(String[] args) {

		// Instancier un HashSet
		Set<Integer> set = new HashSet<Integer>();
		set.add(-1);
		set.add(5);
		set.add(7);
		set.add(3);
		set.add(-2);
		set.add(4);
		set.add(8);
		set.add(5);

		// Afficher tous les éléments de la liste
		System.out.println(set);
		// On constate que le "5" qui est un doublon n'apparait qu'une seule fois, le HashSet ne gère pas les doublons

		// Recherchez le plus petit élément de la liste.
		// Utiliser l'iterator avec la méthode .hasNext() et .next()
		Iterator<Integer> iterator = set.iterator();

		// checking the next element availabilty
		int min =  Integer.MAX_VALUE;
		while (iterator.hasNext()){

			// moving cursor to next element
			int i = (Integer)iterator.next();
			if (i < min ) { 
				min = i;

			}
		}
		System.out.println(min);


		
		// Recherchez le plus grand élément de la liste.
		Iterator<Integer> iterator2 = set.iterator();

		int max =  Integer.MIN_VALUE;
		while (iterator2.hasNext()){

			int i = (Integer)iterator2.next();
			if (i > max ) { 
				max = i;

			}
		}
		System.out.println(max);

		
		// Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs.
		Iterator<Integer> iterator3 = set.iterator();

		while (iterator3.hasNext()){

			int i = (Integer)iterator3.next();
			if (i < 0 ) { 
				i = -i;

			}
		}
		System.out.println(set);
		
		/* Set<Pays> paysSet = new HashSet<Pays>();
        paysSet.add(new Pays("USA", 324_811_000, 55_805.204));
        paysSet.add(new Pays("France", 67_795_000, 41_180.697));
        paysSet.add(new Pays("Allemagne", 82_800_000, 45_888.423));
        paysSet.add(new Pays("UK", 65_648_100, 41_158.909));
        paysSet.add(new Pays("Italie", 60_589_445, 35_708));
        paysSet.add(new Pays("Japon", 126_451_398, 41_300));
        paysSet.add(new Pays("Chine", 1_415_140_963, 14_107.431));
        paysSet.add(new Pays("Russie", 146_880_400, 24_026));
        paysSet.add(new Pays("Inde", 1_281_935_911, 5_855.306)); */



	}
}
