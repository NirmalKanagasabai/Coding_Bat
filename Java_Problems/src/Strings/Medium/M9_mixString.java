package Strings.Medium;

/*

Given two strings, a and b, create a bigger string made of the first char of a, 
the first char of b, the second char of a, the second char of b, and so on. 
Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

*/

public class M9_mixString {
	
	public static void main (String[] args) {
		System.out.println(mixString("xxxx", "There"));
	}
	
	public static String mixString(String a, String b) {
	  StringBuffer output = new StringBuffer();
	  int aLen = a.length();
	  int bLen = b.length();
	  
	  if (aLen > bLen) {
		  output.append(prepareLargerString(a, b, bLen));
		  output.append(a.substring(bLen));
	  } else {
		  output.append(prepareLargerString(a, b, aLen));
		  output.append(b.substring(aLen));
	  }
	  return output.toString();
	}
	
	public static String prepareLargerString(String a, String b, int len) {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<len; i++) {
			sb.append(a.charAt(i));
			sb.append(b.charAt(i));
		}
		
		return sb.toString();
	}

}
