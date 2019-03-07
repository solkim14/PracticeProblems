/**
* How do you find all pairs of an integer array whose sum
* is equal to a given number?
*
* @version 2.0
* Summary:  Put all elements of array in a Map, loop through all map keys, subract key from given sum to find what int you would
*			need to make the necessary sum, check if the Map contains that integer, if yes: save the pair; if no: keep checking
* Efficiency: O(n)
*
* version 1.0
* Summary:  Sort array, use 2 pointers at start and end to iterate through array and add, any pair equal to the given sum should be
*			saved (in HashMap)
*
* Efficiency: O(nlogn)
*/

//import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class FindPairs {
	
	/**
	* VERSION 2 - O(n)
	* <p>
	* Put all elements of array in a Map, loop through all map keys, subract key from given sum to find what int you would
	* need to make the necessary sum, check if the Map contains that integer, if yes: save the pair; if no: keep checking
	*
	* @param n the sum 2 of the array integers need to add up to
	* @param array the integers to find pairs
	*/
	private static void findPairs(int sum, int[] array) {
		Map<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		
		if (array.length<2) { //if less than 2 elements there is no pair
			System.out.println("Array is too small! No pairs :C");
			return;
		}
		
		for (int element : array) pairs.put(element,null); //put all array elements into hashtable
		
		
		List<Integer> keys = new ArrayList<Integer>(pairs.keySet());
		
		for (int key : array) { //identify the pairs
			int keyNeeded = sum-key;
			if(pairs.containsKey(keyNeeded)) pairs.put(key,keyNeeded);
		}

		System.out.print("pairs that equal sum: ");
		for (int firstPair : keys) {
			if(pairs.get(firstPair) != null) System.out.print("(" + firstPair + "," + pairs.get(firstPair) + ")");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		int sum = 7;
		int[] array = {5,2,4,6,4,9,0,1,3,4,7,8,8,8,8,5,5};
		//int[] array = {5,2};
		//int[] array = {-1};
		//int[] array = {5,3};
		//int[] array = {5,3,3};
		//int[] array = {};
		//int[] array = {-10,-11,-4,1,-2,9};
		findPairs(sum, array);
	}
}

	/**
	* VERSION 1 (OLD) - O(nlogn)
	* @param n the sum 2 of the array integers need to add up to
	* @param array the integers to find pairs
	
	private static void findPairs(int sum, int[] array) {
		Arrays.sort(array);
		
		HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		
		if (array.length<2) { //if there are less than 2 elements there are no pairs
			System.out.println("Array too small! No Pairs!");
			return;
		}
		
		int leftPointer=0;
		int rightPointer=array.length-1;
		
		while (leftPointer<rightPointer) {
			int pairSum = array[leftPointer]+array[rightPointer];
			
			if(pairSum>sum) {
				rightPointer--;
			} else if (pairSum==sum) {//if you find a pair save it
				if(!pairs.containsKey(leftPointer)) {
					pairs.put(array[leftPointer],array[rightPointer]);
				}
				rightPointer--;
			} else {//pairSum<Sum
				leftPointer++;
			}
		}
		
		List<Integer> keySet = new ArrayList<Integer>(pairs.keySet());
		
		if (keySet.size()==0) {
			System.out.println("No pairs :(");
		} else {
			System.out.print("pairs: ");
			for (int i=0; i<keySet.size(); i++) {
				int firstInt=keySet.get(i);
				System.out.print("(" + firstInt + "," + pairs.get(firstInt) + ") ");
			}
			System.out.println();
		}
	}
	*/