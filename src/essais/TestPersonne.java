package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		/*Personne p = new Personne();
		p.nom="Dudule";
		p.prenom="Leon";

		p.adresse = new AdressePostale();
		p.adresse.numerodeRue= 5;
		p.adresse.libelleRue= "rue de Paris";
		p.adresse.codePostal= 53000;
		p.adresse.ville= "Laval";

	//Il faut garder 3 paramètres
		Personne p = new Personne("Dudule","Michel",new AdressePostale(5,"rue de Paris",53000,"Laval"));
		ou
		Personne p = new Personne("Dudule","Michel",adresse);

		 "p" est une instance */


		Personne p = new Personne("Jeff","Tuche",new AdressePostale(5,"rue de Paris",53000,"Laval"));
		//String identite = p.getIdentite();
		//System.out.println(identite);
		//}

		p.setNom("Daddy");
		System.out.println(p.getIdentite());
		p.setPrenom("Stephanie");
		System.out.println(p.getIdentite());
		
		AdressePostale adresseB = new AdressePostale(15,"rue de Paris",75001,"Paris");
		p.setAdressePostale(adresseB);
		System.out.println(p.getIdentite());
	}

}


