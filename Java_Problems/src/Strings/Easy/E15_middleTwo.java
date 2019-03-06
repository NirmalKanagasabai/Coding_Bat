package Strings.Easy;

/*

Given a string of even length, 
return a string made of the middle two chars, so the string "string" yields "ri". 
The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"

*/

public class E15_middleTwo {
	
	public static void main (String[] args) {
		middleTwo("string");
	}
	
	public static String middleTwo(String str) {
		int middle = str.length()/2;
		return str.substring(middle-1, middle+1);
	}
}
