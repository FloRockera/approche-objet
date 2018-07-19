package zoo;

public class Zoo {

	//Attributs
	private String nom;
	private Zone zoneAfr;
	private Zone zoneCar;
	private Zone zoneAqu;
	private Zone zoneRep;
	private Zone zoneVol;

	//Constructeur
	public Zoo(String nvnom){
		nom = nvnom;
		zoneAfr = new Zone("Savane Africaine");
		zoneCar = new Zone("zone carnivore");
		zoneAqu = new Zone("Aquarium");
		zoneRep = new Zone("Ferme aux Reptiles");
		zoneVol = new Zone("Volière");
	}


	//Getters Setters
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