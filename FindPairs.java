/**
* How do you find all pairs of an integer array whose sum
* is equal to a given number?
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class FindPairs {
	
	/**
	* O(nlogn)
	* @param n the sum 2 of the array integers need to add up to
	* @param array the integers to find pairs
	*/
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
	
	public static void main(String[] args) {
		int sum = 7;
		int[] array = {5,2,4,6,4,9,0,1,3,4,7,8,8,8,8,5,5};
		//int[] array = {5,2};
		//int[] array = {-1};
		//int[] array = {5,3};
		//int[] array = {5,3,3};
		//int[] array = {};
		findPairs(sum, array);
	}
}