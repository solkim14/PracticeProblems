/**
* How are duplicate characters found in a string?
*
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;

public class StringDuplicateChars {

	/**
	* O(n)
	*
	* Summary:  iterate through string chars and insert into a hash table, iterate again and check each char against hashtable to check if it contains more than one key
	*			and print it
	*			
	* @param string the string to parse through for duplicates
	*/
	public static void findDuplicates(String string) {
		Map<Character,Integer> map = new HashMap<>();

		if (string==null || string.isEmpty()) {
			System.out.println("No string to parse through :/");
			return;
		}
		
		//insert strings characters into hashmap
		for (int i=0; i<string.length(); i++) {
			char s=string.charAt(i);
			if (map.containsKey(s)) {
				map.replace(s,map.get(s)+1);
			} else {
				map.put(s,1);
			}
		}
				
		//print out duplicate chars
		System.out.print("Duplicate Characters in " + string + ": ");
		for (int j=0; j<string.length(); j++) {
			char dup=string.charAt(j);
			if (map.get(dup)>1) {
				System.out.print(dup + " ");
				map.replace(dup,0);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//String string="";
		String string="whoohoo";
		//String string="boshp";
		//String string="hoboken";
		//String string="upside down bouncing off the ceiling inside out stranger to this feeling";
		
		findDuplicates(string);
	}
}