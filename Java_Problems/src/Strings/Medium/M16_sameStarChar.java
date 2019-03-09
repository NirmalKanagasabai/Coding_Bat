package Strings.Medium;

/*

Returns true if for every '*' (star) in the string, 
if there are chars both immediately before and after the star, they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true

*/

public class M16_sameStarChar {
	
	public static void main (String[] args) {
		System.out.println(sameStarChar("xy*zzz"));
	}
	
	public static boolean sameStarChar(String str) {
		boolean result = false;
		for (int i=1; i<str.length()-1; i++) {
			if (str.charAt(i) == '*') {
				if (str.charAt(i-1) == str.charAt(i+1)) {
					result = true;
				} else {
					result = false;
				}
			}
		}
		return result;
	}
}
