/**
* How can a given string be reversed using recursion?
*
* @version 2.0
*/

import java.lang.StringBuilder;

public class StringReversedRecursive {

	/**
	* O(n) - RECURSIVE
	*
	* Summary:  Split string into an array, use two pointers are the first and last element, swap and iterate towards the middle
	*			until pointers meet. Then reassemble string using StringBuilder
	*			
	* @param 
	* @return 
	*/
	public static String[] reverse(String[] stringArray, int left, int right) {
		if (left>=right) {
			return;
		}	
		return swap(reverse(stringArray,left++,right--),left,right);
	}
	
	public static void swap(String[] stringArray, int left, int right) {
		String temp = stringArray[left];
		stringArray[left]=stringArray[right];
		stringArray[right]=temp;
	}

	public static void main(String[] args) {
		String string="shoopdehwoop";
		//String string = "wahoo";
		//reverseNonRecursive(string);
		
		String[] stringArray = string.split("");
		reverse(stringArray,0,stringArray.length-1);
		StringBuilder sb = new StringBuilder();
		for(String s:stringArray) sb.append(s);
		System.out.println(sb.toString());
	}
	
	/**
	* O(n) - NOT RECURSIVE
	*
	* Summary:  Split string into an array, use two pointers are the first and last element, swap and iterate towards the middle
	*			until pointers meet. Then reassemble string using StringBuilder
	*			
	* @param 
	* @return 
	
	public static void reverseNonRecursive(String string) {
		String[] chars = string.split("");
		int left=0;
		int right=string.length()-1;
		
		while (left<right) {
			swap(chars,left,right);
			left++;
			right--;
		}
		
		StringBuilder sb = new StringBuilder();
		for(String s:chars) sb.append(s);
		System.out.println(sb.toString());
	}
	*/
}