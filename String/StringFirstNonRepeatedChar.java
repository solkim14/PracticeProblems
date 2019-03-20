/**
* How do you print the first non-repeated character from a string?
*
* @version 2.0
*/

import java.util.Map;
import java.util.HashMap;

public class StringFirstNonRepeatedChar {

	/**
	* O(n) - CHAR ARRAY SOLUTION (more space efficient)
	*
	* Summary:  count the # of instances of each string using a 256-size character array, incrementing each time the string
	*			is found. loop through character array and print the first character with a "1" count
	*			
	* @param string the string to parse through for the first non-repeated character
	*/
	public static void printFirstNonRepeatedChar(String string) {
		int[] chars = new int[256]; //array of all possible chars

		//loop through string, get charAt, insert into chars array (cast as int)
		for (int i=0; i<string.length(); i++) {
			chars[(int)string.charAt(i)]++;
		}
		
		//loop through string again and print first instance of non-repeated character
		for(int j=0; j<string.length(); j++) {
			if(chars[(int)string.charAt(j)]==1) {
				System.out.println("YOU FOUND THE FIRST NON-REPEATED CHARACTER FROM '" + string + "': " + string.charAt(j));
				return;
			}
		}
		System.out.println("No repeated characters here :'(");
	}

	
	public static void main(String[] args) {
		//String string = "oooowooo";
		String string = "doodoodoop";
		//String string = "";
		//String string = "turnip";
		
		printFirstNonRepeatedChar(string);
	}
	/**
	* O(n) - HASHTABLE SOLUTION
	*
	* Summary:  Split string into an array, keep a count of all strings using hashmap, loop again and check to see the first
	*			array element that only has a count of 1 in hashmap
	*			
	* @param string the string to parse through for the first non-repeated character
	
	public static void printFirstNonRepeatedChar(String string) {
		Map<String, Integer> map = new HashMap<>();
		
		if(string.equals("")) {
			System.out.println("It's blank! :O No characters to repeat :/");
			return;
		}
		
		String[] splitString = string.split(""); //split string into array
		
		for (String s : splitString) { //add all string chars to hashmap
			if (map.containsKey(s)) map.replace(s,map.get(s)+1);
			else map.put(s,1);
		}
		System.out.println(map);
		
		for (String findDup : splitString) {
			if(map.get(findDup)==1) {
				System.out.println("YOU FOUND THE FIRST NON-REPEATED CHARACTER FROM '" + string + "': " + findDup);
				return;
			}
		}
		System.out.println("No repeated characters here :'(");
		return;
	}
	*/
}