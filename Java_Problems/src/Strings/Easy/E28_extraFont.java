package Strings.Easy;

/*

Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"

*/

public class E28_extraFont {
	
	public static void main (String[] args) {
		System.out.println(extraFont("Hello"));
	}
	
	public static String extraFont(String str) {
		if (str.length() >= 2) {
			String firstTwoChars = str.substring(0, 2);
			return firstTwoChars + firstTwoChars + firstTwoChars;
		} else {
			return str + str + str;
		}
	}
}
