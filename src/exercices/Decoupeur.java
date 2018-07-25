package exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Decoupeur {

	public static List<String> decoupe(String chaine, String delimiteur){
		
		List<String> liste = new ArrayList<>();
		StringTokenizer tokenizer = new StringTokenizer(chaine, delimiteur);
		while (tokenizer.hasMoreElements()){
			liste.add(tokenizer.nextToken());
		}
		return liste;
	}
}