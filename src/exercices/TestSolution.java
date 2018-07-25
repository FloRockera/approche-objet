package exercices;

public class TestSolution {

	public static void main(String[] args) {
		

	Boolean a = Solution.isFunny("hello");
	System.out.println(a);
	
	String b = Solution.reverse("coucou");
	System.out.println(b);
	
	Solution c = new Solution();
	int result = c.costOfSubstitution('a','b');
	System.out.println(result);
	
	Solution d = new Solution();
	int i = d.min(123);
	System.out.println(i);
	
	Solution m = new Solution();
	int distance = m.levenshtein("12", "5");
	System.out.println(distance);
	
	}

}
