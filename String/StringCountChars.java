/**
* How do you count the occurrence of a given character in a string?
* 
* @version 1.0
*/

public class StringCountChars {

	/**
	* O(n)
	*
	* Summary:  iterate through string, compare each char with given char. increment a counter to keep track of # of instances
	*			
	* @param string the string to count occurrences for each character
	*/
	public static void countChar(String string, char c) {		
		int counter=0;
		
		for (int i=0; i<string.length(); i++) {
			char current = string.charAt(i);
			if (current==c) counter++;
		}
		System.out.println("# of occurences of " + c + " in " + string + ": " + counter);
	}

	public static void main(String[] args) {
		//String string="";
		//String string="shoopdehwoop";
		String string = "wahoo";
		
		char c = 'o';
		
		countChar(string, c);
	}
}