
public class Test {

	public static void main(String[] args) {

		
		// 3 mécanismes à apprendre par coeur
		
// Appeler la méthode String d'une autre classe, créer une variable de son type String. METHODE STATIC on l'invoque sur le nom de la classe
		// 2e étape, on rajoute a gauche la déclaration d'une variable 
		
		
		String resultat = StringUtils.format(1.5,"0.00");
		
// Appeler une methode. Si elle n'est pas static alors on doit créer une variable avant
		
		/*Dans la classe Banque il y a
		public Banque(String nom){
		super();
		this.nom=nom;
		public void addCompteBancaire....*/
		
		Banque banque = new Banque("BNP");
		banque.addCompteBancaire(new CompteBancaire()); // créer à la volée un paramètre, la méthode est void dans la classe mere
		
//Invoquer la méthode getNom
		String a = banque.getNom();
		
		
		
		
		
		
	}

}
