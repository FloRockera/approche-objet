package listes;

import java.util.ArrayList;
import java.util.List;

public class Ville {

	// Attributs
	private String nom;
	private int nbHab;

	// Constructeurs
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}

	// Getters et Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getnbHab() {
		return nbHab;
	}

	public void setnbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHab=" + nbHab + "]";
	}

}
