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
		p.adresse.ville= "Laval"; */

		//Il faut garder 3 paramètres
		Personne p = new Personne("Dudule","Michel",new AdressePostale(5,"rue de Paris",53000,"Laval"));
				/*ou
		Personne p = new Personne("Dudule","Michel",adresse);
		
		*"p" est une instance */
	}

}
