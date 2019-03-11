/**
* How are duplicates removed from a given array in Java?
*
* @version 1.0
*/

import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicatesJava {

	/**
	* O(n)
	*
	* Summary: Add all elements of array into a HashSet to remove duplicates, convert to an array, and return 
	*			
	* @param array the array from which we want to remove duplicates
	* @return noDups contains all unique integers from array 
	*/
	public static void removeDups(int[] array) {
		//display all array elements
		System.out.println("Array with Dups: ");
		for (int element : array) System.out.print(element + " ");
		System.out.println();
		
		//remove duplicates
		Set<Integer> set = new HashSet<>();
		for (int i : array) set.add(i);
		
		//convert set to array
		Integer[] withoutDups = new Integer[set.size()];
		withoutDups = set.toArray(withoutDups);
		
		//display array without duplicates
		System.out.println("Array without Dups: ");
		for (int j : withoutDups) System.out.print(j + " ");
		System.out.println();
		
		return;
	}

	public static void main(String[] args) {
		//function call
		//int[] array = {};
		int[] array = {5,4,3,8,9,8,12};
		removeDups(array);
	}
}