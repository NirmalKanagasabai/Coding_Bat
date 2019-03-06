package Strings.Easy;

/*

Given a string, return a version without the first and last char, so "Hello" yields "ell". 
The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"

*/

public class E8_withoutEnd {
	
	public static void main (String[] args) {
		withoutEnd("Hello");
	}
	
	public static String withoutEnd(String str) {
		return str.substring(1, str.length()-1);
	}
}
