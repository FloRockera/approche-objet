package zoo;

public abstract class Animal {

	//Attributs en privé (bonnes pratiques)
	private String nom;
	private String type;
	private String alimentation;
	
	//Constructeur
	public Animal( String nvnom, String nvtype, String nvalimentation){
		nom = nvnom;
		type = nvtype;
		alimentation = nvalimentation;
	}

	//Methode abstraite dans la classe mere, on force les classes filles a l'avoir
	public abstract String getFamille();
	
	
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", alimentation=" + alimentation + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
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

	public String getAlimentation() {
		return alimentation;
	}

	public void setAlimentation(String alimentation) {
		this.alimentation = alimentation;
	}

}


