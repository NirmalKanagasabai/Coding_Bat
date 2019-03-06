package Strings.Easy;

/*

Given a string of even length, return the first half. 
So the string "WooHoo" yields "Woo"

*/

public class E7_firstHalf {
	
	public static void main (String[] args) {
		firstHalf("WooHoo");
	}
	
	public static String firstHalf(String str) {
	  int length = str.length();
	  if (length >= 2) {
	    return str.substring(0, str.length()/2);
	  } else {
	    return str;
	  }
	}
}
