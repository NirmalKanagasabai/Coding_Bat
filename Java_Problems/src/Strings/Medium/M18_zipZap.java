package Strings.Medium;

/*

Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. 
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"

*/

public class M18_zipZap {
	
	public static void main (String[] args) {
		System.out.println(zipZap("zzzopzop"));
	}
	
	public static String zipZap(String str) {
		return str.replaceAll("z[a-zA-Z]p", "zp");
	}
}
