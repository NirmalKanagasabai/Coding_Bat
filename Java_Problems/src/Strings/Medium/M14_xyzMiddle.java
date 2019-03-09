package Strings.Medium;

/*

Given a string, does "xyz" appear in the middle of the string? To define middle, 
we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. 
This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

*/

public class M14_xyzMiddle {
	
	public static void main (String[] args) {
		System.out.println(xyzMiddle("AAxyzBB"));
	}
	
	public static boolean xyzMiddle(String str) {
		int length = str.length();
		boolean result = false;
		if (length < 3) {
			result = false;
		} else {
			for (int i=0; i<length-2; i++) {
				if (str.substring(i, i+3).equals("xyz")) {
					int leftOfXYZ = i;
					int rightOfXYZ = (length - 1) - (i + 2);
					if (Math.abs(leftOfXYZ - rightOfXYZ) <= 1) {
						result = true;
						return result;
					} else {
						result = false;
					}
				}
			}
		}
		return result;
	}
}
