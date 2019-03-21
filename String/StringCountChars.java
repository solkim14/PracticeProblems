/**
* How do you count the occurrence of a given character in a string?
* 
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;

public class StringCountChars {

	/**
	* O(n)
	*
	* Summary:  create a hashmap, iterate through the string for each character add to the hashmap (increment if more than one instance). then print hashmap
	*			
	* @param string the string to count occurrences for each character
	*/
	public static void countChars(String string) {
		Map<Character,Integer> map = new HashMap<>();
		
		for (int i=0; i<string.length(); i++) {
			char c = string.charAt(i);
			if (map.containsKey(c)) map.replace(c,map.get(c)+1);
			else map.put(c,1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		//String string="";
		//String string="shoopdehwoop";
		String string = "wahoo";
		
		countChars(string);
	}
}