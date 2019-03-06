package Strings.Easy;

/*

Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!

*/

public class _0_helloName {
	
	public static void main (String[] args) {
		helloName("Bob");
	}
	
	public static String helloName(String name) {
		  return "Hello " + name  + "!";
	}
}
