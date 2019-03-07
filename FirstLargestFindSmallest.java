/**
* How do you find the largest and smallest number in an
* unsorted integer array?
*
* @version 1.0
*/

public class FirstLargestFindSmallest {

	/**
	* O(n)
	*
	* loop through array, have integers that hold the smallest and largest elements, test each element to see if it is
	* smaller or larger than the current smallest and largest elements and update accordingly
	*
	* @param array from which you are looking for the smallest and largest element
	*/
	public static void firstLargestFindSmallest(int[] array) {
		if (array.length<1) {
			System.out.println("Array is empty! No smallest or largest int :/");
			return;
		}
		
		int smallest=array[0];
		int largest=array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i]<smallest) {
				smallest = array[i];
			} else if(array[i]>largest) {
				largest = array[i];
			}
		}
		System.out.println("Smallest: "+smallest);
		System.out.println("Largest: "+largest);
		return;
	}
	public static void main(String[] args) {
		int[] array = {1,2,0,-33, 22, 1000, 300, -4, 8};
		firstLargestFindSmallest(array);
	}
}