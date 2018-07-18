package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Personne(String nvnom, String nvprenom, AdressePostale nvadresse) {
		nom = nvnom;
		prenom = nvprenom;
		adresse = nvadresse;
	}

	// methode pour afficher le nom en majuscule
	public String getIdentite() {
		return prenom + " " + nom.toUpperCase();
	}

	public AdressePostale getAdressePostale() {
		return adresse;
	}

	// methode pour permettre de retourner nom prenom adresse, methode
	// obligatoire pour l'affichage d'un objet
	public String toString() {
		return nom + " " + prenom + " " + adresse;
	}

	/*
	 * OU avec le clic droit "sources" + "generate toString()
	 * 
	 * @Override public String toString() { return "Personne [nom=" + nom +
	 * ", prenom=" + prenom + ", adresse=" + adresse + "]"; }
	 */

	// methode pour retourner le nom
	public String getnom() {
		return nom;
	}

	// methode pour retourner le prénom
	public String getprenom() {
		return prenom;
	}

	// methode pour retourner l'adresse
	public AdressePostale getadresse() {
		return adresse;
	}
	
	// methode pour modifier le nom
	public void setNom(String nvnom) {
		nom = nvnom;
	}

	// methode pour modifier le prénom
	public void setPrenom(String nvprenom) {
		prenom = nvprenom;
	}

	// methode pour modifier l'adresse
	public void setAdressePostale(AdressePostale nvadresse) {
		adresse = nvadresse;
	}

}