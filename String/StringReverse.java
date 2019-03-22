/**
* How do you reverse words in a given sentence without using any
* library method?
*
* @version 1.0
*/

//imports

public class StringReverse {

	/**
	* //Time Complexity
	*
	* Summary:  
	*			
	* @param 
	* @return 
	*/
	public static void reverse(String sentence) {
		if (sentence==null || sentence.isEmpty()) {
			System.out.println("nothing to reverse :/");
			return;
		}
		
		String[] array = sentence.split(" ");
		int l = 0;
		int r = array.length-1;
		
		print(array);
		
		while (l<r) {
			swap(array,l,r);
			l++;
			r--;
		}
		print(array);
	}
	
	public static void swap(String[] array, int l, int r) {
		String temp = array[l];
		array[l] = array[r];
		array[r] = temp;
	}
	
	public static void print(String[] array) {
		for (String s : array) System.out.print(s + " ");
		System.out.println();
	}
	

	public static void main(String[] args) {
		String sentence = "";
		//String sentence = " ";
		//String sentence = "  ";
		//String sentence = "i love pie";
		//String sentence = " pie is amazing tho ";
		//String sentence = "If you give a mouse a cookie.";

		reverse(sentence);
	}
}