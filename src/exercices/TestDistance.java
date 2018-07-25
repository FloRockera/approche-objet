package exercices;

import entites.AdressePostale;
import entites.Personne;

public class TestDistance {

	public static void main(String[] args) {
		
		//1. Il faut déjà instancier les points pour les passer en paramètres
		// 2. Puis invocation de la méthode
		
		
		DistanceCalculator d = new DistanceCalculator();
		
		Point pa = new Point(0,0);
		Point pb = new Point (2,1);
		
		Distance var = d.calculeDistance(pa, pb);
		
		
		System.out.println(var.getValue());
		
	}

}
