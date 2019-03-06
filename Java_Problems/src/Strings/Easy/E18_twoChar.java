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
		
		int len = str.length();
		if (index > 0 && len >= index+2) {
		  return str.substring(index, index+2);
		} else {
		  return str.substring(0, 2);
		}
		
	}

}
