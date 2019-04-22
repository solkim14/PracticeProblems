/**
* How is a bubble sort algorithm implemented?
* 
* @version 1.0
*/

public class BubbleSort {

	/**
	* O(n^2)
	*
	* Summary:  keep looping through the array and swapping if right element is greater than left. stop when entire array is sorted
	*			
	* @param array the array to be sorted
	*/
	public static void bubbleSort(int[] array) {
		for (int i=0; i<array.length; i++) { //loop array.length number of times
			for (int j=1; j<array.length-i; j++) { //each iteration you can do 1 less element because you have the last element in its place
				if (array[j-1]>array[j]) swap(j-1,j,array);
			}
		}
	}
	
	public static void swap(int left, int right, int[] array) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	public static void print(int[] array) {
		for (int i : array) System.out.print(i + " ");
		System.out.println();
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

		bubbleSort(array);
		print(array);
	}
	
	/**
	* O(n^2) - (BASIC ATTEMPT)
	*
	* Summary:  keep looping through the array and swapping if right element is greater than left. stop when entire array is sorted
	*			
	* @param array the array to be sorted
	*/
	public static void bubbleSortMe(int[] array) {
		if (array.length<=1) return; //sorted
		else {
			boolean sorted = false;
			while (!sorted) {
				int count = 0;
				for (int i=1; i<array.length; i++) { //iterate through and swap left and right if out of order
					if (array[i-1] > array[i]) {
						swap(i-1,i,array);
						count++;
					}
				}
				if (count == 0) sorted = true; //if we didn't have to do any swaps we're done
			}
		}
	}
}