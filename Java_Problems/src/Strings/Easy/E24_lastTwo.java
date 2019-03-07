package Strings.Easy;

/*

Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"

*/

public class E24_lastTwo {
	
	public static void main (String[] args) {
		System.out.println(lastTwo("coding"));
	}
	
	public static String lastTwo(String str) {
		int length = str.length();
		if (length >= 2) {
			return str.substring(0, length-2) + str.charAt(length-1) + str.charAt(length-2);
		} else {
			return str;
		}
	}
}
