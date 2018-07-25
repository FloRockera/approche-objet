package exercices;

import entites.AdressePostale;
import entites.Personne;

public class TestDistance {

	public static void main(String[] args) {
		
		//1. Il faut d�j� instancier les points pour les passer en param�tres
		// 2. Puis invocation de la m�thode
		
		
		DistanceCalculator d = new DistanceCalculator();
		
		Point pa = new Point(0,0);
		Point pb = new Point (2,1);
		
		Distance var = d.calculeDistance(pa, pb);
		
		
		System.out.println(var.getValue());
		
	}

}
