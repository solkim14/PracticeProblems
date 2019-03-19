/**
* How do you find the sum of two linked lists using Stack?
*
* @version 1.0
*/

import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListStackSum {

	/**
	* O(n)
	*
	* Summary:  Iterate through both given lists and add all nodes to stack. Pop each element off of stack and add to a sum variable until all
	*			elements popped
	*			
	* @param list1 the first list with elements to add using stack
	* @param list2 the second list with elements to add using stack
	* @return sum the sum of all node data from list1 and list2
	*/
	public static int sum(List<Integer> list1, List<Integer> list2) {
		int sum=0;
		Stack<Node> stack = new Stack<>();

		//push all elements of both lists to the stack
		//while()
		//if(list1.)
			
		
		while (stack.empty() != true) {
			int nodeData = stack.pop().getData();
			sum+=nodeData;
		}
		
		return sum;
	}
	


	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(1);
		list1.add(3);
		list1.add(9);

		List<Integer> list2 = new LinkedList<>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(7);
		list2.add(8);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("total sum: " + sum(list1,list2));
	}
}