/**
* How do you implement an insertion sort algorithm?
*
* @version 1.0
*/

//imports

public class InsertionSort {

	/**
	* O(n^2)
	*
	* Summary:  Iterates array and puts each individual element in its ongoing correct place. Inefficient, but good
	*			for mostly sorted arrays
	*			
	* @param array array to be sorted
	*/
	public static void sort(int[] array) {
		//solution logic
	}

	/** helper function - prints given array*/
	public static void printArray(int[] array) {
		if (array.length<1) System.out.println("Array is empty!");
		else {
			for (int i : array) System.out.print(i + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] array = {};
		
		sort(array);
	}
}