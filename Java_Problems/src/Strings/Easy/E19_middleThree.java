package Strings.Easy;

/*

Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"

*/

public class E19_middleThree {
	
	public static void main (String[] args) {
		System.out.println(middleThree("Candy"));
	}
	
	public static String middleThree(String str) {
		
		// Math.round : Rounds to the closest int / long value 
		int middle = Math.round(str.length()/2);
		
		// 'middle' of a string of length 5 => 3
		// We are expected to return characters 2, 3 and 4
		// Hence, substring(middle-1, middle+2) 
		// Note: middle+2 is not included
		return str.substring(middle-1, middle+2); 		
	}

}
