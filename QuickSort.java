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
	* Summary:  Divide and conquer; partition array using a "pivot" (last element of array) that divides the array - the left side
	*			smaller than the pivot and the right side larger. Recursively partition the array until sorted
	*		   			
	* @param 
	* @return 
	*/
	public static void quickSort(int[] array, int start, int end) {
		if(end-start<2) {
			return;
		} else {
			int partition = partition(array,start,end);
			System.out.println(partition);
			//int partition = partition()
			quickSort(array,start,partition-1); //smaller than partition
			quickSort(array,partition+1,end); //larger than partition
		}
	}
	
	public static int partition(int[] array, int start, int end) {		
		int pivot=array[end];
		int l=start;
		int r=end-1;
		
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
		
		//System.out.println("pivot : " + pivot);
		
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
		int[] array={7,2,1,8,6,3,5,4};
		//int[] array={6,9,12,6,9,2,17,6,1,6};
		//int[] array={6,1,6,2,6,1,6};
		
		int start = 0;
		int end = array.length-1;
		quickSort(array,start,end);
		
		for (int i : array) System.out.print(i+" ");
	}
}