/**
* How do you reverse an array in place in Java?
*
* @version 1.0
*/

public class ReverseArrayInPlace {

	/**
	* O(n)
	*
	* Summary:  Swap the first and last elements of the array w/ two points (one at beginning, one at end) and 
	*			both pointers crawl towards the center and keep swapping until they meet
	*
	* @param array to reverse elements
	*/
	private static void reverseArray(int[] array) {
		int left=0; //left pointer
		int right=array.length-1;
		
		if(array.length<2) return; //array is too small to reverse
		while(left<right) swap(array,left++,right--);
	}
	
	private static void swap(int[] array, int left, int right) {
		int temp=array[left];
		array[left]=array[right];
		array[right]=temp;
	}
	
	private static void printArray(int[] array) {
		for(int element : array) System.out.print(element + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		//int[] array = {2,4,7,8,3};
		int[] array = {2,4,7,8,3,5};
		//int[] array = {};
		//int[] array = {2};
		
		System.out.print("Array: ");
		printArray(array);
		
		reverseArray(array);
		
		System.out.print("Reverse Array: ");
		printArray(array);
	}
}