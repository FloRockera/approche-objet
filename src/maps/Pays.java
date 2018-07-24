package maps;

import java.util.HashSet;
import java.util.Set;

public class Pays {

	// Attributs
	String nom;
	int nbHab;
	double pib;

	//Constructeur 
	public Pays(String nom, int nbHab, double pib) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pib = pib;
	}



	// Méthode toString
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHab=" + nbHab + ", pib=" + pib + "]";
	}


	//Getters and Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(double pib) {
		this.pib = pib;
	}



}
