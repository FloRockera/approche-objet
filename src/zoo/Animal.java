package zoo;

public class Animal {

	//Attributs en privé (bonnes pratiques)
	private String nom;
	private String type;

	//Constructeur
	public Animal( String nvnom, String nvtype){
		nom = nvnom;
		type = nvtype;
	}

	//Getters et setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



}


