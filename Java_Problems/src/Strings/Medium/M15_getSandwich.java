package Strings.Medium;

/*

A sandwich is two pieces of bread with something in between. 
Return the string that is between the first and last appearance of "bread" in the given string, 
or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""

*/

public class M15_getSandwich {
	
	public static void main (String[] args) {
		System.out.println(getSandwich("breadjambread"));
	}
	
	public static String getSandwich(String str) {
		
		if (str.length() < 10) {
			return "";
		}
		
		if (!str.contains("bread")) {
			return "";
		}
		
		int leftIndex = str.indexOf("bread");
		int rightIndex = str.lastIndexOf("bread");
		
		return str.substring(leftIndex+5, rightIndex);
	}
}
