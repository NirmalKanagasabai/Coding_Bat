package Strings.Medium;

/*

Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true

*/

public class M3_catDog {
	
	public static void main (String[] args) {
		System.out.println(catDog("catdog"));
	}
	
	public static boolean catDog(String str) {
		
		int countOfCats = 0;
		int countOfDogs = 0;
		for (int i=0; i<str.length()-2; i++) {
			if (str.substring(i, i+3).equals("cat")) {
				countOfCats++;
			}
			if (str.substring(i, i+3).equals("dog")) {
				countOfDogs++;
			}
		}
		return countOfCats == countOfDogs;
	}

}
