package Strings.Easy;

/*

Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

*/

public class E17_nTwice {
	
	public static void main (String[] args) {
		System.out.println(nTwice("Hello", 2));
	}
	
	public static String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length()-n);
	}
}
