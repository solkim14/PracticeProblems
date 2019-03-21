/**
* How do you count a number of vowels and consonants in a given string?
*
* @version 1.0
*/

import java.lang.Character;
import java.util.Map;
import java.util.HashMap;

public class StringVowelsConsonants {

	/**
	* O(n)
	*
	* Summary:  create a hashmap of vowels, iterate through the string and check if the character is a letter. if it is check if the character in the
	*			hashmap. if so it is a vowel. if not it is a consonant 
	* @param 
	*/
	public static void countLetters(String string) {
		int vowelCount=0;
		int consonantCount=0;
		
		//create a hashmap of vowels
		Map<Character,Integer> vowels = new HashMap<>();
		vowels.put('a',1);
		vowels.put('e',1);
		vowels.put('i',1);
		vowels.put('o',1);
		vowels.put('u',1);
		
		for (int i=0; i<string.length(); i++) {
			char c = string.charAt(i);
			if (Character.isLetter(c)) {
				if (vowels.containsKey(c)) vowelCount++;
				else consonantCount++;
			}
		}
		System.out.println("Consonants: " + consonantCount + " Vowels: " + vowelCount);
	}

	public static void main(String[] args) {
		//String string="";
		//String string="11294kjjo;ihoih";
		String string="i like trains";
		
		countLetters(string);
	}
}