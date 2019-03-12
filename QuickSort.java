/**
* How is an integer array sorted in place using
* the quicksort algorithm
*
* @version 1.0
*/

//imports

public class QuickSortInPlace {

	/**
	* //Time Complexity
	*
	* Summary:  
	*			
	* @param 
	* @return 
	*/
	public static void quickSort() {
		//solution logic
	}
	
	public static int partition() {//int left, int right) {
		//int[] array={7,2,1,8,6,3,5,4};
		//int[] array={6,9,12,6,9,2,17,6,1,6};
		//int[] array={6,1,6,2,6,1,6};
		
		//int partition=array[right];
		//int l=left;
		//int r=right-2;
		int partition=array[array.length-1];
		int l=0;
		int r=array.length-2;
		
		//printPositions(array, l, r);
		
		while(l<=r) {
			if (array[l]>partition && array[r]<=partition) { //swap
				int temp = array[l];
				array[l] = array[r];
				array[r] = temp;
			}
			if (array[l]<=partition) {
				l++;
			}
			if (array[r]>partition) {
				r--;
			}
			//printPositions(array, l, r);
		}
		//swap partition and l
		array[array.length-1]=array[l];
		array[l] = partition;
		
		System.out.println("partition : " + partition);
		
		//printPositions(array, l, r);

		
		return partition;
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