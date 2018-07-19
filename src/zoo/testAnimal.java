package zoo;

public class testAnimal {

	public static void main(String[] args) {


		//Instancier un animal, on prend le set pour écrire
		
		Animal animal1 = new Animal ("mimi", "chat");
		System.out.println(animal1.getNom() + " " +animal1.getType());
		animal1.setNom("kiki");
		System.out.println(animal1.getNom() + " " + animal1.getType());


	}

}
