/**
* How do you check if two strings are anagrams of each other?
*
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class StringAnagram {

	/**
	* O(n)
	*
	* Summary:  Split both strings. Loop through first string and add all letters to hashtable, keeping count of each letter
	*			Loop through the second string and remove all string letters from hash table. If all values in hashtable
	*			are 0 then the two strings are anagrams
	*			
	* @param string1 the first string to check against string2
	* @param string2 the second string to check against string1
	* @return isAnagram
	*/
	public static Boolean isAnagram(String string1, String string2) {
		boolean isAnagram=false;
		Map<String,Integer> map = new HashMap<>();
		String[] array1 = string1.split("");
		String[] array2 = string2.split("");
		
		//add all letters of first string to hashtable
		for (String i : array1) {
			if (map.containsKey(i)) map.replace(i,map.get(i)+1);
			else map.put(i,1);
		}
		
		//System.out.println(map);
		
		//remove all letters of second string to hashtable
		for (String j : array2) {
			if (map.containsKey(j)) map.replace(j,map.get(j)-1);
			else return isAnagram; //if there is a letter in string2 not in string1 it is not an anagram
		}
				
		//System.out.println(map);
		
		//check values to make sure there are an equal number of letters in each string
		Collection<Integer> values = map.values();
		Iterator<Integer> iterator = values.iterator();
		//System.out.println(values);
		while(iterator.hasNext()) {
			if (iterator.next() != 0) return isAnagram;
		}
		
		isAnagram=true; //if you passed all the tests it is true
		
		return isAnagram; 
	}

	public static void main(String[] args) {
		String string1 = "stressed";
		String string2 = "desserts";
		
		//String string1 = "weeaboo";
		//String string2 = "koreaboo";
		
		//String string1="";
		//String string2="";
		
		if(isAnagram(string1,string2)) {
			System.out.println(string1 + " and " + string2 + " are anagrams :D!");
		} else {
			System.out.println(string1 + " and " + string2 + " are NOT anagrams :C!");
		}
	}
}