/**
* How do you find duplicate numbers in an array if it contains
* multiple duplicates?
*
* @version 1.0
*/

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class FindPairs {

	/**
	* O(n)
	*
	* Summary:  Add all integers and their counts to a hash table. Create a list of the keys. Loop through the keys
	*			and remove any that only occur once. You will be left with only duplicate integers and return
	* @param array the array to parse for duplicate integers
	* @return duplicates a list of the integers with duplicate values in array
	*/
	public static List<Integer> findPairs(int[] array) {
		Map<Integer,Integer> duplicateCount = new HashMap<Integer,Integer>();
		
		//put all elements in hashtable and count the number of instances of each integer
		for (int element : array) {
			if (duplicateCount.containsKey(element)) {
				duplicateCount.put(element,duplicateCount.get(element)+1);
			} else {
				duplicateCount.put(element,0);
			}
		}
		
		List<Integer> duplicates = new ArrayList<Integer>(duplicateCount.keySet()); //create a list of each unique int
		
		//remove all elements that are unique so you are left only with duplicate integers
		for (int i=0; i<duplicates.size(); i++) {
			if (duplicateCount.get(duplicates.get(i))==0) {
				duplicates.remove(i);
				i--; //accomodate from removing elements
			}
		}
		return duplicates;
	}

	public static void main(String[] args) {
		//int[] array = {};
		int[] array = {4, -1, 22, 79, -3};
		//int[] array = {4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,8,9};
		List<Integer> duplicates = new ArrayList<Integer>(findPairs(array));
		
		//print out all duplicate integers
		if (duplicates.size() == 0) {
			System.out.println("No duplicates :(");
		} else {
			System.out.print("There are duplicates of the following integers: ");
			for (int duplicate : duplicates) System.out.print(duplicate + " ");
			System.out.println();
		}
	}
}