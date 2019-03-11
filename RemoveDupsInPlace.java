/**
* How do you remove duplicates from an array in place?
*
* @version 1.0
*/

import java.util.Arrays;

public class RemoveDupsInPlace {

	/**
	* O(nlogn)
	*
	* Summary: Sort array, iterate through and check the "next" element for each array. If it is the same then shift all elements
	*		   after to the left. 
	* @param array the array we will remove duplicates from
	* @return noDups the same array but with unique integers 
	*/
	private static void removeDups(int[] array) {
		if (array.length < 2) {
			System.out.println("Array is too small! No duplicates!");
		} else {
			Arrays.sort(array); //sort array
			System.out.println("Array WITHOUT duplicates: ");
			printArray(array,array.length); //print array with duplicates
			
			//remove duplicates
			int length=array.length;
			for (int i=0; i<length-1; i++) {
				//System.out.println("current element is: " + array[i]);
				if(array[i]==array[i+1]) {
					//System.out.println("a duplicate found! " + array[i+1]);
					//System.out.println("going to move these to the left");
					for (int j=i+1; j<array.length; j++) {
						//System.out.print(array[j] + " ");
						array[j-1]=array[j];
					}
					length--;
					//System.out.println();
				}
			}
			System.out.println("Array WITHOUT duplicates: ");
			printArray(array,length); //print array without duplicates
		}
	}
	
	private static void printArray(int[] array,int length) {
		for (int i=0; i<length; i++) System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		//int[] array = {};
		int[] array = {4,6,8,1,9,4,2,2};
		//int[] array = {2,3,1};
		removeDups(array);
	}
}