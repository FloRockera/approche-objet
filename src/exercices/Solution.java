package exercices;

import java.util.Arrays;

public class Solution {

	public static boolean isFunny(String s) {
		String rev = reverse(s);
		boolean stillEq = true;
		for (int i = 2; i < s.length() && stillEq; ++i) {
			int comp = (int) s.charAt(i) - (int) s.charAt(i - 1);
			int comp2 = (int) rev.charAt(i) - (int) rev.charAt(i - 1);
			stillEq = Math.abs(comp) == Math.abs(comp2);
		}

		if (stillEq)
			return true;
		else
			return false;
	}

	public static String reverse(String s) {
		if (s.length() > 0)
			return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
		else
			return "";
	}

	public int levenshtein(String x, String y) {
		if (x.isEmpty()) {
			return y.length();
		}

		if (y.isEmpty()) {
			return x.length();
		}

		int substitution = levenshtein(x.substring(1), y.substring(1)) + costOfSubstitution(x.charAt(0), y.charAt(0));
		int insertion = levenshtein(x, y.substring(1)) + 1;
		int deletion = levenshtein(x.substring(1), y) + 1;

		return min(substitution, insertion, deletion);
	}

	public int costOfSubstitution(char a, char b) {
		return a == b ? 0 : 1;
	}

	public int min(int... numbers) {
		return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
	}
}
