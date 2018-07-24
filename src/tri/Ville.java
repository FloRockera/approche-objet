package tri;

public class Ville implements Comparable<Ville> {

	private int habitants;
	private String nom;

	public Ville(String nom, int habitants) {
		super();
		this.nom = nom;
		this.habitants = habitants;
	}

	

	if(habitants<autre.getHabitants>())
	{
		return 1;
	}

	if(habitants>autre.getHabitants>())
	{
		return -1;
		return 0;
	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return 0;
	}

	// ou
	// return nom.compareTo(autre.getNom());
	
	
	
	//-----methode toString
	@Override
	public String toString() {
		return "Ville [habitants=" + habitants + ", nom=" + nom + "]";
	}

	
	//------Getters et setters
	public int getHabitants() {
		return habitants;
	}
	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
