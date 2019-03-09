package Strings.Medium;

/*

Given two strings, word and a separator sep, 
return a big string made of count occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"

*/

public class M12_repeatSeparator {
	
	public static void main (String[] args) {
		System.out.println(repeatSeparator("Word", "X", 3));
	}
	
	public static String repeatSeparator(String word, String sep, int count) {
		StringBuffer output = new StringBuffer();
		
		for (int i=0; i<count; i++) {
			output.append(word);
			if(i != count-1) {
				output.append(sep);
			}
		}
		return output.toString();
	}

}
