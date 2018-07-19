package zoo;

public class GestionZoo {

	public static void main(String[] args){

		Zoo zoo1 = new Zoo("Beauval");

		//1ere maniere d'instancier zoo
		Zone zoneCarnivore = zoo1.getZoneCar();
		//zoneCarnivore.addAnimal(new Animal("toto","Taureau"));
		//zoneCarnivore.addAnimal(new Animal("kiki","Lion"));
		Zone zoneAfrique = zoo1.getZoneAfr();
		Zone zoneReptile = zoo1.getZoneRep();
		Zone zoneAquarium = zoo1.getZoneAqu();
		Zone zoneVolatile = zoo1.getZoneVol();

		//2e maniere d'instancier zoo BONNE PRATIQUE
		//zoo1.getZoneCar().addAnimal(new Animal("toto","Taureau"));
		//zoo1.getZoneCar().addAnimal(new Animal("kiki","Lion"));

		//Compter le nombre d'animaux présents dans le zoo
		//System.out.println(zoo1.getZoneCar().getNombre());	

		//Animal an1 = new Animal("toto","Taureau");
		//Animal an2 = new Animal("toto","Taureau");
		//System.out.println(an1.equals(an2));

		zoo1.getZoneVol().addAnimal(new Volatile("bidule","oiseau","omnivore"));
		zoo1.getZoneRep().addAnimal(new Reptile("truc","croco","carnivore"));
		zoo1.getZoneAqu().addAnimal(new Poisson("nemo","poisson clown","herbivore"));
		zoo1.getZoneAfr().addAnimal(new Mammifere("coco","girafe","herbivore"));
		
		zoo1.getZoneAfr().afficher();
		zoo1.getZoneRep().afficher();
		zoo1.getZoneAqu().afficher();
		zoo1.getZoneVol().afficher();
		
	}
}
