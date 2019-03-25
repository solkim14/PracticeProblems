/**
* How do you check if a given string is a palindrome?
*
* @version 1.0
*/

public class StringPalindrome {

	/**
	* O(n)
	*
	* Summary:  clean up the string, removing spaces and case characters; iterate through string to check if
	*			first and last characters are equal, iterating towards the middle until either a difference is found
	*			or palindrome is confirmed
	*			
	* @param string string to be checked for a palindrome
	*/
	public static void isPalindrome(String string) {
		if (string==null || string.isEmpty()) { System.out.println("Nothin' here :("); return; }
		
		string = string.replaceAll("\\s+","").toLowerCase();
		//System.out.println(string);
		
		for (int i=0; i<string.length()/2; i++) {
			if (string.charAt(i)!=string.charAt(string.length()-1-i)) {
				System.out.println("YA WRONG 8C");
				return;
			}
		}
		//System.out.println(string);
		System.out.println("YA RIGHT! :D");
	}

	public static void main(String[] args) {
		//String string = null;
		//String string = "";
		//String string = "buttock";
		String string = "Do geese see God";
		//String string = "racecar";
		
		isPalindrome(string);
	}
}