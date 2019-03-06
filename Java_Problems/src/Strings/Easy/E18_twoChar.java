package Strings.Easy;

/*

Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

*/

public class E18_twoChar {
	
	public static void main (String[] args) {
		System.out.println(twoChar("Hello", 2));
	}
	
	public static String twoChar(String str, int index) {
		return str.substring(0, n) + str.substring(str.length()-n);
	}

}
