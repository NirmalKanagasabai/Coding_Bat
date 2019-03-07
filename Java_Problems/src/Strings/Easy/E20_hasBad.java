package Strings.Easy;

/*

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
such as with "badxxx" or "xbadxx" but not "xxbadxx". 
The string may be any length, including 0. 
Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false

*/

public class E20_hasBad {
	
	public static void main (String[] args) {
		System.out.println(hasBad("badxx"));
	}
	
	public static boolean hasBad(String str) {
		if ((str.length() >= 3) && (str.charAt(0) == 'b' || str.charAt(1) == 'b' && str.contains("bad"))) {
			return true;
		} else {
			return false;
		}
	}

}
