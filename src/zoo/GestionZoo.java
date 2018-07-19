package zoo;

public class GestionZoo {

	public static void main(String[] args){

		Zoo zoo1 = new Zoo("Beauval");
		
		//1ere maniere d'instancier zoo
		Zone zoneCarnivore = zoo1.getZoneCar();
		zoneCarnivore.addAnimal(new Animal("toto","Taureau"));
		zoneCarnivore.addAnimal(new Animal("kiki","Lion"));
		
		//2e maniere d'instancier zoo BONNE PRATIQUE
		zoo1.getZoneCar().addAnimal(new Animal("toto","Taureau"));
		zoo1.getZoneCar().addAnimal(new Animal("kiki","Lion"));

		//Compter le nombre d'animaux présents dans le zoo
		System.out.println(zoo1.getZoneCar().getNombre());	

	}
}
