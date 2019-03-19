/**
* How do you reverse a linked list?
*
* @version 1.0
*/

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListReverse2 {

	/**
	* O(n)
	* Reversing the linked list using build in linked in class and Collections reverse function
	*/
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
	}
}