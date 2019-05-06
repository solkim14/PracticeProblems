/**
* How do you perform a binary search in a given array?
*
* @version 1.0
*/

//imports

public class BinarySearch {

	/**
	* O(logn) - RECURSIVE
	*
	* Summary:  
	*			
	* @param 
	* @return 
	*
	public static void binarySearch() {
		//solution logic
	}
	*/
    public static void main(String []args){
        //int[] array = {0,1,2,3,4,5};
        int[] array = {0,2,4,6};
        
        //binarySearch(-1,array);
        //binarySearch(0,array);
        //binarySearch(1,array);
        //binarySearch(2,array);
        //binarySearch(3,array);
        binarySearch(4,array);
        //binarySearch(5,array);
        //binarySearch(6,array);
    }

	/**
	* O(logn) - ITERATIVE
	*
	* Summary:  
	*			
	* @param 
	* @return 
	*/	
	public static void binarySearch(int n, int[] array) {
	if (array.length<1) {
		System.out.println("Array is too small! :c");
		return;
	} else {
		int left=0;
		int right=array.length-1;
		
		while (left<=right) {
			int mid = (left+right)/2;
			if (n==array[mid]) {
				System.out.println("WE FOUND IT! AT INDEX " + mid + " ;-)");
				return;
			} else if (n < array[mid]) right=mid-1;
			else left=mid+1;
		}
		System.out.println("It's not here :(");
		return;
	}
	}
	
	
	
	
	
}