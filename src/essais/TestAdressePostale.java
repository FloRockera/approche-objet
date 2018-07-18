package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		//AdressePostale b = new AdressePostale();

		//b.numerodeRue=5;
		//b.libelleRue="rue de Paris";
		//b.codePostal=53000;
		//b.ville="Laval";

	}

	AdressePostale adresse = new AdressePostale(5,"rue de Paris",53000,"Laval");
	AdressePostale adresse2 = new AdressePostale(5,"rue de Paris",75000,"Paris");
}
