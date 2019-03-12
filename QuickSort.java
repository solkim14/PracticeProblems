/**
* How is an integer array sorted in place using
* the quicksort algorithm
*
* @version 1.0
*/

//imports

public class QuickSort {

	/**
	* O(logn)
	*
	* Summary:  Divide and conquor; partition array using a "pivot" (last element of array) that divides the array - the left side
	*			smaller than the pivot and the right side larger. Recursively partition the array until sorted
	*		   			
	* @param 
	* @return 
	*/
	public static void quickSort() {
		//solution logic
	}
	
	public static int partition() {//int left, int right) {
		//int[] array={7,2,1,8,6,3,5,4};
		int[] array={6,9,12,6,9,2,17,6,1,6};
		//int[] array={6,1,6,2,6,1,6};
		
		//int pivot=array[right];
		//int l=left;
		//int r=right-2;
		int pivot=array[array.length-1];
		int l=0;
		int r=array.length-2;
		
		//printPositions(array, l, r);
		
		while(l<=r) {
			if (array[l]>pivot && array[r]<=pivot) { //swap
				int temp = array[l];
				array[l] = array[r];
				array[r] = temp;
			}
			if (array[l]<=pivot) {
				l++;
			}
			if (array[r]>pivot) {
				r--;
			}
			//printPositions(array, l, r);
		}
		//swap pivot and l
		array[array.length-1]=array[l];
		array[l] = pivot;
		
		System.out.println("pivot : " + pivot);
		
		//printPositions(array, l, r);
		return pivot;
	}
	
	public static void printPositions(int[] array, int l, int r) {
		for(int i=0; i<array.length; i++) {
			System.out.print(" ");
			if (i==l) {
				System.out.print("l:" + array[i]);
			} else if (i==r) {
				System.out.print("r:" + array[i]);
			} else if (i==array.length-1) {
				System.out.print("pivot:" + array[i]);
			} else {
				System.out.print(array[i]);
			}
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		partition();
	}
}