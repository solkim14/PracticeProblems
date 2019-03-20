/**
* How do you find the missing number in a given integer
* array of 1 to 100?
*
* @version 1.0
*/

public class ArrayFindMissingInt {
	
	/**
	* O(n)
	*
	* Subtract sum of your array integers from the sum of 1-100 and you will have the value of you r missing integer
	*
	* @param array of consecutive numbers to test
	* @return the missing integer from the array
	*/
	private static int missingInt(int[] array) {
		int sum100 = (10*(10+1))/2;
		int sum = 0;
		
		for(int num : array) {
			sum+=num;
		}
		return sum100-sum;
	}

	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,8,9,10};
		System.out.println("the missing int is " + missingInt(array));
	}
}