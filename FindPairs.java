/**
* How do you find all pairs of an integer array whose sum
* is equal to a given number?
*/

import java.util.Arrays;
import java.util.ArrayList;

public class FindPairs {
	
	/**
	* @param n the sum 2 of the array integers need to add up to
	* @param array the integers to find pairs
	*/
	private static void findPairs(int sum, int[] array) {
		Arrays.sort(array);
		
		ArrayList pairs = new ArrayList();
		
		int leftPointer=0;
		int rightPointer=array.length-1;
		
		while (leftPointer<rightPointer) {
			int pairSum = array[leftPointer]+array[rightPointer];
			
			//System.out.println("pair sum: " + pairSum + " right pointer: " + rightPointer + " left pointer " + leftPointer);
			if(pairSum>sum) {
				rightPointer--;
			} else if (pairSum==sum) {//save pair;
				System.out.println("a pair! " + array[leftPointer] + "," + array[rightPointer]);
				pairs.add(array[leftPointer],array[rightPointer]);
				rightPointer--;
			} else {//pairSum<Sum
				leftPointer++;
			}
			for (int i=0; i<pairs.size(); i++) {
				System.out.print(pairs.remove());
			}
		}
	}
	
	public static void main(String[] args) {
		int sum = 7;
		int[] array = {5,2,4,6,4,9,0,1,3,4,7,8};
		findPairs(sum, array);
	}
}