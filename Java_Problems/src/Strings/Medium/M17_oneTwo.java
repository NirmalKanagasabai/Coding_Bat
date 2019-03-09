package Strings.Medium;

/*

Given a string, compute a new string by moving the first char to come after the next two chars, 
so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". 
Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"

*/

public class M17_oneTwo {
	
	public static void main (String[] args) {
		System.out.println(oneTwo("bcaefdxy"));
	}
	
	public static String oneTwo(String str) {
		int length = str.length();
		StringBuffer sb = new StringBuffer();
		if (length < 3) {
			sb.append(str);
		} else {
			System.out.println("STR: " + str);
			for (int i=0; i<length-2; i=i+3) {
				String threeCharString = str.substring(i, i+3);
				System.out.println("Three Char String: " + threeCharString);
				sb.append(threeCharString.substring(1, 3));
				sb.append(threeCharString.charAt(0));
			}
			//sb.append(str.substring(length - length % 3));
		}
		return sb.toString();
	}
}
