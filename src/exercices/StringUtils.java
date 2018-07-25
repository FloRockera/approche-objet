package exercices;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;



public class StringUtils {


	public static void asciiArt(String chaine){

		BufferedImage image = new BufferedImage(144, 32, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("Dialog", Font.PLAIN, 24));
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString(chaine, 6, 24);
		for (int y = 0; y < 32; y++) {
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < 144; x++)
				sb.append(image.getRGB(x, y) == -16777216 ? " " : image.getRGB(x, y)

						== -1 ? "#" : "*");

			if (sb.toString().trim().isEmpty()) continue;
			System.out.println(sb);
		}

	}

	//--------------EXERCICE 2-----------------


	//_________METHODE1________________
	//Déclaration des variables
	public String str;
	public int n;

	//Constructor
	public StringUtils(String str2, int n2){
		str = str2;
		n = n2;
	}
	
	
	public StringUtils(){
	}

	//Construction de la méthode qui répète n fois la chaine de caractère
	public String repeter(){
		String chaine = "";
		for (int i=0; i<n; i++){
			chaine+=str+" ";
		}
		return chaine;
	}
	
	//____________FIN METHODE 1_____________________
	
	
	
	
	
	//_________METHODE2____________________________
	
	//Construction de la méthode qui répète n fois la chaine de caractère
	
		/*public String repeter(String str, int n){
			String chaine = "";
			for (int i=0; i<n; i++){
				chaine+=str+" ";
			}
			return chaine;
		}*/
	
	//_____________FIN METHODE 2_____________________
	
	
	
	
	

	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	@Override
	public String toString() {
		return "StringUtils [str=" + str + ", n=" + n + "]";
	}


	
	// EXERCICE POUR APPELER DES METHODES
	
	//______________1____________________
	
	public static String transform(String chaine){
		return "###"+chaine+"###";
	}
	
	//______________2____________________
	public int toInt(String chaine){
		return Integer.parseInt(chaine);
	}
	
	
	//______________3____________________
	public String toString(int chaine){
		return Integer.toString(chaine);
	}

	
	
	
	
}


