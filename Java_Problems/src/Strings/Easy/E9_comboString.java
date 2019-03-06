package Strings.Easy;

/*


Given 2 strings, a and b, return a string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"

*/

public class E9_comboString {
	
	public static void main (String[] args) {
		comboString("Hello", "Nirmal");
	}
	
	public static String comboString(String a, String b) {
		
		// Note: The strings are of unequal length. Hence, we aren't considering the case where, aLen == bLen
		int aLen = a.length();
		int bLen = b.length();
		
		if (aLen > bLen) {
			return b + a + b;
		} else {
			return a + b + a;
		}
	}
}
