package Strings.Medium;

import java.util.Stack;

/*

We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
but "xyx" is not. One 'y' can balance multiple 'x's. 
Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false

*/

public class M8_xyBalance {
	
	public static void main (String[] args) {
		System.out.println(xyBalance("aaxbby"));
	}
	
	public static boolean xyBalance(String str) {
	  Stack<Character> tempStack = new Stack<>();
	  for (int i=0; i<str.length(); i++) {
	    if (str.charAt(i) == 'x') {
	      tempStack.push(str.charAt(i));
	    }
	    
	    if(str.charAt(i) == 'y') {
	      if(tempStack.isEmpty()) {
	    	  continue;
	      } else {
	    	  tempStack.removeAllElements();
	      }
	    }
	  }
	  
	  return tempStack.isEmpty();
	}
}
