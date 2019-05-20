/**
* Given n, print out n numbers of the fibonacci sequence
*
* @version 1.0
*/

//imports

public class Fibonacci {

	/**
	* O(n)
	*			
	* @param n the number of digits to add from  the  fibonacci sequence
	*/
	public static void fibonacci(int n) {
		int prev = 0;
		int current = 1;
		if (n>=1) System.out.println(1);
		for (int i=1; i<n; i++) {
			int fib = prev + current;
			System.out.println(fib);
			prev = current;
			current = fib;
		}
	}

	public static void main(String[] args) {
		int n = 12;
		fibonacci(n);
	}
}