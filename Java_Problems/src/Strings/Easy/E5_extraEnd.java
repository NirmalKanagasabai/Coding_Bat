package Strings.Easy;

/*

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"

*/

public class E5_extraEnd {
	
	public static void main (String[] args) {
		System.out.println(extraEnd("Hello"));
	}
	
	public static String extraEnd(String str) {
		String lastTwoChars = str.substring(str.length()-2);
		return lastTwoChars + lastTwoChars + lastTwoChars;
	}
}
