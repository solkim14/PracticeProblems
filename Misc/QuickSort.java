/**
* How is an integer array sorted in place using
* the quicksort algorithm
*
* @version 1.0
*/

public class QuickSort {

	/**
	* O(logn)
	*
	* Summary:  Divide and conquer; partition array using a "pivot" (last element of array) that divides the array - the left side
	*			smaller than the pivot and the right side larger. Recursively partition the array until sorted
	*		   			
	* @param array the array to be sorted 
	* @param the first index of the array
	* @param the last index of the array
	*/
	public static void quickSort(int[] array, int start, int end) {
		int arraySize = (end+1)-start;
		
		if (arraySize<2) return;
		else {
			int partition=partition(array,start,end);
			quickSort(array,start,partition-1); //smaller than partition array
			quickSort(array,partition+1,end); //bigger than partition array
		}
	}

	public static int partition(int[] array, int start, int end) {		
		int pivot=array[end];
		int i=start-1;
				
		//partition array to smaller and greater than pivot
		for(int j=start; j<end; j++) {
			if(array[j]<=pivot) {
				i++;
				swap(array, i, j);
			}
		}
		int partition = i+1;
		swap(array, partition, end); //put pivot in proper place
		
		return partition;
	}

	private static void swap(int[] array, int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second]=temp;
	}
	
	
	// print array to standard output
    private static void printArray(int[] array) {
        for (int i : array) System.out.print(i + " ");
		System.out.println();
    }
	
	//tests whether array is sorted
    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++)
			if (array[i]<array[i-1]) return false;
        return true;
    }
	
    public static void main(String[] args) {
        int[] array={7,2,1,8,6,3,5,4};
		//int[] array={6,9,12,6,9,2,17,6,1,6};
		//int[] array={6,1,6,2,6,1,6};
		//int[] array={1,2,3};
		//int[] array={2,1};
		//int[] array={};
		
		System.out.print("Unsorted Array: ");
		printArray(array);

		quickSort(array,0,array.length-1);
		
		System.out.print("Sorted Array: ");
		printArray(array);
		
		//test
        if (isSorted(array)) System.out.println("Sorted!");
		else System.out.println("Not sorted :C");
    }
}