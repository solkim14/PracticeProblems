/**
* How do you implement an insertion sort algorithm?
*
* @version 1.0
*/

public class InsertionSort {

	/**
	* O(n^2)
	*
	* Summary:  Iterates array and puts each individual element in its ongoing correct place by comparing
	*			to the previous element and swapping. Inefficient, but good for mostly sorted arrays
	*			
	* @param array array to be sorted
	*/
	public static void sort(int[] array) {
		if (array.length<=1) return; //already sorted
		for (int i=0; i<array.length; i++) {
			int j=i;
			int temp = array[i];
			while (j>0 && temp<array[j-1]) {
				array[j] = array[j-1];
				j--;
			}	
			array[j] = temp;
		}
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
		//int[] array = {};
		//int[] array = {1};
		//int[] array = {2,1};
		//int[] array = {1,2};
		//int[] array = {2,3,1};
		//int[] array = {1,2,3};
		int[] array = {4,0,9,7,2,2,0,7};
		//int[] array = {1,0,0,8,7,3,0,9,8,7,6,0,3,7,5,0,9,2,3,0,1};
		printArray(array);
		sort(array);
		printArray(array);
	}
}