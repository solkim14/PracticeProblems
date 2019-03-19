/**
* How do you find the sum of two linked lists using Stack?
*
* @version 1.0
*/

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
	public static int sum(SinglyLinkedList list1, SinglyLinkedList list2) {
		int sum=0;
		Stack<Node> stack = new Stack<>();

		addToStack(stack,list1);
		addToStack(stack,list2);
		
		while (stack.empty() != true) {
			int nodeData = stack.pop().getData();
			sum+=nodeData;
		}
		
		return sum;
	}
	
	public static void addToStack(Stack<Node> stack, SinglyLinkedList list) {
		Node current=list.getFirst();
		while (current != null) { //iterate through entire list and add to stack
			stack.push(current);
			current=current.next();
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList list1 = new SinglyLinkedList();
		/**
		list1.addLast(new Node(1));
		list1.addLast(new Node(2));
		list1.addLast(new Node(3));
		list1.addLast(new Node(4));
		list1.addLast(new Node(5));
		list1.addLast(new Node(6));
		list1.addLast(new Node(7));
		list1.addLast(new Node(8));
		list1.addLast(new Node(9));*/
		
		SinglyLinkedList list2 = new SinglyLinkedList();
		/**
		list2.addLast(new Node(43));
		list2.addLast(new Node(22));
		list2.addLast(new Node(87));
		list2.addLast(new Node(0));
		list2.addLast(new Node(99));
		list2.addLast(new Node(12));
		list2.addLast(new Node(30));
		list2.addLast(new Node(67));
		list2.addLast(new Node(84));
		*/
		
		list1.display();
		list2.display();
		System.out.println("total sum: " + sum(list1,list2));
	}
}