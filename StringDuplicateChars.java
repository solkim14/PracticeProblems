/**
* How do you print duplicate characters from a string?
*
* @version 1.0
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StringDuplicateChars {

	/**
	* O(n)
	*
	* Summary:  Split string into an array. Loop through the string and put each letter into hashtable.
	*			If already in the table then print (it's a duplicate)
	*			
	* @param string the string you are looking through for duplicate letters
	*/
	public static void printDups(String input) {
		Map<String,Integer> map = new HashMap<>();
		String[] stringArray = input.split("");
		
		System.out.print("Duplicate Character(s): ");
		for (String s : stringArray) {
			if(map.containsKey(s)) {
				if(map.get(s)<1) System.out.print(s + " ");
				map.replace(s,1);
			} else {
				map.put(s,0);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String[] stringArray = input.split("");
		printDups(input);
		//for(String s : stringArray) System.out.print(s + " ");

	}
	

		
}