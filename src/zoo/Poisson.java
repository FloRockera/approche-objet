package zoo;

public class Poisson extends Animal {

	//constructeur
	public Poisson(String nvnom, String nvtype, String nvalimentation){
		super(nvnom, nvtype, nvalimentation);
		

	}

	@Override
	public String getFamille() {
		// TODO Auto-generated method stub
		return "POISSON";
	}
}
