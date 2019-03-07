package Strings.Easy;

/*

Given a string, return a version without the first 2 chars. 
Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"

*/

public class E30_deFront {
	
	public static void main (String[] args) {
		System.out.println(deFront("Hello"));
	}
	
	public static String deFront(String str) {
		StringBuffer sb = new StringBuffer();
		if (str.length() >= 2) {
			if(str.charAt(0) == 'a') {
				sb.append('a');
			} 
			
			if (str.charAt(1) == 'b') {
				sb.append('b');
			}
			
			sb.append(str.substring(2));
			return sb.toString();
		} else {
			return "";
		}
	}
}
