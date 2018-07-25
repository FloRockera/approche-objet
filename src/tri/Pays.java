package tri;

public class Pays implements Comparable<Pays>{
	private String nom;
	private int nbHabitants;
	private double pibHabitants;
	private double calculPIB;
	
	//--------------------------------------------
			//Constructeur
	public Pays(String nom, int nbHabitants, double pibHabitants,double calculPIB) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitants = pibHabitants;
		this.calculPIB=calculPIB;
	}
	
	
	//--------------------------------------------
	//To String [formatage en sortie]
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibHabitants=" + pibHabitants + "PIB du pays = "+ calculPIB+"]";
	}

	//--------------------------------------------
	//Getter and Setter
	
	
	
	public String getNom() {
		return nom;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calculPIB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + nbHabitants;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		temp = Double.doubleToLongBits(pibHabitants);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Pays other = (Pays) obj;
		if (Double.doubleToLongBits(calculPIB) != Double.doubleToLongBits(other.calculPIB))
			return false;
		if (nbHabitants != other.nbHabitants)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (Double.doubleToLongBits(pibHabitants) != Double.doubleToLongBits(other.pibHabitants))
			return false;
		return true;
	}


	public double getCalculPIB() {
		return calculPIB;
	}


	public void setCalculPIB(double calculPIB) {
		this.calculPIB = calculPIB;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbHabitants() {
		return nbHabitants;
	}


	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}


	public double getPibHabitants() {
		return pibHabitants;
	}


	public void setPibHabitants(double pibHabitants) {
		this.pibHabitants = pibHabitants;
	}

	//--------------------------------------------
	//compare to nom
	
	
	public int compareTo(Pays name) {
		// TODO Auto-generated method stub
		Pays name1 = (Pays) name;
		int resulComparaisonNom = this.nom.compareTo(name1.getNom());
		return resulComparaisonNom;
	}
	
	//--------------------------------------------
		//Compare to pib
	
	
/*
 	public int compareTo(Pays o) {
 
		if(this.pibHabitants<o.pibHabitants)
			
		return -1;
		
		else if(o.pibHabitants<this.pibHabitants);
	
		return 1;
	}
	*/
}