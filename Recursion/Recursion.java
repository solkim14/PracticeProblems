/**
* I need to get my recursion life together -.-
*/

import java.util.Arrays;

public class Recursion {
	/** Find n-th power of 10 */
	public static int nPowerOfTen(int n) {
		if (n==0) return 1;
		if (n==1) return 10;
		return 10*nPowerOfTen(n-1);
	}
	
	public static int factorial(int n) {
		if (n==1) return 1;
		return n*factorial(n-1);
	}
	
	public static int sum(int[] array) {
		if (array.length==1) return array[0];
		return array[0] + sum(Arrays.copyOfRange(array,1,array.length));
	}

	public static void main(String[] args) {
		//nPowerOfTen
		System.out.println(nPowerOfTen(3));
		
		//factorial
		System.out.println(factorial(9));
		
		//sum
		System.out.println(sum(new int[] {1,2,3,4}));
	}
}