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
	* function definition here
	*/
	public static List<Integer> findPairs(int[] array) {
		Map<Integer,Integer> duplicateCount = new HashMap<Integer,Integer>();
		
		//put all elements in hashtable and count the number of instances of each integer
		for (int element : array) {
			if (duplicateCount.containsKey(element)) {
				duplicateCount.put(element,duplicateCount.get(element)+1);
				//System.out.println(element + " appears " + duplicateCount.get(element) + " times");
			} else {
				duplicateCount.put(element,0);
				//System.out.println("just added " + element);
			}
		}
		
		List<Integer> duplicates = new ArrayList<Integer>(duplicateCount.keySet()); //create a list of each unique int
		
		//remove all elements that are unique so you are left only with duplicate integers
		for (int i=0; i<duplicates.size(); i++) {
			//System.out.print(i);
			//System.out.println(duplicates.get(i));
			if (duplicateCount.get(duplicates.get(i))==0) {
				//System.out.println(duplicateCount.get(duplicates.get(i)));
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