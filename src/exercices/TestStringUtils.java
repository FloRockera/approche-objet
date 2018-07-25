package exercices;

import java.util.List;

import fr.pizzeria.model.Pizza;

public class TestStringUtils {

	public static void main(String[] args) {

		//----------INVOQUER UNE METHODE--------------------


		/*StringUtils str = new StringUtils();
		str.asciiArt("");*/

		// Methode static qui est Void donc on ne met pas "String str =" devant
		StringUtils.asciiArt("coucou");

		//Exercice 2
		StringUtils str = new StringUtils("HA",5);
		String s = str.repeter(); // pour stocker dans une nouvelle variable le return de la methode repeter

		System.out.println(s);
		
		
		// METHODE 1. Cas d'une méthode String "static" qui a un return String
		String s1 = StringUtils.transform("Hello");
		System.out.println(s1);
		
		// METHODE 2. Cas d'une méthode String non static qui a un return int
		StringUtils s2 = new StringUtils();
		int a = s2.toInt("2");
		System.out.println(a);
		
		
		// METHODE 3. Cas d'une méthode int non static qui a un return String
		StringUtils s3 = new StringUtils();
		String b = s3.toString(3);
		System.out.println(b);
		
	}
}



