/**
* How do you check if two strings are a rotation of each other? 
*
* @version 1.0
*/

//imports

public class StringRotation {

	/**
	* O(n) - clever solution (found online)
	*
	* Summary:  concatenate rotation string to itself and check if it contains original string. if so it is a rotation
	*			
	* @param original
	* @param rotation
	*/
	public static void checkRotation(String original, String rotation) {
		if (original.length() != rotation.length()) { //different lengths so not possible
			System.out.println("Not even close >.>");
			return;
		}
		
		if (original.equals(rotation)) {  //the same string
			System.out.println("The same string! So... a rotation :D");
			return;
		}
		
		String doubleRotation = rotation+rotation;
		if (doubleRotation.contains(original)) System.out.println("A ROTATION!");
		else System.out.println("not a rotation");
	}

	public static void main(String[] args) {
		//String string1="buttock";
		//String string2="tockbut";
		
		//String string1="whoopdoo";
		//String string2="doowhoo";

		String string1="whoohoo";
		String string2="owhooho";
		
		//String string1="uranus";
		//String string2="saturn";
		
		checkRotation(string1,string2);
	}
	
	/**
	* O(n^2) - my solution
	*
	* Summary:  iterate through the second string. if you encounter the first character of the first string then with its
	*			index i to the end of the string check if substring(i to n-1)+substring(0 to i-1) == first string it is a
	*			rotation. if not keep searing for first char. if all fails then not a rotation			
	* @param	string1 the first string to check for rotation
	* @param	string2 the second string to check for rotation
	
	public static void checkRotation(String string1, String string2) {
		if (string1.length()!=string2.length()) {
			System.out.println("def not rotations B-(");
			return;
		}
		
		char firstChar = string1.charAt(0);
		
		//iterate through string chars
		for (int i=0; i<string2.length(); i++) {
			if (string2.charAt(i)==firstChar) {
				if ((string2.substring(i,string2.length())+string2.substring(0,i)).equals(string1)) {
					System.out.println("yes! :D");
					return;
				}
			}
		}
		System.out.println("no :(");
	}
	*/
}