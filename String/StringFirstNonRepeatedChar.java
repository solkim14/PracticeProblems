/**
* How do you print the first non-repeated character from a string?
*
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;

public class StringFirstNonRepeatedChar {

	/**
	* //Time Complexity
	*
	* Summary:  
	*			
	* @param 
	* @return 
	*/
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

	public static void main(String[] args) {
		//String string = "oooowooo";
		String string = "doodoodoop";
		//String string = "";
		//String string = "turnip";
		
		printFirstNonRepeatedChar(string);
	}
}