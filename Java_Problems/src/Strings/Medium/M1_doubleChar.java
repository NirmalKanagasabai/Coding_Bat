package Strings.Medium;

/*

Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"

*/

public class M1_doubleChar {
	
	public static void main (String[] args) {
		System.out.println(doubleChar("The"));
	}
	
	public static String doubleChar(String str) {
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<str.length(); i++) {
			sb.append(str.charAt(i));
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
}
