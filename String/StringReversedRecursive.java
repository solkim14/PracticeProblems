/**
* How can a given string be reversed using recursion?
*
* @version 1.0
*/

import java.lang.StringBuilder;

public class StringReversedRecursive {

	/**
	* O(n)
	*
	* Summary:  Split string into an array, use two pointers are the first and last element, swap and iterate towards the middle
	*			until pointers meet. Then reassemble string using StringBuilder
	*			
	* @param 
	* @return 
	*/
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
	
	public static void swap(String[] chars, int left, int right) {
		String temp = chars[left];
		chars[left]=chars[right];
		chars[right]=temp;
	}

	public static void main(String[] args) {
		String string = "wahoo";
		reverseNonRecursive(string);
	}
}