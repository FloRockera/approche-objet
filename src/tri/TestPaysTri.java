package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class TestPaysTri {

	public static void main(String[] args) {
		
			List <Pays>list = new ArrayList<>();
	        list.add(new Pays("United States of America", 324_811_000, 55_805.204,0));
	        list.add(new Pays("France", 67_795_000, 41_180.697,0));
	        list.add(new Pays("Allemagne", 82_800_000, 45_888.423,0));
	        list.add(new Pays("UK", 65_648_100, 41_158.909,0));
	        list.add(new Pays("Italie", 60_589_445, 35_708,0));
	        list.add(new Pays("Japon", 126_451_398, 41_300,0));
	        list.add(new Pays("Chine", 1_415_140_963, 14_107.431,0));
	        list.add(new Pays("Russie", 146_880_400, 24_026,0));
	        list.add(new Pays("Inde", 1_281_935_911, 5_855.306,0));
	        
	      		
	      		Iterator<Pays> it=list.iterator();
	      		
	     //--------------------------------------------------------
	      		//affichage initial
	      		 while (it.hasNext()){
	                 System.out.println(it.next());
	             }
	     //--------------------------------------------------------
		      		//CompareTo	
	      		 
	      		
	      		 Collections.sort(list);
	      		 
	            it = list.iterator();
	            while (it.hasNext()){
	                System.out.println(it.next());
	            
	            
	      		//--------------------------------------------------------
		      		//Comparator Habitant
	      		 
	      		  Collections.sort(list, new ComparatorHabitant());
	              it = list.iterator();
	              while (it.hasNext()){
	                  System.out.println(it.next());
	              }
	              
	            //--------------------------------------------------------
		      		//Comparator Habitant
	              Collections.sort(list, new ComparatorPibHabitant());
	              it = list.iterator();
	              while (it.hasNext()){
	                  System.out.println(it.next());
	              }
	              
	}

}
}