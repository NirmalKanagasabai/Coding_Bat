package Strings.Easy;

/*

Given a string, if one or both of the first 2 chars is 'x', 
return the string without those 'x' chars, and otherwise return the string unchanged. 
This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

*/

public class E33_withoutX2 {
	
	public static void main (String[] args) {
		System.out.println(withoutX2("xxHi"));
	}
	
	public static String withoutX2(String str) {
	  StringBuffer output = new StringBuffer();
	  
	  if (str.length() >= 1 && str.charAt(0) != 'x') {
	    output.append(str.substring(0, 1));
	  }
	  
	  if (str.length() >= 2) {
	    if(str.charAt(1) != 'x') {
	      output.append(str.substring(1));
	    } else {
	    output.append(str.substring(2));
	    }
	  }

	  return output.toString();
	}
}
