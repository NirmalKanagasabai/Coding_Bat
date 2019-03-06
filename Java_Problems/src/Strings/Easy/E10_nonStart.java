package Strings.Easy;

/*

Given a string, return a version without the first and last char, so "Hello" yields "ell". 
The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"

*/

public class E10_nonStart {
	
	public static void main (String[] args) {
		comboString("Hello", "World");
	}
	
	public static String comboString(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		
		if (aLen > bLen) {
			return b + a + b;
		} else {
			return a + b + a;
		}
	}
}
