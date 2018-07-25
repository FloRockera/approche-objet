package exercices;

import java.util.List;

public class TestDecoupeur {

	public static void main(String[] args) {

		List<String> list1 = Decoupeur.decoupe("a,b,c,d", ",");

		System.out.println(list1);


	}

}