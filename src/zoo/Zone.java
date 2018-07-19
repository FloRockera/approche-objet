package zoo;

public class Zone {

	//Attributs de la zone qui contient 5 zones
	private String nom;
	private Animal[] animaux;
	private int compteur;

	//Tableau
	public Zone(String nvnom){
		nom=nvnom;
		animaux= new Animal [100];
	}

	public void afficher(){
		for (int i=0; i<animaux.length; i++){
			if (animaux[i]!= null){
				System.out.println(animaux[i]);
			}
		}
	}
	
	//Remplir le tableau
	public void addAnimal(Animal animal){
		for (int i=0; i<animaux.length; i++){
			if (animaux[i] == null){
				animaux[i] = animal;
				compteur++; // Toujours savoir le nombre d'animal 
				break;
			}
		}
	}

	public int getNombre(){
		return compteur;
	}

	//Getters Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animal[] getAnimaux() {
		return animaux;
	}

	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}



}
