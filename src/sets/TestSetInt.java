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
				System.out.println(i);
			}
		}
		
	

	}
}
