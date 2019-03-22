/**
* How do you reverse words in a given sentence without using any
* library method?
*
* @version 1.0
*/

//imports

public class StringReverse {

	/**
	* O(n) - NO LIBRARY
	*
	* Summary:  split string, loop through, and swap until you reach the middle
	*			
	* @param sentence the string to reverse
	*/
	public static void reverse(String sentence) {
		if (sentence==null || sentence.isEmpty()) {
			System.out.println("nothing to reverse :/");
			return;
		}
		
		String[] array = sentence.split(" ");		
		print(array);
		
		for (int i=0; i<array.length/2; i++) {
			String temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		print(array);
	}
	
	public static void print(String[] array) {
		for (String s : array) System.out.print(s + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		//String sentence = "";
		//String sentence = " ";
		//String sentence = "  ";
		//String sentence = "i love pie";
		//String sentence = " pie is amazing tho ";
		String sentence = "if you give a mouse a cookie";

		reverse(sentence);
	}
	
	/**
	* O(n) - USING LIBRARY AND NO POINTERES
	*
	* Summary:  split string into a string array, loop through the array starting at the last index and print
	*			
	* @param sentence the string to reverse
	
	public static void reverse(String sentence) {
		if (sentence==null || sentence.isEmpty()) {
			System.out.println("nothing to reverse :/");
			return;
		}
		
		String[] array = sentence.split(" ");
		print(array);

		for (int i=array.length-1; i>0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void swap(String[] array, int l, int r) {
		String temp = array[l];
		array[l] = array[r];
		array[r] = temp;
	}
	*/
	
	
	/**
	* O(n) - USING LIBRARY AND POINTERS
	*
	* Summary:  using 2 pointers, put one at the beginning, one and the end, swap, and then increment both pointers
	*			towards the middle and repeat until they meet
	*			
	* @param sentence the string to reverse
	
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
	*/
}