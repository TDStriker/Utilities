package Strings;

//Utility class for working with String variables
public class StaticString {
	/**
	 * Static method to convert a String to an Integer
	 * @param str: String variable to convert to an Integer
	 * @return Integer value that the String was converted to. Returns 0 if String is not numeric
	 */
	public static int stringToInt(String str) {
		int sign = 1;
		if(str.charAt(0) == '-') {
			sign = -1;
			str = str.substring(1);
		}
		try{ //check to make sure string is numeric
			return Integer.parseInt(str) * sign;
		} catch(NumberFormatException nfe) {
			return 0; 
		}
	}
}
