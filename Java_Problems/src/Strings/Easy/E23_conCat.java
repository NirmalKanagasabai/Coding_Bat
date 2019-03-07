package Strings.Easy;

/*

Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"

*/

public class E23_conCat {
	
	public static void main (String[] args) {
		System.out.println(conCat("dog", "cat"));
	}
	
	public static String conCat(String a, String b) {
		StringBuffer sb = new StringBuffer();
		
		if (a.length() >= 1 && b.length() >= 1 && a.charAt(a.length()-1) == b.charAt(0)) {
			sb.append(a);
			sb.append(b.substring(1));
		} else {
			sb.append(a);
			sb.append(b);
		}
		
		return sb.toString();
	}
}
