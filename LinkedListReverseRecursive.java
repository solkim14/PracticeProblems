/**
* How do you reverse a linked list?
*
* @version 1.0
*/

public class LinkedListReverseRecursive {
	
	/**
	* O(n)
	*
	* Summary:  recursively iterate through the linked list, keep track of previous element and change next element pointer to point to previous
	*			
	* @param list the Singly Linked List we want to reverse
	* @return reverse the same elements of list but in reverse
	*/
	public static void reverse(SinglyLinkedList list, Node current, Node prev) {
		if(current.next()==null) { //bc: last node
			current.setNext(prev);
			list.setHead(current);
		} else {
			Node next = current.next();
			current.setNext(prev);
			reverse(list, next, current);
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addLast(new Node(1));
		list.addLast(new Node(2));
		list.addLast(new Node(3));
		list.addLast(new Node(4));
		list.addLast(new Node(5));
		list.addLast(new Node(6));
		list.addLast(new Node(7));
		list.addLast(new Node(8));
		list.addLast(new Node(9));
		
		list.display();
		
		reverse(list, list.getFirst(), null);

		list.display();
	}
}