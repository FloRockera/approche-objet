package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import listes.Ville;

public class TestPays {

	public static void main(String[] args) {

		// HashSet de pays
		Set<Pays> paysSet = new HashSet<Pays>();
		paysSet.add(new Pays("USA", 324_811_000, 55_805.204));
		paysSet.add(new Pays("France", 67_795_000, 41_180.697));
		paysSet.add(new Pays("Allemagne", 82_800_000, 45_888.423));
		paysSet.add(new Pays("UK", 65_648_100, 41_158.909));
		paysSet.add(new Pays("Italie", 60_589_445, 35_708));
		paysSet.add(new Pays("Japon", 126_451_398, 41_300));
		paysSet.add(new Pays("Chine", 1_415_140_963, 14_107.431));
		paysSet.add(new Pays("Russie", 146_880_400, 24_026));
		paysSet.add(new Pays("Inde", 1_281_935_911, 5_855.306));

		// Recherchez le pays avec le PIB/habitant le plus important
		Iterator<Pays> iterator = paysSet.iterator();

		double max =  Integer.MIN_VALUE;
		String nomPays = null;

		while (iterator.hasNext()){
			Pays i = iterator.next();
			if (max < i.getPib() ) { 
				max = i.getPib();
				nomPays = i.getNom();


			}
		}

		System.out.println(nomPays);



		//Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
		Iterator<Pays> iterator2 = paysSet.iterator();

		double min =  Integer.MAX_VALUE;
		String minPays = null;

		while (iterator2.hasNext()){
			Pays i = iterator2.next();
			if (min > i.getPib() ) { 
				min = i.getPib();
				minPays= i.getNom();
			}
		}

		System.out.println(minPays);
		
		
		
		System.out.println("=================================================");
		
		

		//Affichez l’ensemble des pays ainsi modifiés avec leur nom, nombre d’habitants et PIB total

		iterator = paysSet.iterator();
		while (iterator.hasNext()){
			Pays pays = iterator.next();
			if (pays.getNom().equals(minPays)) { 
				pays.setNom(minPays.toUpperCase());
			}
		}

		System.out.println(paysSet);
	}

}
