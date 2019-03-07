package Strings.Easy;

/*

Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". 
If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

*/

public class E22_lastChars {
	
	public static void main (String[] args) {
		System.out.println(lastChars("last", "chars"));
	}
	
	public static String lastChars(String a, String b) {
		StringBuffer result = new StringBuffer();
		
		if (a.length() >= 1) {
			result.append(a.charAt(0));
		} else {
			result.append("@");
		}
		
		if (b.length() >= 1) {
			result.append(b.charAt(b.length()-1));
		} else {
			result.append("@");
		}
		return result.toString();
	}
}
