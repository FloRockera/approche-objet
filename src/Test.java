
public class Test {

	public static void main(String[] args) {

		
		// 3 m�canismes � apprendre par coeur
		
// Appeler la m�thode String d'une autre classe, cr�er une variable de son type String. METHODE STATIC on l'invoque sur le nom de la classe
		// 2e �tape, on rajoute a gauche la d�claration d'une variable 
		
		
		String resultat = StringUtils.format(1.5,"0.00");
		
// Appeler une methode. Si elle n'est pas static alors on doit cr�er une variable avant
		
		/*Dans la classe Banque il y a
		public Banque(String nom){
		super();
		this.nom=nom;
		public void addCompteBancaire....*/
		
		Banque banque = new Banque("BNP");
		banque.addCompteBancaire(new CompteBancaire()); // cr�er � la vol�e un param�tre, la m�thode est void dans la classe mere
		
//Invoquer la m�thode getNom
		String a = banque.getNom();
		
		
		
		
		
		
	}

}
