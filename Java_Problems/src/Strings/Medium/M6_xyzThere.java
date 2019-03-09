package Strings.Medium;

/*

Return true if the given string contains an appearance of "xyz" 
where the xyz is not directly preceeded by a period (.). 
So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true

*/

public class M6_xyzThere {
	
	public static void main (String[] args) {
		System.out.println(xyzThere("xyz.abc"));
	}
	
	public static boolean xyzThere(String str) {
		  boolean output = false;
		  if(str.startsWith("xyz")) {
		    output = true;
		  } else {
		      for (int i=1; i<str.length()-2; i++) {
		      if(str.substring(i, i+3).equals("xyz")) {
		        if (str.charAt(i-1) == '.') {
		          output = false;
		        } else {
		          output = true;
		        }
		      } else {
		        output = false;
		      }
		    }
		  }
		  
		  return output;
	}
}
