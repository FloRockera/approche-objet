package zoo;

public class Zoo {

	// Attributs
	private String nom;
	private Zone zoneAfr;
	private Zone zoneCar;
	private Zone zoneAqu;
	private Zone zoneRep;
	private Zone zoneVol;

	// Constructeur
	public Zoo(String nvnom) {
		nom = nvnom;
		zoneAfr = new Zone("Savane Africaine");
		zoneCar = new Zone("zone carnivore");
		zoneAqu = new Zone("Aquarium");
		zoneRep = new Zone("Ferme aux Reptiles");
		zoneVol = new Zone("Volière");
	}

	// Methode addAnimal
	public void addAnimal(Animal animal) {
		if (animal.getAlimentation().equals("carnivore") && animal.getFamille().equals("MAMMIFERE")) {
			zoneCar.addAnimal(animal);
		} else if (animal.getAlimentation().equals("herbivore") && animal.getFamille().equals("MAMMIFERE")) {
			zoneAfr.addAnimal(animal);
		} else if (animal.getFamille().equals("REPTILE")) {
			zoneRep.addAnimal(animal);
		} else if (animal.getFamille().equals("POISSON")) {
			zoneAqu.addAnimal(animal);
		} else if (animal.getFamille().equals("VOLATILE")) {
			zoneVol.addAnimal(animal);
		}
	}

	// Getters Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Zone getZoneAfr() {
		return zoneAfr;
	}

	public void setZoneAfr(Zone zoneAfr) {
		this.zoneAfr = zoneAfr;
	}

	public Zone getZoneCar() {
		return zoneCar;
	}

	public void setZoneCar(Zone zoneCar) {
		this.zoneCar = zoneCar;
	}

	public Zone getZoneAqu() {
		return zoneAqu;
	}

	public void setZoneAqu(Zone zoneAqu) {
		this.zoneAqu = zoneAqu;
	}

	public Zone getZoneRep() {
		return zoneRep;
	}

	public void setZoneRep(Zone zoneRep) {
		this.zoneRep = zoneRep;
	}

	public Zone getZoneVol() {
		return zoneVol;
	}

	public void setZoneVol(Zone zoneVol) {
		this.zoneVol = zoneVol;
	}

}