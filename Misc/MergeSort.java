/**
* How is a merge sort algorithm implemented?
*
* @version 1.0
*/

public class MergeSort {

	/**
	* O()
	*
	* Summary:  Halve array until reached a single element, then merge arrays and put in correct place
	*			
	* @param array array to be sorted
	*/
	public static void sort(int[] array) {
		if (array.length <=1) return;
		
		//split given array in half
		int mid = array.length/2;
		
		//make left array
		int[] l = new int[mid];
		for (int i=0; i<l.length; i++) l[i]=array[i];
		//make right array
		int[] r = new int[array.length-mid];		
		for (int j=mid; j<array.length; j++) r[j-mid]=array[j];		
		
		if (l.length < 1) { //if array length is 1 merge
			//merge();
		} else { //keep splitting
			
		}
	}

	/**
	*
	*
	*/
	public static int[] merge() {
		//iterate through both arrays
		//which ever is minimum add to array
		//terminate when reached end of both arrays
		int[] mergedArray = {};
		
		return mergedArray;
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