package Strings.Easy;

/*

Given a string, if the first or last chars are 'x', 
return the string without those 'x' chars, 
and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

*/

public class E32_withoutX {
	
	public static void main (String[] args) {
		System.out.println(withoutX("xHix"));
	}
	
	public static String withoutX(String str) {
		StringBuilder sb = new StringBuilder();
		
		if (str.length() > 1) {
  		if (str.startsWith("x")) {
  		  sb.append(str.substring(1, str.length()-1));
  		} else {
  		  sb.append(str.substring(0, str.length()-1));
  		}
  		
  		if (!str.endsWith("x")) {
  		  sb.append(str.substring(str.length()-1));
  		}
		} else if (str.length() == 1 && str.charAt(0) != 'x') {
		  sb.append(str);
		} else {
		  return "";
		}
		
		return sb.toString();
	}
}
