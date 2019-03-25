/**
* How can a given string be reversed using recursion?
*
* @version 2.0
*/

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
	public static String reverse(String string) {
		if (string==null || string.length()<=1) return string;
		return reverse(string.substring(1)) + string.charAt(0);
	}

	public static void main(String[] args) {
		String string="shoopdehwoop";
		//String string = "wahoo";
		//reverseNonRecursive(string);
		
		System.out.println(reverse(string));
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