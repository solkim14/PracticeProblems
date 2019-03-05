/**
* How do you find the largest and smallest number in an
* unsorted integer array?
*/

public class FirstLargestFindSmallest {

	/**
	* O(n)
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