package Strings.Medium;

/*

Given a string, consider the prefix string made of the first N chars of the string. 
Does that prefix string appear somewhere else in the string? 
Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false

*/

public class M13_prefixAgain {
	
	public static void main (String[] args) {
		System.out.println(prefixAgain("abXYabc", 3));
	}
	
	public static boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		String remainingString = str.substring(n);
		
		if (remainingString.contains(prefix)) {
			return true;
		} else {
			return false;
		}
	}

}
