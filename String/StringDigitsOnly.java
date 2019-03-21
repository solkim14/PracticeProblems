/**
* How do you check if a string contains only digis?
*
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;

public class StringDigitsOnly {
	/**
	* O(n)
	*
	* Summary:  create an array of all ASCII digit char values. Put into a hashmap. Parse through the string and check each
	*			letter against the digit hashtable. If any are not, then they have a non-digit character. Else, it is all digits.
	*			
	* @param string the string to check for any non-digit characters
	*/
	public static void digitsOnly(String string) {
		Map<Integer,Integer> map = new HashMap<>();
		int[] asciiDigits = {48,49,50,51,52,53,54,55,56,57};

		if (string!=null || !string.isEmpty()) {
			System.out.println("No string to check :'(");
			return;
		}
		
		for (int digit : asciiDigits) map.put(digit,1); //put all ascii digits into hashmap
		
		System.out.println(map);
		
		for (int i=0; i<string.length(); i++) {
			if (!map.containsKey((int)string.charAt(i))) {
				System.out.println("Not all digits :/");
				return;
			}
		}
		System.out.println("All digits :D"); //if you ran the gamut, ya good ;-)
		return;
	}
	
	public static void main(String[] args){
		//String string = "038743109";
		//String string = "870987t878";
		String string = "";
		
		digitsOnly(string);
	}
}